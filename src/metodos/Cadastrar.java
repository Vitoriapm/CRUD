package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import entidades.Empresas;

public class Cadastrar {

	public static void inserir() throws SQLException{
		Scanner sc = new Scanner(System.in);
	
		//url de conexao
		String url = "jdbc:mysql://localhost:3306/crud";
		String user = "root";
		String password = "dbadmin";
		
		//objeto de conexão
		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);
		
		//código mysql para inserção
		String sql = "INSERT INTO empresa(cnpj, nome, endereco, email)"
				+ "VALUES (?, ?, ?, ?)";
		PreparedStatement ps = conexao.prepareStatement(sql);
		
		//receber os valores da empresa
		System.out.println("CNPJ: ");
		String cnpj = sc.nextLine();
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Endereço: ");
		String endereco = sc.nextLine();
		
		System.out.println("E-mail: ");
		String email = sc.nextLine();
		
		//objeto que contém os valores da empresa
		Empresas empresa = new Empresas(cnpj, nome, endereco, email);
		
		//adicionar os valores no banco
		ps.setString(1, empresa.getCnpj());
		ps.setString(2, empresa.getNome());
		ps.setString(3, empresa.getEndereco());
		ps.setString(4, empresa.getEmail());
		
		//executar o código sql
		ps.executeUpdate();
		
		System.out.println("Empresa cadastrada com sucesso!");
		
		ps.close();
		sc.close();
	}
}
