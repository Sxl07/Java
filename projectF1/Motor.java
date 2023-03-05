package poo.repasoParcialPrimerCorte;

public class Motor {
    private String serial;
    private String fabricante;

    public Motor(String serial, String fabricante) {
        setSerial(serial);
        setFabricante(fabricante);
    }

    @Override
    public String toString() {
        return "serial: " + getSerial() + "\nfabricante: " + getFabricante();
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}