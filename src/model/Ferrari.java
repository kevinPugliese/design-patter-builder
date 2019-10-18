package model;

public class Ferrari extends AbstractVeiculo {
    private String nome;

    public Ferrari(String modelo) {
        super(modelo, "Esportivo");
        this.nome = "Ferrari";
    }

    @Override
    public String toString() {
        return "Carro: " + this.nome + " " + getModelo() + " " + getTipo();
    }
}
