public class Zorro extends Mamifero implements Cazador{

    
    public Zorro() {
       this.setNombreComun("zorro");
       this.setGenero("vulpin");
       this.setEspecie("EVE");
       this.setDatoCurioso("son omnivoros");

    }

    @Override
    public void cazar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String info() {
        // TODO Auto-generated method stub
        return this.getNombreComun()+this.getGenero()+this.getEspecie()+this.getDatoCurioso();
    }

}