import java.sql.SQLException;
import java.util.List;

import br.edu.ifpb.poo2.dao.AlunoDAO;
import br.edu.ifpb.poo2.model.Aluno;

public class Main {

	public static void main(String[] args) {
		
		AlunoDAO alunoDAO = new AlunoDAO();
		
		System.out.println("Inserindo novo aluno");
		
		Aluno aluno = new Aluno();
		aluno.setIdade(23);
		aluno.setMatricula("2131321321");
		aluno.setNome("Fagner");
		aluno.setCre(9.6f);
		try {
			alunoDAO.adicionarAluno(aluno);
		} catch (SQLException e) {
			System.err.print("Falha ao salvar aluno");
			e.printStackTrace();
		}
		
		System.out.println("Listando alunos");
		
		try {
			List<Aluno> alunos = alunoDAO.listarAlunos(10);
			System.out.println("Nome dos alunos presentes na aula");
			for (Aluno a : alunos) {
				System.out.println(a.getNome());
			}
		} catch (SQLException e) {
			System.err.print("Falha ao ler os alunos");
			e.printStackTrace();
		}
		
		
	}
	
}
