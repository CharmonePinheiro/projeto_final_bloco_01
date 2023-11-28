package Adega;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                ADEGA DO CHARMONE               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Bebida                          ");
			System.out.println("            2 - Procurar Bebida               ");
			System.out.println("            3 - Listar Bebidas            ");
			System.out.println("            4 - Atualizar Bebida             ");
			System.out.println("            5 - Remover Bebida                         ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nAdega Do Charmone!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar Bebida \n\n");

					break;
				case 2:
					System.out.println("Procurar Bebida\n\n");

					break;
				case 3:
					System.out.println("Listar Bebidas\n\n");

					break;
				case 4:
					System.out.println("Atualizar Bebida\n\n");

					break;
				case 5:
					System.out.println("Remover Bebida \n\n");

					break;
				case 6:
					System.out.println("Sair  \n\n");

					default:
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		
		System.out.println("Projeto Desenvolvido por: Charmone Dionatas");
		
		
		System.out.println("*********************************************************");
	}
}
