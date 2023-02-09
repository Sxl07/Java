package demoStudents;
class Students {
    String name;
    String lastName;
    int age;
    String id;
    String career;
    String gender;
    //constructor method - is a function that allows you to create objects of the same class where you are
    //default constructor(no parameters) 
    public Students(){
    }

    //constructor with parameters
    public Students(String namE,String lastNamE,int agE,String iD,String careeR,String gendeR){
        this.name=namE;
        this.lastName=lastNamE;
        this.age=agE;
        this.id=iD;
        this.career=careeR;
        this.gender=gendeR;
    }

}
