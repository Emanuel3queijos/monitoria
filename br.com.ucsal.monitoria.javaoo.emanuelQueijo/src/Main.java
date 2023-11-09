import DAO.DoceriaDAO;
import TUI.DoceriaTUI;
import domain.Bolo;
import domain.Doce;
import domain.Produto;

public class Main {
    public static void main(String[] args) {


        DoceriaDAO.adicionar(new Doce(12345, "2", 1D, 51));
        DoceriaDAO.adicionar(new Doce(12344, "b", 19D, 51));
        DoceriaDAO.adicionar(new Doce(12343, "o", 1D, 51));
        DoceriaDAO.adicionar(new Doce(12343, "1", 5D, 51));
        DoceriaDAO.adicionar(new Doce(12341, "boweff", 1D, 51));
        DoceriaDAO.adicionar(new Doce(12340, "blo", 12D, 51));
        DoceriaDAO.adicionar(new Doce(12339, "r", 11D, 51));

        DoceriaDAO.adicionar(new Bolo(1234, "1", 11D, 51, "lux cosmo negro"));
        DoceriaDAO.adicionar(new Bolo(12340, "bolo", 1D, 51, "e"));
        DoceriaDAO.adicionar(new Bolo(12340, "bolo", 1D, 51, "e"));
        DoceriaDAO.adicionar(new Bolo(12340, "bolo", 1D, 51, "e"));
        DoceriaDAO.adicionar(new Bolo(12337, "bolo", 1D, 51, "lux cosmo negro"));
        DoceriaDAO.adicionar(new Bolo(12337, "bolo", 1D, 51, "xyoutube"));
        DoceriaDAO.adicionar(new Bolo(12337, "bolo", 1D, 51, "xyoutube"));


        DoceriaTUI.listarProdutosPorValorEDescricao();
        System.out.println();
        DoceriaTUI.listarTemas();
        System.out.println();

        DoceriaTUI.cadastrarDoce();
        System.out.println();
        DoceriaTUI.cadastrarBolo();

        System.out.println();

        DoceriaTUI.listarProdutosPorValorEDescricao();
        System.out.println();
        DoceriaTUI.listarTemas();


    }





}