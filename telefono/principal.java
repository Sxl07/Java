package telefono;
public class principal {
    public static void main(String[] args) {
        smartPhone myPhone=new smartPhone("Samsung A52", 5800, "Samsung");
        myPhone.agregarChip(new Chip("Movistar",345323450));
        myPhone.agregarChip(new Chip("Claro",435453875));
        myPhone.agregarChip(new Chip("Comcel",334345054));
        System.out.println(myPhone);
    }
}
