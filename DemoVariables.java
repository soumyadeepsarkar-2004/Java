class DemoVariables{
    public static void main(String args[]){
        //primitive data types
        //Integer Type
        byte sb = 90; //8 bit, same as Int
        short s = -355; //16 bit,same as Int
        int a = 34; //32 bit, Integer values postitive or negative
        long l = 9_00_00_00_00_00_000L; //64 bit, L is used or treated as Int by Compiler

        //Non-integer type
        boolean b = false; //8 bit, either true or false
        char c = '&'; //16 bit, can take anything within '' quotes.

        //Decimal Values
        float e = 5.67F; //32 bit, F is used at end or treated as Double
        double d = 9.75; //64 bit, Decimal values 
        
        System.out.println( a + " Concatenating the statements " + l );

        kane();
    }
    public static void kane(){

    System.out.println("This is Kane williamson");
    }
}