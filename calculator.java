/*make a calculator 2 numbers input and operator
 * #1 addition, 2 subtraction, 3 multiplication, 4 division, 5 modulo
 */

 import java.util.*;

 public class calculator{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a");
    int a= sc.nextInt();
    System.out.println("enter b");
    int b= sc.nextInt();
    System.out.println("enter operator number");
    int op= sc.nextInt();

    switch(op){
      case 1: System.out.println("addition of "+a+" and "+b+" is "+(a+b));
      break;

      case 2: System.out.println("subtraction of"+a+"and"+b+"is "+(a-b));
      break;

      case 3: System.out.println("division  of"+a+"and"+b+"is "+(a*b));
      break;

      case 4: if (b==0){
              System.out.println("invalid division");}
              else{
              System.out.println("multiplication of"+a+"and"+b+"is "+(a/b));}
             break;

      case 5: if (b==0){
              System.out.println("invalid division");}
              else{
             System.out.println("modulo of"+a+"and"+b+"is "+(a%b));}
             break;
             
      default: System.out.println("invalid");
    }
  }
 }