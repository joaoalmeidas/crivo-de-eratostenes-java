import java.util.Scanner;

public class CrivoDeErastotenes {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		boolean[] primos = new boolean[1000];
		
		
		System.out.println("O Crivo de Erastótenes\n"
				+ "Esse programa exibe os números primos de 0 a 1000 utilizando o Crivo de Erastótenes para solucionar esse problema.\n"
				+ "Para isso, foi criado um array de booleans chamado \"primos\", que contém 1000 posições, todas elas setadas como \"true\"\n"
				+ "Então um laço de repetição percorre esse array, procurando pelos índices que contém a sua posição setada como \"true\"\n"
				+ "Se um determinado índice for \"true\", significa que ele é primo, e seus multiplos não são primos, então o indice que \n"
				+ "foi encontrado como \"true\", permanece como \"true\", e os seus multiplos são definidos como \"false\", pois os multiplos\n"
				+ "não são divisiveis apenas por 1 e por ele mesmo.\n"
				+ "No final são exibidos os números primos até 1000.\n"
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
		
		System.out.printf("Números primos de 2 a 999:\n");
		
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
