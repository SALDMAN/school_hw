package kobi;
import java.util.Scanner;
public class דד {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner in= new Scanner(System.in);
   int numstu,bus;
   System.out.println("please enter the number of the numstu");
   numstu=in.nextInt();
   if(numstu%55==0)
   {
	System.out.println(numstu/55);   
   }
   else {
	   System.out.println(numstu/55+1);
   }
  }

}
