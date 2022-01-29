public class TrechoSimples implements Trecho{

    private String inicio;
    private String fim;
    private double valor;

    public TrechoSimples(String inicio, String fim, double valor){
        this.inicio = inicio;
        this.fim = fim;
        this.valor = valor;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
