package rescue;

public class Dog{

    private String name;
    private String breed;
    private int age;
    private int daysInRescue;
    private boolean adopted;
    
    private static int dogCounter;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
        dogCounter++;
    }

    public int getDaysInRescue(){
        return daysInRescue;
    }

    protected void setDaysInRescue(int daysInRescue){
        this.daysInRescue = daysInRescue;
    }

    public void adopt(){
        adopted = true;
        dogCounter--;
    }

    public String toString(){
        return "Name: " + name + "\nBreed: " + breed + "\nAge: " + age;
    }
    public static void main(String[] args){

        Dog dog1 = new Dog("Rex", "German Shepherd", 3);
        Dog dog2 = new Dog("Lassie", "Rough Collie", 7);
        dog1.daysInRescue = 3;
        dog2.daysInRescue = 47;
        System.out.println(dog1);
    }
}