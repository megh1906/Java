import java.util.*;
import java.util.Scanner;
import java.io.*;

class vacancy{
        int c,d;
         void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" No of vacant apartment: ");
        c=sc.nextInt();
        System.out.println("Number apartments on rent: ");
        d=sc.nextInt();
    }


     void Display(){
        System.out.println("No of vacant apartment: "+c);
        System.out.println("Number apartments on rent: "+d);
       
    }

  }
public class Apartment {
    String bldg;
        int a;
    void read(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println(" Enter Building Name:");
        bldg=sc.nextLine();
        System.out.println("Number of apartment total:");
        a=sc.nextInt();
    }


    void Display(){
        System.out.println("Building Name: "+bldg);
        System.out.println("Number of apartment total: "+a);}


             
     public static void main(String args[]){
    System.out.println("\n");
    Apartment ap= new Apartment();
    vacancy v = new vacancy();
    ap.read();
     System.out.println("\n");
    v.read();
     System.out.println("\n");
    ap.Display();
     System.out.println("\n");
    v.Display();
     System.out.println("\n");
     System.out.println("Name: Meghana Kovatte\nBatch: S13\nRoll no: 51");

    }
   
     }





