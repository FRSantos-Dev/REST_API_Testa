package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {


public static void main(String[] args) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();//Inicia a transação

    Usuario usuario = em.find(Usuario.class, 3L);//Busca o usuario com o id 1 no banco de dados
    usuario.setNome("Ricardo");
    usuario.setEmail("ricardo.silva@ict.com.br");

    em.merge(usuario);//Atualiza o usuario no banco de dados

    em.getTransaction().commit();//Efetivar a transação no banco de dados.

    em.close();
    emf.close();
}
}