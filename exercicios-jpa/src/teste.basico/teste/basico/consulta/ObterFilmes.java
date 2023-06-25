package teste.basico.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filmes;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filmes> dao = new DAO<>(Filmes.class);
        List<Filmes> filmes = dao.consultar(
                "obterFilmesNotaMaiorQue", "nota", 8.5);
        System.out.println("Obtendo os filmes com nota maior que: ");

        for (Filmes filme : filmes) {
            System.out.println(filme.getNome()
                    + "=> " + filme.getNota());

            for (Ator ator : filme.getAtores()) {
                System.out.println(ator.getNome());
            }
        }

    }
}
