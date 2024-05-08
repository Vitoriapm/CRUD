package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Editar {

	public static void editar() throws SQLException{
		Scanner sc = new Scanner(System.in);
	
		//url de conexao
		String url = "jdbc:mysql://localhost:3306/crud";
		String user = "root";
		String password = "dbadmin";
		
		//objeto de conexão
		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);
		
		//atualizar dados
		System.out.println("Quais dos dados você deseja editar? "
				+ "\n1. CNPJ \n2. Nome \n3. Endereço \n4. E-mail");
		int escolha = sc.nextInt();
		
		System.out.println("Selecione o ID da empresa a ser atualizada: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		PreparedStatement st = null;
		
		//código mysql para update
		switch(escolha) {
			case 1:
				st = conexao.prepareStatement("UPDATE empresa SET cnpj = ? WHERE id = ?");
				System.out.println("CNPJ: ");
				String cnpj = sc.nextLine();
				st.setString(1, cnpj);
				st.setInt(2, id);
				break;
			
			case 2:
				st = conexao.prepareStatement("UPDATE empresa SET nome = ? WHERE id = ?");
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				st.setString(1, nome);
				st.setInt(2, id);
				break;
			
			case 3:
				st = conexao.prepareStatement("UPDATE empresa SET endereco = ? WHERE id = ?");
				System.out.println("Endereço: ");
				String endereco = sc.nextLine();
				st.setString(1, endereco);
				st.setInt(2, id);
				break;
			
			case 4:
				st = conexao.prepareStatement("UPDATE empresa SET email = ? WHERE id = ?");
				System.out.println("E-mail: ");
				String email = sc.nextLine();
				st.setString(1, email);
				st.setInt(2, id);
				break;
			
			default:
				System.out.println("Essa opção não existe!");
		}
		
		st.executeUpdate();
		
		System.out.println("Os dados foram atualizados com sucesso!");
		
		st.close();
		sc.close();
	}
	
	
}
