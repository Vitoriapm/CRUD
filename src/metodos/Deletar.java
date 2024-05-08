package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletar {

	public static void deletar() throws SQLException{
		Scanner sc = new Scanner(System.in);
	
		//url de conexao
		String url = "jdbc:mysql://localhost:3306/crud";
		String user = "root";
		String password = "dbadmin";
		
		//objeto de conexão
		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);
		
		//código mysql para update
		String sql = "DELETE FROM empresa WHERE id = ?";
		PreparedStatement st = conexao.prepareStatement(sql);
		
		//atualizar os valores
		System.out.println("Qual o ID da empresa que você deseja excluir? ");
		String id = sc.nextLine();
		
		//adicionar os valores no banco
		st.setString(1, id);
		st.executeUpdate();
		
		System.out.println("Os dados foram deletados com sucesso!");
		
		st.close();
		sc.close();
	}
	
	
}
