package domain;

public class Bolo extends Produto {


    private Integer quantFatias;
    private String tema;

    public Bolo() {
        super();
    }

    public Bolo(Integer codigo, String descricao, Double valorUnitario, Integer quantFatias, String tema) {
        super(codigo, descricao, valorUnitario);
        this.quantFatias = quantFatias;
        this.tema = tema;
    }

    public Integer getQuantFatias() {
        return quantFatias;
    }

    public void setQuantFatias(Integer quantFatias) {
        this.quantFatias = quantFatias;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Bolo{" +
                "quantFatias=" + quantFatias +
                ", tema='" + tema + '\'' +
                "} " + super.toString();
    }
}
