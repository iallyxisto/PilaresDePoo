package br.com.Veiculo;

public class Carro extends VeiculoAbstract {


    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public void acelerar() {
        for (velocidadeMin = 0; velocidadeMin < velocidadeMax; velocidadeMin++) {
            velocidadeAtual = velocidadeMin;
        }
        System.out.println("Acelerando: " + velocidadeAtual);
    }

    @Override
    public void frear() {
        for (velocidadeMin = 0; velocidadeAtual > velocidadeMin; velocidadeAtual--) {

        }

        System.out.println("Freiando: " + velocidadeAtual);
    }

    @Override
    public String toString() {
        return "Carro modelo: " + modelo + "\nPlaca='" + placa + "\nEstá na velocidade: "
                + velocidadeAtual;

    }
}
