public class NestedSwitch {
    public static void main(String[] args) {
        //Nested Switch 
        int year = 1;
        String dept ="ECE";

        switch(year){
            case 1:
            System.out.println("The Code Bird");
            break;
            
            case 2:
             switch(dept){
                case "CSE":
                case "IT" :
                System.out.println("The Coding Junction");
                break;
                case "ECE":
                System.out.println("KM community");
                break;
            }
        }

        //Enum or Enumerators Or Constants Using Switch Cases
        
        enum Dept { CSE, IT ,ECE, CIVIL, AEIE, EE} //defines a set of constant values
        Dept DEP = Dept.CSE; //defining an element DEP from Dept-set using '.' 'element'
        
        switch (DEP){  //running switch-case for the defined element
            case CSE -> System.out.println("He is from CSE branch");
            case IT -> System.out.println("he is form IT branch");
            case ECE -> System.out.println("he is form ECE branch");
            case CIVIL -> System.out.println("he is form CIVIL branch");
        }

        //switch as an Expression(variable)
        int likes = 100;
        String meme = "Hello and Welcome to my GUYS!";
        String result = "ei baba";

        result = switch(likes){ // switch is used as an Assigned value for result
            case 50 -> "i wont post again "+ meme;
            case 100 -> "i will post again "+ meme;
            case 200 -> "i will post daily "+ meme;
            case 1000 -> "i am an Influencer now "+ meme;
            default -> "Stop Using INSTAGRAM... "+ meme;
        };
        System.out.println(result);
        

        // Using yeild Keyword insted of Lambda Expression '->'
        String Students = "";
        String results ="";    
        results = switch(Students){ // Switch has to be used as an Expression, like results in this case 
            case "a"  : yield "i wont post again"; // yield is used 
            case "b" : yield "i will post again";
            case "c" : yield "i will post daily ";
            case "d" : yield "i am an Influencer now ";
            default : yield "Stop Using INSTAGRAM... "; // default statement is a must
        };



    }
    
}
