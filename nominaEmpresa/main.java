public class main {
    public static void main(String[] args) {
        Supervisor supervisorUno = new Supervisor("SN803", "Andres", "Mancera", 2000, 300);
        System.out.println(supervisorUno);
        Regular regularUno = new Regular("ST899", "Juan Pablo", "Padilla", 800);
        System.out.println(regularUno);
        Temporal temporalUno= new Temporal("SA507", "Sebastian", "Lopez", 5);
        System.out.println(temporalUno);
    }
}
