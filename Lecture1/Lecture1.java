public class Lecture1 {
    public static void main(String[] args) {
        //This is a comment

        /*
         * This is a multi-line comment.
         * So much easier than Python
         */

         //declaring and initializing a variable
         int numberOfCS62Students = 38; 

         //assigning a new value to an already declared variable
         numberOfCS62Students = 39; 

         //other useful primitives
         double temperatureCelsius = 27.5;

         boolean lovingCS62 = true;

         char initialOfName = 'A';

        //Strings are not primitives
        String name = "Alexandra";

        //print statements
        System.out.println("Hello World");
        System.out.println(name);
        System.out.println(numberOfCS62Students);
        System.out.println(lovingCS62);

        System.out.println("My name is " + name + " and I will be teaching " + numberOfCS62Students + " students this semester");
    }
}
