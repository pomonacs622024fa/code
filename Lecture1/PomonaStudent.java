public class PomonaStudent {

    String name;
    String email;
    int id;
    int yearEntered;
    String academicStanding;
    boolean graduated;

    // PomonaStudent(){

    // }

    public PomonaStudent(String name, String email, int id){
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public static void main(String[] args){

        // Experiment with what happens when you uncomment the code below. 
        // You will have to also uncomment the empty default constructor

        // PomonaStudent student1 = new PomonaStudent(); //uses the default constructor
        // student1.name = "Ravi Kumar";
        // student1.email = "rkjc2023@mypomona.edu";
        // student1.id = 1234;  
        
        PomonaStudent student2 = new PomonaStudent("Ravi Kumar", "rkjc2023@mypomona.edu", 1234);
        System.out.println(student2.name); //prints Ravi Kumar
        student2.name = "Alexandra Papoutsaki";
        System.out.println(student2.name); //prints Alexandra Papoutsaki
 
    }

}
