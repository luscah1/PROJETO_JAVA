package CorridaMaluca;
public class Carro {
    private String nomeCarro, modelo, potencia, motor, nomePiloto;
    private int ano;
    
    public void apresentar(){
        System.out.println("=== Corrida de rua ===");
        System.out.println("Teste do git");
    }

    public void ganharRace(){
        System.out.println("=====================================");
        System.out.println("Venceu: " + "");
    }
    public void perderRace(){
        
    }
    public void empatarRace(){
        
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String status(){
        return  "Carro: " + this.getNomeCarro() + "\nModelo: "+ this.getModelo() +
                "\nPotência: "+ this.getPotencia() + "\nMotor: "+ this.getMotor() +
                "\nNome do piloto: "+ this.getNomePiloto() + "\nAno do carro: "+ this.getAno();
    }
    
}