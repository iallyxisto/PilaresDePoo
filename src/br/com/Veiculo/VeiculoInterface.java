package br.com.Veiculo;

public interface VeiculoInterface {

    void acelerar();
    default void frear(){
        System.out.println("o veiculo freou");
    }

}
