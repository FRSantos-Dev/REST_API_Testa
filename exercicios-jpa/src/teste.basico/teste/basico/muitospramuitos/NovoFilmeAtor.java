package teste.basico.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filmes;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filmes filmeA = new Filmes("Star Wars Ep 4", 8.7);
        Filmes filmeB = new Filmes("O Fugitivo", 8.1);

        Ator atorA = new Ator("Harrison Ford");
        Ator atrizB = new Ator("Carrie Fisher");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);

        DAO<Filmes> dao = new DAO<Filmes>();
        dao.incluirAtomico(filmeA);

    }

}
