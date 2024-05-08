package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exibir{

	public static void exibirDados() throws SQLException{
	
		//url de conexao
		String url = "jdbc:mysql://localhost:3306/crud";
		String user = "root";
		String password = "dbadmin";
		
		//objeto de conexão
		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);
		
		//código mysql para inserção
		String sql = "SELECT * FROM empresa";
		Statement st = conexao.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		System.out.println("--------------EMPRESAS--------------");
		while(rs.next()) {
			System.out.println("[ID: " + rs.getInt("id") 
				+ ", CNPJ: " + rs.getString("cnpj" ) 
				+ ", Nome: " + rs.getString("nome") 
				+ ", Endereço: " + rs.getString("endereco") 
				+ ", E-mail: " + rs.getString("email") + "]");
			System.out.println(" ");
		}
		
		conexao.close();
	}
}
