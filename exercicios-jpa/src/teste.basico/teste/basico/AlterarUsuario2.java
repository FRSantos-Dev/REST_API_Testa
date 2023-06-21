package teste.basico;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();//Devido ao estado transacional(gerenciado) vai atualizar os dados, mesmo sem o merge.




        Usuario usuario = em.find(Usuario.class, 1L);//Busca o usuario com o id 1 no banco de dados
        usuario.setNome("Ricardo");

        //em.merge(usuario);//Atualiza o usuario no banco de dados

        em.getTransaction().commit();//Efetivar a transação no banco de dados.

        em.close();
        emf.close();

    }
}
