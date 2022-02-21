import java.lang.reflect.Array;
import java.util.*;

public class QuestaoTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Infome uma palavra: ");
		String palavra = scanner.nextLine();

		System.out.println("Quantidade de caracteres: "+palavra.length());


		int[] posicaoAnagrama = new int[palavra.length()];
		int[][] posicoes = new int[palavra.length()][palavra.length()];
		
 		ArrayList<String> lista = new ArrayList<>();

		String palavraTest;
		String novaPalavra;
		int l = 0;
		for (int i = 0; i < palavra.length(); i++) {

			for (int j = i; j < palavra.length(); j++) {
				palavraTest = palavra.substring(j+1,palavra.length());
				novaPalavra = palavra.substring(i,j);
				System.out.println("Testando: "+palavraTest + " "+ novaPalavra);
				if (novaPalavra.contains(palavraTest)) {
					System.out.println(novaPalavra);
					lista.add(novaPalavra);
					posicaoAnagrama[l] = i;
					posicaoAnagrama[l+1]= j;

				}

				if (novaPalavra.length()+1 < palavra.length()) {
					novaPalavra = palavra.substring(i, j + 1);
					if (novaPalavra.contains(palavraTest)) {
						System.out.println(novaPalavra);
						lista.add(novaPalavra);
						posicaoAnagrama[l] = i;
						posicaoAnagrama[l+1]= j;
						posicaoAnagrama[l+2]= j+1;
					}
				}
			}
		}
		for (String palavras: lista) {
			System.out.println(palavras);
		}
		System.out.println(posicaoAnagrama);

		
		}

}
