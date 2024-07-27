package br.com.Veiculo;

public class NovoVeiculo {
    public static void main(String[] args) {
        //Será lançado uma exceção, caso tente criar um veiculo com placa nula
        //tente
        try {
            Carro carro = new Carro("ABC-1234", "Gol");
            System.out.println("== CRIANDO CARRO ==\n" + carro.toString());
            System.out.println("\nComeçar a acelerar o carro");
            carro.acelerar();
            carro.frear();

            System.out.println("== Estado atual ==\n " + carro.toString());
            System.out.println("\n");
            /*
            Nesse caso a placa é nula, deve-se ser lançado uma exceção e proibida a criação do carro
            até que uma placa seja informada.
             */
//            System.out.println("Criando carro sem placa ");
//            Carro carro2 = new Carro(null, 0, "Gol");
//            System.out.println(carro.toString());
//            carro.acelerar();
//            carro.frear();
//            System.out.println(carro.toString());

            Moto moto = new Moto("ABC-1234", "Honda", false);
            System.out.println("== Moto == " + "\n" + moto.toString());
            System.out.println("\nComeçando a acelerar a moto\n");
            moto.acelerar();
            moto.frear();
            moto.empinar();
            System.out.println("\n== Estado atual == " + "\n" + moto.toString());

            /* Aqui a moto está sendo criada com nula, logo, a moto não será criada e será lançada
            a exceção*/

            System.out.println("\n=============\n");
            Moto moto2 = new Moto(null, "Honda", true);
            moto.acelerar();
            moto.frear();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar veiculo." + e.getMessage());
        }
    }
}
