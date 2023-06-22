package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Caneta", 7.45);

        DAO<Produto> dao = new DAO<>(Produto.class);
        //dao.abrirTransacao().incluir(produto).fecharTransacao().fecharTransacao();
        dao.incluirAtomico(produto).fecharTransacao();

        System.out.println("ID do produto: " + produto.getId());
    }
    
}
