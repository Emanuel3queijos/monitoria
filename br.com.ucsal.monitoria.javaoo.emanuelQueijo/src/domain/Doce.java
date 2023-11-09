package domain;

import Exception.ProdutoException;

public class Doce extends Produto {


    private Integer minPedido;


    public Doce() {
        super();
    }

    public Doce(Integer codigo, String descricao, Double valorUnitario, Integer minPedido) {
        super(codigo, descricao, valorUnitario);
        this.minPedido = minPedido;
    }

    public Integer getMinPedido() {
        return minPedido;
    }

    public void setMinPedido(Integer minPedido) throws ProdutoException {
        validarMinPedido(minPedido);
        this.minPedido = minPedido;
    }

    public static void validarMinPedido(Integer minPedido) throws ProdutoException {
        if (minPedido < 50) {
            throw new ProdutoException("O Numero de doces é muito baixo para continuar a operação, Por Favor peça pelo menos 50 docinhoS S2");
        }

    }


    @Override
    public String toString() {
        return "Doce{" +
                "minPedido=" + minPedido +
                "} " + super.toString();
    }
}


