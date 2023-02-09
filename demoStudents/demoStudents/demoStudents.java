package demoStudents;


public class demoStudents {
    public static void main(String[] args) {
        Students student_1;
        student_1= new Students();
        student_1.name="Juan";
        student_1.lastName="Martinez";
        student_1.age=24;
        student_1.id="300000256421";
        student_1.career="Ing. multimedia";
        student_1.gender="Male";

        Students student_2=new Students("marcela","acosta",22,"300000456721","Ing. Sistemas","Female");

        System.out.println("The student data is: ");
        System.out.println("Name: "+student_1.name+"\nLast name: "+student_1.lastName+"\nAge: "+student_1.age+"\nId: "+student_1.id+"Career: "+student_1.career+"\nGender: "+student_1.gender+"\n");
        System.out.printf("Name: %s \nLast name: %s \nAge: %d \nId: %s \n Career: %s \n Gender: %s",student_2.name,student_2.lastName,student_2.age,student_2.id,student_2.career,student_2.gender);
    }
}
