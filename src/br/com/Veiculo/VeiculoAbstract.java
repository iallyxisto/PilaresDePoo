package br.com.Veiculo;

public abstract class VeiculoAbstract {

    String placa;
    int velocidade = 0;
    String modelo;

    public VeiculoAbstract(String placa, int qntPneu, String modelo) {

        this.modelo = modelo;
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("A placa do veiculo é obrigatorio");
        }
        this.placa = placa;
    }
    public void ligar() {
        System.out.println("Ligando");
    }

    public  abstract void acelerar();

    public abstract void frear();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = String.valueOf(placa);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
