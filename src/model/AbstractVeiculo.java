package model;

public abstract class AbstractVeiculo {
    private String modelo;
    private String tipo;

    public AbstractVeiculo(String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }
}
