package programa;

import java.sql.SQLException;
import java.util.Scanner;
import metodos.Cadastrar;
import metodos.Deletar;
import metodos.Editar;
import metodos.Exibir;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Cadastre sua empresa já! \nEscolha uma opção: "
				+ "\n1. Cadastrar \n2. Editar \n3. Exibir Empresas"
				+ "\n4. Deletar");
		int escolha = sc.nextInt();
		
		switch(escolha) {
			case 1: 
				//cadastrar empresas
				try {
					Cadastrar.inserir();
					System.out.println(" ");
					Exibir.exibirDados();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			break;
			
			case 2:
				//atualizar empresas
				try {
					Exibir.exibirDados();
					System.out.println(" ");
					Editar.editar();
					System.out.println(" ");
					Exibir.exibirDados();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case 3:
				//exibir empresas
				try {
					Exibir.exibirDados();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case 4:
				//deletar empresas
				try {
					Exibir.exibirDados();
					System.out.println(" ");
					Deletar.deletar();
					System.out.println(" ");
					Exibir.exibirDados();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
		}
		
		sc.close();
	}
}
