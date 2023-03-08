//@copyright 2023 Juan pablo silvestre(99127), Sebastian Lopez(97500)

public class Auto {
    private Motor motor;
    private Chasis chasis;
    private Piloto piloto;
    private int cantidad=0;

    public Auto(String fabricanteMotor, int revolucionesMotor, String referenciaChasis, int pesoChasis){
        this.motor=new Motor(fabricanteMotor, revolucionesMotor);
        this.chasis=new Chasis(referenciaChasis, pesoChasis);
    }

    public void agregarPiloto(Piloto pil){
        if(cantidad<1){
        this.piloto=pil;
        this.cantidad=1;
        }else if(cantidad <=1){
            System.err.println("ya existe un piloto en este auto");
        }
    }

    public void reemplazar(Piloto pilotoReemplazar){
        if(cantidad==1){
            this.piloto=pilotoReemplazar;
        }
    }

    public String toString(){
        String output="---------------------------------------------\nAuto: \nMotor : " + motor.toString() + "\nChasis: " + chasis.toString()+"\nPiloto: "+piloto.toString();
        return output;
    }
}
