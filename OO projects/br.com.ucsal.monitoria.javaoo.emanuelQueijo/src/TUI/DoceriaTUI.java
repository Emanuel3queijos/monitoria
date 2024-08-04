package TUI;

import DAO.DoceriaDAO;
import domain.Bolo;
import domain.Doce;
import Exception.ProdutoException;
import domain.Produto;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DoceriaTUI {

    static Scanner scan = new Scanner(System.in);

    public static void cadastrarDoce() {
        try {
            System.out.println("Informe o Codigo do Doce");
            Integer codigo = scan.nextInt();
            System.out.println("Informe a descrição do Doce");
            scan.nextLine();
            String descricao = scan.nextLine();
            System.out.println("Informe o valor unitário do Doce");
            Double valorUnitario = scan.nextDouble();
            System.out.println("Informe a quantidade de Doces");
            Integer minPedido = scan.nextInt();
            Doce.validarMinPedido(minPedido);
            Doce doce = new Doce(codigo, descricao, valorUnitario, minPedido);
            DoceriaDAO.adicionar(doce);
            System.out.println("Doce cadastrado com sucesso");
        } catch (ProdutoException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Valor digitado não é suportado");
        }
    }

    public static void cadastrarBolo() {
        try {
            System.out.println("Informe o Codigo do Bolo");
            Integer codigo = scan.nextInt();
            System.out.println("Informe a descrição do Bolo");
            scan.nextLine();
            String descricao = scan.nextLine();
            System.out.println("Informe o valor unitário do Bolo");
            Double valorUnitario = scan.nextDouble();
            System.out.println("Informe a quantidade de fatias do Bolo");
            Integer quantFatias = scan.nextInt();
            System.out.println("Informe o Tema do Bolo");
            scan.nextLine();
            String tema = scan.nextLine();
            Bolo bolo = new Bolo(codigo, descricao, valorUnitario, quantFatias, tema);
            DoceriaDAO.adicionar(bolo);
            System.out.println("Bolo cadastrado com sucesso");
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado não é suportado");
        }

    }

    public static void listarProdutosPorValorEDescricao() {

        for (Produto produto : DoceriaDAO.listarPorOrdemCresteValorUnitarioEDescricao()) {
            System.out.println(produto.toString());
        }

    }


    //test
//    public static void listarTemas() {
//
//        System.out.println("Temas de bolos cadastrados: ");
//        for (String tema : DoceriaDAO.listarTemasTest()) {
//            System.out.println(tema);
//        }
//    }

    public static void listarTemas() {

        System.out.println("Temas de bolos cadastrados: ");
        for (String tema : DoceriaDAO.listarTemasSemRepeticao()) {
            System.out.println(tema);
        }
    }

}