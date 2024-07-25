package br.com.Veiculo;

public class Carro extends VeiculoAbstract implements VeiculoInterface {

    public Carro(String placa, int qntPneu, String modelo) {
        super(placa, qntPneu, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro de modelo "+ modelo + "está na velocidade máxima");

    }

    @Override
    public void frear() {
       if (velocidade <= 0) {
           System.out.println("Veiculo freiou." + velocidade);
       } else {
           System.out.println("o veiculo ainda está em movimento");
       }

    }
}
