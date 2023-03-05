package poo.repasoParcialPrimerCorte;

import java.util.ArrayList;

public class Auto {
    private String escuderia;
    private Motor motor;
    private ArrayList<Ruedas> ruedas;

    public Auto(String escuderia, String serialMotor, String fabricanteMotor) {
        this.escuderia = escuderia;
        this.motor = new Motor(serialMotor, fabricanteMotor);
        this.ruedas = new ArrayList<>();
    }

    @Override
    public String toString() {
        String salida = "Auto: \nEscuderia: " + this.escuderia + "\n";
        salida += motor.toString() + "\n";
        salida += "ruedas: \n";
        for (Ruedas compuesto : ruedas) {
            salida += compuesto + "\n";
        }
        return salida;
    }

    public void agregarRuedas(Ruedas ruedaNueva) {
        if (ruedas.size() < 7) {
            ruedas.add(ruedaNueva);
        } else {
            System.err.println("no se pueden agregar mas ruedas");
        }
    }

    public void remplazarRuedas(Ruedas ruedaARemplazar, int posicion) {
        ruedas.set(posicion, ruedaARemplazar);
    }

}
