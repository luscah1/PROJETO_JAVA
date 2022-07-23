package CorridaMaluca;

public class CorridaDeRua {
    public static void main(String[] args) {
        
        
        Corrida teste = new Corrida();
        teste.marcarCorrida();
        
        Carro Carro1 = new Carro();
        
        Carro1.setNomeCarro("O mais rápido");
        Carro1.setModelo("Ferrari");
        Carro1.setPotencia("Muitos cavalos.");
        Carro1.setMotor("O melhor");
        Carro1.setNomePiloto("Seu zé");
        Carro1.setAno(2022);
        
        System.out.println(Carro1.status());
        System.out.println("Isso é um teste para o git");

    }
}
