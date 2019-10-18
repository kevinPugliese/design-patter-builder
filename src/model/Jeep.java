package model;

public class Jeep extends AbstractVeiculo {

    private String nome;

    public Jeep(String modelo) {
        super(modelo, "Utilitário");
        this.nome = "Jeep";
    }

    @Override
    public String toString() {
        return "Carro: " + this.nome + " " + getModelo() + " " + getTipo();
    }
}
