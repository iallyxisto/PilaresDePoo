package br.com.Veiculo;

public class Moto extends VeiculoAbstract implements VeiculoInterface{
    private  boolean temEmbreagem;

    public Moto(String placa, int velocidade, String modelo, boolean temEmbreagem) {
        super(placa, velocidade,modelo);
        this.temEmbreagem = temEmbreagem;
    }

    @Override
    public void acelerar() {
        if (velocidade>0){
            System.out.println("Acelerando");
        } else {
            System.out.println("A moto ainda está parada");
        }

    }

    @Override
    public void frear() {
        if (velocidade==0){
            System.out.println("Moto freioy");
        } else {
            System.out.println("A moto ainda está em movimeto");
        }

    }

    public boolean isTemEmbreagem() {
        return temEmbreagem;
    }

    public void setTemEmbreagem(boolean temEmbreagem) {
        this.temEmbreagem = temEmbreagem;
    }
}
