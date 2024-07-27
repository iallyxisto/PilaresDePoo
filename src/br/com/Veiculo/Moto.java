package br.com.Veiculo;

public class Moto extends VeiculoAbstract {
    private boolean temEmbreagem;

    public Moto(String placa, String modelo, boolean temEmbreagem) {
        super(placa, modelo);
        this.temEmbreagem = temEmbreagem;
    }

    @Override
    public void acelerar() {

        //System.out.println("Acelerando");
        for (; velocidadeAtual < velocidadeMax; velocidadeAtual++) {

        }
        System.out.println("Acelerando: " + velocidadeAtual);
    }

    @Override
    public void frear() {
        for (velocidadeMin = 0; velocidadeAtual > velocidadeMin; velocidadeAtual--) {

        }
        System.out.println("Freando: " + velocidadeAtual);
    }

    @Override
    public String toString() {
        return "Moto modelo: " + modelo + "\n" +
                "Tem Embreagem: " + temEmbreagem + "\n" +
                "Placa: " + placa + "\n" +
                "Velocidade: " + velocidadeAtual + "\n";


    }

    public void empinar() {
        System.out.println("A moto está empinando");
    }

    public boolean isTemEmbreagem() {
        return temEmbreagem;
    }

    public void setTemEmbreagem(boolean temEmbreagem) {
        this.temEmbreagem = temEmbreagem;
    }

}
