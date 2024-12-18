public class fundamentals{
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 4;
        int result = 0;
        String Grade;
        //Arithmatic Operators 
        int add = num1 + num2; //addition
        int sub = num1 - num2; //substration
        int mul = num1 * num2; //multiply
        int divide = num1 / num2; //divide (values after point are eliminated)
        int rem = num1 % num2 ; //remainder

        //Relational Operators 
        boolean equal = num1 == num2; //eqaul on not
        boolean greater = num1 > num2;
        boolean less = num1 < num2 ;
        boolean lessEq =  num1 <= num2;
        boolean grtEq = num1 >= num2;
        boolean notEq = num1 != num2;
        
        //logical operators
        boolean and = num1 > num2 && num2 > 0;
        boolean or = num1 > num2 || num2 > 0;
        boolean not = !(num2 > 0);
        
        //Conditional Statements
        if(num1>num2)
        {
            System.out.println("Yes, First Number is bigger");
        }
        else if(num1<num2){
            System.out.println("Yes, Second Number is bigger");
        }
        else{
            System.out.println("both the numbers are equal.");
        }
        //If-Else-IF
        int x = 50;
        int y = 14;
        int z = 9;
        if(x>y && x>z){
            System.out.println("The greatest Integer is :" + x);
        }
        else if(y>z){
            System.out.println("The greatest Integer is :" + y);
        }
        else
        System.out.println("The greatest Integer is :" + z);

        
        //Ternary Operators
        result = num1>0?5:10; //Condition (if)? value1 (else): value2;
        Grade = (num1>num2)?"PASSED":"FAILED"; // String o/p
        System.out.println(Grade);


        //Switch Cases
        String Day = "Friday";

        switch(Day)
        {
        case "Sunday","Saturday":
            System.out.println("Wake up and Code!");
            break;
        case "Monday","Tuesday":
            System.out.println("Skip the Constitution Class");
            break;
        case "Friday":
            System.out.println("Go HOME!,make learning plans for weekend & Upcoming Weeks");
            break;
        default:
            System.out.println("Go to classes");
        }

        //Updated Switch cases 
        //i.e. Lambda Syntax ('->' is used replacing ':' and 'break' statement)
        switch(Day){
            case "Sunday","Saturday" -> System.out.println("HOLIDAY");
            case "Friday" -> System.out.println("HOME");
            case "Monday","Tuesday","Wednesday","Thursday" -> System.out.println("ON-DUTY");
            default -> System.out.println("Wrong Input! \n Enter a Valid Day");
        }


        //Nested Swtich cases
        int year = 2; //int type variable
        String dept = "ECE"; //string type variable

        switch(year){ // Switch-case using int type

            case 2:
            System.out.println("NSS Association");
            break;
            case 1:
            switch(dept){ // Switch-case using String type
                case "CSE","cse" :
                System.out.println("The Code Bird Community");
                break;
                case "IT","it" :
                System.out.println("The Coding Junction Community");
                break;
                case "ECE","ece" :
                System.out.println("KM Community");
                break;
                default:
                System.out.println("UIT Community");  
            }
            break;
            case 3:
                System.out.println("UTI,SA Community");
                break;
        }


        // Interations in JAVA
        // Loop - while, do while, for\
        int i = 0;
        while(i<6){

            //System.out.println("HEYY CODERS! THIS IS AN ANNOUNCMENT for Comming to Dhanu's Birthday Party at Aditya's Mess");
            System.out.println("CODE-SLEEP-REPEAT..." + i);
            i++;
        }
        
        // Nested Loop
        int a =  6;
        
        while(a<=6){
            System.out.println("Coding" + a);
            
        }

    }
}
