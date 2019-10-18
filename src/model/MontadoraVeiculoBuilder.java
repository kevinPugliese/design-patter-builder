package model;

public class MontadoraVeiculoBuilder implements MontadoraBuilderInteface {
    private AbstractVeiculo veiculo;

    @Override
    public void montar(char tipo, String modelo) {
        switch (tipo) {
            case 'F': veiculo = new Ferrari(modelo); break;
            case 'J': veiculo = new Jeep(modelo); break;
        }
    }

    @Override
    public AbstractVeiculo getVeiculo() {
        return veiculo;
    }
}
