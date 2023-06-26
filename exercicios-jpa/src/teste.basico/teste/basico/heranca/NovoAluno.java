package teste.basico.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

    public static void main(String[] args) {
        
        DAO<Aluno> dao = new DAO<>();

        Aluno aluno1 = new Aluno(123L, "Jão");
        AlunoBolsista aluno2 = new AlunoBolsista(345L, "Bia", 1000.0);

        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();
    }
    
}
