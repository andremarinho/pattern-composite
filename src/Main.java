public class Main {
    public static void main(String[] args) {

        TrechoComposto tc = new TrechoComposto();
        TrechoSimples tsSpRio = new TrechoSimples("São Paulo", "Rio de Janeiro", 200.0);
        TrechoSimples tsRioRec = new TrechoSimples("Rio de Janeiro", "Recife", 450.4);
        tc.setTrechoInicio(tsSpRio);
        tc.setTrechoFim(tsRioRec);
        System.out.println("O valor da viagem São Paulo a Recife com escala no Rio é de: "+tc.getValor());

    }
}
