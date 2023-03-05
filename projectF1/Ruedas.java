package poo.repasoParcialPrimerCorte;

public class Ruedas {
    private int compuesto;

    public Ruedas(int compuesto) {
        setCompuesto(compuesto);
    }

    @Override
    public String toString() {
        return "compuesto: " + getCompuesto();
    }

    public int getCompuesto() {
        return compuesto;
    }

    public void setCompuesto(int compuesto) {
        if (compuesto < 0) {
            System.err.println("El rango del compuesto tiene que estar entre 0 y 6, el valor por defecto será 0");
            this.compuesto = 0;
        }
        if (compuesto > 6) {
            System.err.println("El rango del compuesto tiene que estar entre 0 y 6, el valor por defecto será 6");
            this.compuesto = 6;
        }
        if (compuesto >= 0 && compuesto <= 6) {
            this.compuesto = compuesto;
        }
    }
}
