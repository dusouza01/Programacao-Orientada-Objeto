package br.fiap.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fiap.entidade.Cargo;
import br.fiap.entidade.Funcionario;



public class FuncionarioDAO extends DAO {

	// método para inserir um funcionário na base de dados
	public void inserir(Funcionario funcionario) {
		sql = "insert into java_funcionario values(funcionario_sequence.nextval, ?, ?, ?)";

		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			ps.setDouble(2, funcionario.getSalario());
			ps.setInt(3, funcionario.getCargo().getId());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar funcionário\n" + e);
		}
	}
	
	 static final int valor = 10;

	// método para retornar a lista de funcionários
	public List<Funcionario> listar(){
		
		List<Funcionario> lista = new ArrayList<>();
		sql = "select * from java_funcionario order by nome";
		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Funcionario func = new Funcionario();
				func.setId(rs.getInt("id_funcionario"));
				func.setNome(rs.getString("nome"));
				func.setSalario(rs.getDouble("salario"));
				int id = rs.getInt("id_cargo");
				Cargo cargo = null;
				
				for(Cargo c : Cargo.values()) {
					if(c.getId() == id) {
						cargo = c;
						
					}
				}
				func.setCargo(cargo);
				lista.add(func);
			}
			ps.close();
			rs.close();
			connection.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar funcionário\n" + e);
		}
		
		
		
		return lista;
		
		
	}
	
}
