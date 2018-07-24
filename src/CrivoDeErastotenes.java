import java.util.Scanner;

public class CrivoDeErastotenes {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		boolean[] primos = new boolean[1000];
		
		
		System.out.println("O Crivo de Erast�tenes\n"
				+ "Esse programa exibe os n�meros primos de 0 a 1000 utilizando o Crivo de Erast�tenes para solucionar esse problema.\n"
				+ "Para isso, foi criado um array de booleans chamado \"primos\", que cont�m 1000 posi��es, todas elas setadas como \"true\"\n"
				+ "Ent�o um la�o de repeti��o percorre esse array, procurando pelos �ndices que cont�m a sua posi��o setada como \"true\"\n"
				+ "Se um determinado �ndice for \"true\", significa que ele � primo, e seus multiplos n�o s�o primos, ent�o o indice que \n"
				+ "foi encontrado como \"true\", permanece como \"true\", e os seus multiplos s�o definidos como \"false\", pois os multiplos\n"
				+ "n�o s�o divisiveis apenas por 1 e por ele mesmo.\n"
				+ "No final s�o exibidos os n�meros primos at� 1000.\n"
				+ "Pressione Enter para iniciar o programa.");
		
		input.nextLine();
		
		for(int i = 0; i < primos.length; i++){
			primos[i] = true;
		}
		
		
		for(int i = 2; i < primos.length; i++){
			if(primos[i] == true){
				for(int j = i + i; j < primos.length; j += i){
					primos[j] = false;
				}
			}
		}
		
		System.out.printf("N�meros primos de 2 a 999:\n");
		
		for(int i = 2; i < primos.length; i++){
			if(i%100 == 0){
				System.out.println();
			}
			if(primos[i] == true){
				
				System.out.printf("%d ", i);
			}
		}

	}

}
