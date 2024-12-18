import java.util.Scanner;

public class areaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        //declaring an object(from scanner class) which is to inserted by an user
        System.out.println("The radius of Circle is : " + sc);
        double radius = sc.nextDouble();
        double pi = Math.PI;
        double area = pi * radius * radius;
        System.out.println("The Area of the Circle is:" + area);
        // "+" Operator can be used as a Polymorphic thing (i.e. showing a polymorphic property)
        
    }
}

      

