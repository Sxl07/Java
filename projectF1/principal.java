package poo.repasoParcialPrimerCorte;

public class principal {
    public static void main(String[] args) {
        Auto RB18 = new Auto("Red Bull", "RBPTH001", "Red Bull Powertrains");
        RB18.agregarRuedas(new Ruedas(3));
        RB18.agregarRuedas(new Ruedas(7));
        RB18.agregarRuedas(new Ruedas(3));
        RB18.agregarRuedas(new Ruedas(2));
        RB18.agregarRuedas(new Ruedas(0));
        RB18.agregarRuedas(new Ruedas(4));
        RB18.agregarRuedas(new Ruedas(1));
        RB18.agregarRuedas(new Ruedas(4));

        RB18.remplazarRuedas(new Ruedas(0), 3);
        RB18.remplazarRuedas(new Ruedas(1), 0);
        RB18.remplazarRuedas(new Ruedas(2), 5);
        System.out.println(RB18);
    }

}
