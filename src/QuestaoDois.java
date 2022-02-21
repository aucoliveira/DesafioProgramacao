import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestaoDois {

	public static void main(String[] args) {
		
		Scanner scanner =   new Scanner(System.in);
		System.out.println("Bem-vind@ ao cadastro da S0ci@l");
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Muto bem "+nome+", agora digite sua senha: ");
		String senha = scanner.nextLine();
		
		Pattern pattern = Pattern.compile(senha);
		Matcher matcher = pattern.matcher(senha);
		
		testaSenha(senha);
			
	}
	/*
	 * Verifica se na string informada existe algum numero
	 */
	public static boolean verificaNumber (String senha) {
		boolean valor = true;
		
		for (int i = 0; i < senha.length(); i++) { 
			
		    if (!Character.isAlphabetic((senha.charAt(i)))) { 
		    	valor =  false;
		        return valor;
		    } 
		}
		return valor;
	}
	/*
	 * Criei esse método verificaCharEspecial passando um array com os caracteres 
	 * disponíveis para a criação da senha, aonde é verificado se existe pelo menos um
	 * caracteres e retorna true se sim, e false para não
	 */
	public static boolean verificaCharEspecial(String senha) {
		
		boolean verifica = false;
		String[] carac = {"!","@","#","$","%","^","&","*","(",")","-","+"};	
				
				for (int i =0; i < senha.length(); i++) {
					
					for (int j = 0; j < 12; j++) {
						
						String testa = String.valueOf(senha.charAt(i));
										
						if (testa.equalsIgnoreCase(carac[j])) {
							verifica = true;
							return verifica;							
							
						}
						
					}
				}
				return verifica;
	}
	
	// método criado para testar os valores da senha correspodem com o que foi pedido
	public static void testaSenha(String senha) {
		
		if (!(senha.length() >= 6)) {
			System.out.println("Sua senha só contem "+senha.length()+
					" caracteres, ficou faltando "+(6 - senha.length())+" para o tamanho exigido.");
		}else if (verificaNumber(senha)) {
			
			System.out.println("A senha tem que conter um dígito numerico.");
		}else if (!(senha.matches(".*[a-z].*"))) {
			
			System.out.println("A senha tem que conter pelo menos"
					+ " um caractere minusculo.");
		}else if (!(senha.matches(".*[A-Z].*"))) {
			
			System.out.println("A senha tem que conter pelo menos um caractere maiúsculo");
		}else if (!(verificaCharEspecial(senha))) {
			System.out.println("A senha não contem caracteres especiais.");
		}else {
			System.out.println("Senha cadastrada com sucesso.");		}
		
	}
	
	
	
	private static String valueOf(char charAt) {
		// TODO Auto-generated method stub
		return null;
	}


}
