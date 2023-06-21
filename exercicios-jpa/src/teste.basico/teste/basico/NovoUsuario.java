package teste.basico;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
        .createEntityManagerFactory("exercicios-jpa");//EntityManagerFactory responsavel por criar o EntityManager
        EntityManager em = emf
        .createEntityManager();//EnityManager responsavel por fazer as operações no banco de dados(inserção,consulta,atualização,remoção)//Encpsula a conexão

        Usuario novoUsuario = new Usuario("Rudolf", "cupertino.ict@condor.com.br");
        novoUsuario.setId(1L);

        em.getTransaction().begin();//Inicia a transação
        em.persist(novoUsuario);//Insere o objeto no banco de dados
        em.getTransaction().commit();//Efetivar a transação no banco de dados.

        System.out.println("O id gerado foi: " + novoUsuario.getId());

        em.close();//Fecha o EntityManager
        emf.close();//Fecha o EntityManagerFactory
    }

}
