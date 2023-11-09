package DAO;

import domain.Bolo;
import domain.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class DoceriaDAO {

    private static List<Produto> produtos = new ArrayList<>();

    public static void adicionar(Produto produto) {
        produtos.add(produto);
    }


    public static List<Produto> listarPorOrdemCresteValorUnitarioEDescricao() {

        produtos.sort(Comparator.comparing(Produto::getValorUnitario).thenComparing(Produto::getDescricao));

        return produtos;
    }


//    public static List<String> listarTemasTest() {
//        List<String> lp = new ArrayList<String>();
//
//        for (Produto produto : produtos) {
//            if(produto instanceof  Bolo){
//                lp.add(((Bolo) produto).getTema());
//            }
//
//        }
//
//        return lp;
//    }

    public static HashSet<String> listarTemasSemRepeticao() {
        HashSet<String> hsTemas = new HashSet<String>();

        for (Produto produto : produtos) {
            if (produto instanceof Bolo) {
                hsTemas.add(((Bolo) produto).getTema());
            }
        }

//                for (int i = 0; i < produtos.size(); i++) {
//            if (produtos.get(i) instanceof Bolo) {
//                vetor[i] = (((Bolo) produtos.get(i)).getTema());
//            }
//
//        }
//
//        for (int i = 0; i < vetor.length; i++) {
//            if (vetor[i] != null) {
//                hsTemas.add(vetor[i]);
//
//            }
//        }
//
//        for (String tema : vetor) {
//            if (tema != null) {
//                hsTemas.add(tema);
//
//            }
//        }


        return hsTemas;

    }

}


