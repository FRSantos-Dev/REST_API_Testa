package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 3L);//Busca o usuario com o id 1 no banco de dados

        if(usuario != null) {
            em.getTransaction().begin();//Começa a trnasação no banco de dados
            em.remove(usuario);//Remove o usuario no banco de dados
            em.getTransaction().commit();//Efetivar a transação no banco de dados.
        }

        em.close();
        emf.close();
    }
}
