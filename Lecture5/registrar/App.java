package registrar;

public class App {

    public static void main(String[] args) {

        FirstYearPomonaStudent student1 = new FirstYearPomonaStudent("Daniel", "daniel@pomona.edu", 1, "War and Peace");
        FirstYearPomonaStudent student2 = new FirstYearPomonaStudent("Wentao", "wentao@pomona.edu", 2, "Color and its Affects");

        System.out.println("==Printing first years==\n");
        FirstYearPomonaStudent[] firstYears = {student1,student2};
        for(FirstYearPomonaStudent firstYear:firstYears){
            System.out.println(firstYear + "max credits: " + firstYear.getMaxCredits() +"\n");
        }

        System.out.println("=========\n");

        SecondYearPomonaStudent student3 = new SecondYearPomonaStudent("Archita", "archita@pomona.edu", 3);
        SecondYearPomonaStudent student4 = new SecondYearPomonaStudent("Nedi", "nedi@pomona.edu", 4);
        SecondYearPomonaStudent[] secondYears = {student3,student4};

        System.out.println("~~Printing second years~~\n");
        for(SecondYearPomonaStudent secondYear:secondYears){
            System.out.println(secondYear + "max credits: " + secondYear.getMaxCredits()+"\n");
        }
        System.out.println("~~~~~~~~~\n");

        FourthYearPomonaStudent student5 = new FourthYearPomonaStudent("Nicholas", "nicholas@pomona.edu", 5, "Balloons, Mega Blocks, and Trucks: The Decline of American Manufacturing and its Effects on the Middle Class ");
        FourthYearPomonaStudent student6 = new FourthYearPomonaStudent("Antonio", "antonio@pomona.edu", 6, "Savoir Vivre Around the World");
        FourthYearPomonaStudent[] fourthYears = {student5,student6};
        
        System.out.println("##Printing fourth years##\n");
        for(FourthYearPomonaStudent fourthYear:fourthYears){
            System.out.println(fourthYear + "thesis: " + fourthYear.getThesisTitle()+"\n");
        }
        System.out.println("#######\n");

        //polymorphism
        PomonaStudent student7 = new FirstYearPomonaStudent("Alex", "alex@pomona.edu", 1, "Humans through the eyes of technology");
        System.out.println(student7 + "max credits: " + student7.getMaxCredits()+"\n");
        //let's say student7 advances to next year and is now a second year
        student7 = new SecondYearPomonaStudent(student7.getName(), student7.getEmail(), student7.getId());
        System.out.println(student7 + "max credits: " + student7.getMaxCredits()+"\n");

        
        PomonaStudent[] students = new PomonaStudent[7];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;

        System.out.println("$$Printing Pomona students$$\n");
        for(PomonaStudent student: students){
            System.out.println(student+"\n");
        }
        System.out.println("$$$$$$$$");


    }
}
