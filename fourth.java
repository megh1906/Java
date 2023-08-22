import java.util.*;
import java.util.Scanner;
import java.io.*;


public class fourth {


    String name,roll_no,math_marks;


    void Details (){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter name:");
    name=sc.nextLine();
    System.out.println("Enter roll no:");
    roll_no=sc.nextLine();
    System.out.println("Enter math_marks:");
    math_marks=sc.nextLine();}


    void Display(){
        System.out.println("\nname : "+name);
        System.out.println("roll no : "+roll_no);
        System.out.println("math marks : "+math_marks);
    }


  public static void main(String args[]){
    fourth sc = new fourth();
    System.out.println("\n ");
    sc.Details();
    sc.Display();
    System.out.println("\nName: Meghana Kovate\nRoll no: 51\nBatch: S13 ");


   
  }
}
