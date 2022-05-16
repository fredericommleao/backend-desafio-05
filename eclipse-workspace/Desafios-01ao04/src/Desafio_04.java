import java.util.Scanner ;

public class Desafio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite a quantidade de linhas:");
		Scanner in = new Scanner(System.in);
		
		String linha = "";

		int testes = in.nextInt();
		
		while (testes-- != -1)
		{
			linha = in.nextLine();
			int metade = linha.length() % 2 + linha.length() / 2;

			for (int i = metade-1; i >= 0; i--)
			{
				System.out.print(linha.charAt(i));
				
			}

			for (int i = linha.length() - 1; i >= metade; i--)
			{
				System.out.print(linha.charAt(i));
				
			}
			
			System.out.print("\n");

		}
	}
}
