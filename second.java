// porgram using scanner class 

import java.util.*;
public class second {
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Physics Marks:");
    int a = sc.nextInt();
    System.out.println("Enter Chemistry Marks:");
    float b = sc.nextFloat();
    System.out.println("Enter Maths Marks:");
    int c = sc.nextInt();

    float sum= (a+b+c)/3;
    System.out.println("Average marks is: "+sum);

    System.out.println("\nName: Meghana Kovatte \nBatch: S13 \nRoll No: 51");


}
    
}
