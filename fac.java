package factoria;

public class fac {
	public static int factoria(int n) {
		if(n==1||n==0) {
			return 1;
		}
	    return n*factoria(n-1);
	}
	
	
	
	public static void offset(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n%10);
		offset(n/10);
	}
	
	
	public static int givemul(int x,int y) {
		
		if(y==1) {
			return x;
		}
		return x+givemul(x,y-1);
	}
	
	
	public static int same(int num1,int num2) {
		if(num1<10||num2<10) {
			if(num1%10==num1%10) {
				return 1;
			}
			return 0;
		}
		if(num1%10==num1%10) {
			return 1+ same(num1/10,num2/10);
		}
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(givemul(2,3));
         System.out.println(same(220,120));         
	}

}
