import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	private String login = "rm94251";
	private String senha = "291101";
	private Connection connection;
	
	public Connection conectar() {
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, login, senha);
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o driver\n" + e);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar no banco de dados\n" + e);
			
		}
		
		return connection;
		
	}

}
