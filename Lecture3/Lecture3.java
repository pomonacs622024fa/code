public class Lecture3 {
    public static void main(String[] args) {

        //operators

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);

        int i = 3;
        i++;
        // prints i (4)
        System.out.println(i);
        ++i;			   
        // prints i (5)
        System.out.println(i);
        // first increments to 6 then prints it (6)
        System.out.println(++i);
        // first prints i (6) then increments i to 7 
        System.out.println(i++);
        // prints i (7)
        System.out.println(i);


        // Selection control flow

        // Example of if-else statements
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) { // once this is satisfied, the rest of the clauses won’t be evaluated!
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        // worksheet #3 Problem 1

        int temperature = 47;
        String message;

        if (temperature < 64) {
            message = "Too cold";
        }
        // change it to else if to fix
        if (temperature >= 64 && temperature <= 75) {
            message = "Just perfect";
        } else {
            message = "Too hot";
        }

        System.out.println(message);

        // Example of switch statement

        int finger = 4;
        switch (finger) {
            case 1:
                System.out.println("thumb");
                break;
            case 2:
                System.out.println("index");
                break;
            case 3:
                System.out.println("middle");
                break;
            case 4:
                System.out.println("ring");
                break;
            case 5:
                System.out.println("pinky");
                break;
            default:
                System.out.println("Not a valid number");
        }

        // the importance of the break statement
        switch (finger) {
            case 1:
                System.out.println("thumb");
            case 2:
                System.out.println("index");
            case 3:
                System.out.println("middle");
            case 4:
                System.out.println("ring");
            case 5:
                System.out.println("pinky");
            default:
                System.out.println("Not a valid number");
        }

        // ternary operator

        int n1 = 32;
        int n2 = 47;
        int max;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximum is = " + max);

        System.out.println((n1 > n2) ? (n1 + n2) : (n1 - n2));

        // Iteration control flow

        // example of while loop
        i = 0;
        while (i < 5) {
            System.out.println("CS62 will become my favorite class");
            i++;
        }

        // example of a do-while loop
        int j = 5;
        do {
            System.out.println("This is the best semester ever");
            j++;
        } while (j < 5);

        // example of for loop
        for (int k = 1; k <= 10; k++) {
            System.out.println("Count is: " + k);
        }

        // example of escaping for loop
        for (int l = 0; l < 10; l++) {
            if (l == 4) {
                System.out.println("I am out of here");
                break;
            }
            System.out.println(l);
        }

        // example of skipping a while loop
        for (int x = 0; x < 10; x++) {
            if (x == 4) {
                System.out.println("I am skipping this step");
                continue;
            }
            System.out.println(x);
        }

        // Examples of arrays

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};;
        int[] numbers = {10, 20, 30, 40};
        System.out.println(cars[0]);
        cars[0] = "Toyota";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7


        //worksheet problem 3
        String[] classes = {"PHYS032", "CSCI101", "ANTH051", "CSCI062", "IMAG002"};
        for(String myClass:classes){
            if(myClass.equals("CSCI062")){
                System.out.println("CSCI062: This is the best class ever, no need to see more");
                break;
            }
            else if(myClass.equals("CSCI101")){
                System.out.println("CSCI101: New CS achievement locked");
                continue;
            }
            System.out.println(myClass);
        }
    }
}
