package model;

public class Montadora {

    private MontadoraBuilderInteface montadoraBuilder = new MontadoraVeiculoBuilder();

    public AbstractVeiculo montar(char tipo, String modelo) {
        montadoraBuilder.montar(tipo, modelo);
        return montadoraBuilder.getVeiculo();
    }
}
