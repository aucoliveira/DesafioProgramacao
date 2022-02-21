import java.util.Scanner;

public class ExercicioUm {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner (System.in);
		
		String caract = " ";
		String arvore = "*";
		
		System.out.print("Informe o tamanho da árvore desejada: ");
		int tamanho = scanner.nextInt();
		int l = tamanho - 1;
		
		for (int i = 0; i< tamanho; i++) {
			
			for (int k = 0; k < l; k++) {
				
				System.out.print(caract);
			}
			
			System.out.println(arvore);
			arvore = arvore + "*";
			l--;
		}
		
	}	
}
