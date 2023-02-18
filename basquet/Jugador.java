class Jugador {
    private String name;
    private String lastName;
    private double height;
    private int age;
    private int dorsal;
    private String position;

    public Jugador() {
    }

    public Jugador(String nombre,String apellido, double altura,int edad,int dorsall,String posicion){
        this.name=nombre;
        this.lastName=apellido;
        setHeight(altura);
        setAge(edad);
        setDorsal(dorsall);
        this.position=posicion;
    }

    public String toString(){
        return "\nLos datos del jugador son: \nNombre: "+this.name+"\nApellido: "+this.lastName+"\nAltura: "+getHeight()+"\nEdad: "+getAge()+"\nDorsal: "+getDorsal()+"\nPosicion: "+this.position;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public double getHeight() {
        return height;
    }
    public int getAge() {
        return age;
    }
    public int getDorsal() {
        return dorsal;
    }
    public String getPosition() {
        return position;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setHeight(double height) {
        this.height = height;
        if(height<1.53){
            this.height=1.53;
        }
        if(height>2.9){
            this.height=2.9;
        }
    }
    public void setAge(int age) {
        this.age = age;
        if (age<0 || age<20) {
            this.age=20;
        }
    }
    public void setDorsal(int dorsal) {
        if (dorsal>0 || dorsal<99) {
            this.dorsal = dorsal;
        }else{
            this.dorsal=000;
        }
    }
    public void setPosition(String position) {
        this.position = position;
    }
}