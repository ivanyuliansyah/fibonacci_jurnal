
import javax.swing.*;
import java.util.Scanner;
public class Fibonaci {

    /**
     * @param args the command line arguments
     */
   public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
        System.out.println("input :");
        int x=scan.nextInt(); 
	int a=0;
	int b=1;
	for (int i=1; i<=x; i++){
		System.out.println("fibonaci :"+a);
			a=a+b;
			b=a-b;
			}
			}
}
