package empregado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import empregado.conexao.Conexao;
import empregado.entidade.Departamento;

public class DepartamentoDAO {
	private Connection connection;
	private PreparedStatement ps;
	private String sql;
	private Conexao conexao;
	private ResultSet rs;
	
	public DepartamentoDAO() {
		conexao = new Conexao();
	}
	
	//método para inserir um departamento para o banco de dados
	
	public void inserir(Departamento departamento) {
		sql = "insert into java_departamento(id,nome) values(?, ?)";
		
		try(Connection connection = conexao.conectar()){
			ps = connection.prepareStatement(sql);
			ps.setInt(1, departamento.getId());
			ps.setString(2, departamento.getNome());
			ps.execute();
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	
	//método para verificar se um departamento existe
	
	public boolean pesquisar(Departamento departamento) {
		boolean aux = false;
		
		sql = "select * from java_departamento where id = ? or nome  = ?";
		try(Connection connection = conexao.conectar()){
			ps = connection.prepareStatement(sql);
			ps.setInt(1, departamento.getId());
			ps.setString(2, departamento.getNome());
			rs = ps.executeQuery();
			if(rs.next()) {
				aux = true;
			}
			rs.close();
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
		return aux;
		
	}
	
	

}
