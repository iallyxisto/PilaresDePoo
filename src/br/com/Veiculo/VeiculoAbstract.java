package br.com.Veiculo;

public abstract class VeiculoAbstract {
    /*
    Classe abstrata que representa um veículo.
    todo veiculo criado a partir dessa classe, será obrigado a implementar os metodos e atributos
    definidos na classe abstrata.
     */

    String placa;
    int velocidadeMax = 120;
    int velocidadeMin = 0;
    int velocidadeAtual;
    String modelo;
    /*Construtor para ser obrigatorio cada veiculo ter uma placa
    */

    public VeiculoAbstract(String placa, String modelo) {

        this.modelo = modelo;
        /*
        isEmpty() é usado para verificar se uma String ou uma Collection está vazia =0 ==null.
         */
        if (placa == null || placa.isEmpty()) {
            /*
            Caso a afirmação seja verdadeira, vamos criar uma exceção
             */
            throw new IllegalArgumentException("A placa do veiculo é obrigatorio");
        }
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Ligando");
    }
    /*
    os métodos estão abstatos,pois cada veiculo pode acelara ou frear de uma maneira diferene, isso será
    implementado em cada novo Objeto de veiculo;
     */
    public abstract void acelerar();

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

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public int getVelocidadeMin() {
        return velocidadeMin;
    }

    public void setVelocidadeMin(int velocidadeMin) {
        this.velocidadeMin = velocidadeMin;
    }
}
