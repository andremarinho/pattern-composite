public class TrechoComposto implements Trecho{

    private Trecho trechoInicio;
    private Trecho trechoFim;

    public Trecho getTrechoInicio() {
        return trechoInicio;
    }

    public void setTrechoInicio(Trecho trechoInicio) {
        this.trechoInicio = trechoInicio;
    }

    public void setTrechoFim(Trecho trechoFim) {
        this.trechoFim = trechoFim;
    }

    @Override
    public double getValor() {
        return trechoInicio.getValor() + trechoFim.getValor();
    }
}
