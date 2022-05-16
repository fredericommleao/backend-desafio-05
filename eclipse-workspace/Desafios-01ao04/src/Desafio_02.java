import java.util.Scanner;

public class Desafio_02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double numero; int quosciente, resto, nota, moeda;
		
		System.out.println("Digite o valor:");
		numero = in.nextDouble();

		resto = (int) (numero * 100.0 + 0.5);

		System.out.println("NOTAS:");

		nota = 100;
		quosciente = resto / (nota * 100);
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 50;
		quosciente = resto / (nota * 100);
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 20;
		quosciente = resto / (nota * 100);
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 10;
		quosciente = resto / (nota * 100);
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 5;
		quosciente = resto / (nota * 100);
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 2;
		quosciente = resto / (nota * 100);
		System.out.println(quosciente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		System.out.println("MOEDAS:");

		moeda = 100;
		quosciente = resto / moeda;
		System.out.println(quosciente + " moeda(s) de R$ 1.00");
		resto = resto % moeda;

		moeda = 50;
		quosciente = resto / moeda;
		System.out.println(quosciente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;

		moeda = 25;
		quosciente = resto / moeda;
		System.out.println(quosciente + " moeda(s) de R$ 0.25");
		resto = resto % moeda;

		moeda = 10;
		quosciente = resto / moeda;
		System.out.println(quosciente + " moeda(s) de R$ 0.10");
		resto = resto % moeda;

		moeda = 5;
		quosciente = resto / moeda;
		System.out.println(quosciente + " moeda(s) de R$ 0.05");
		resto = resto % moeda;

		System.out.println(resto + " moeda(s) de R$ 0.01");
	}
}