import model.AbstractVeiculo;
import model.Montadora;

public class BuilderMain {
    public static void main(String[] args) {

        Montadora montadora = new Montadora();
        AbstractVeiculo ferrari = montadora.montar('F', "z250");
        AbstractVeiculo renegade = montadora.montar('J', "Renegade");

        System.out.println(ferrari);
        System.out.println(renegade);
    }
}
