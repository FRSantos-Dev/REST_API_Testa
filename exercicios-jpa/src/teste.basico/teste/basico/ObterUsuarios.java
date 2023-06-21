package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");

        EntityManager em = emf.createEntityManager();

        String jpql = "SELECT u from Usuario u";//Consults em cimas dos atributos da classe(objetos em si).
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);//TypedQuery é uma consulta tipada, ou seja, retorna um objeto do tipo Usuario.
        query.setMaxResults(5);//Limita o numero de resultados da consulta

        List<Usuario> usuarios = query.getResultList();//Retorna uma lista de usuarios

        for (Usuario usuario : usuarios) {//Percorre a lista de usuarios.Para cada usuario na lista de usuarios
            System.out.println("ID: " + usuario.getId() + " E-mail: " + usuario.getEmail());
        }

        em.close();
        emf.close();
    }
}
