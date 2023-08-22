// Program using bufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class first {
public static void main(String args[]) throws IOException{
    InputStreamReader r= new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(r);

    System.out.println("Enter Physics Marks:");
    int a = Integer.parseInt(br.readLine());
    System.out.println("Enter Chemistry Marks:");
    float b = Float.parseFloat(br.readLine());
    System.out.println("Enter Maths Marks:");
    int c = Integer.parseInt(br.readLine());

    float sum = (a+b+c)/3;
    System.out.println("Average marks is: "+sum);

    System.out.println("\nName: Meghana Kovatte \nBatch: S13 \nRoll No: 51");

}

    
}
