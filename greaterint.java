import java.util.Scanner;

public class greaterint {
	void greater(int a,int b) {
		 if(a>b)
	            System.out.println("Greatest number is:"+a);
		 else
	            System.out.println("Greatest number is:"+b);
	}
	
	void greater(int a,int b,int c) {
	 if(a>b && a>c)
         System.out.println("Greatest number is:"+a);
     else if(b>c)
         System.out.println("Greatest number is:"+b);
     else
         System.out.println("Greatest number is:"+c);
	}
	public static void main(String[] args) {
		int a,b,c,no;
		greaterint g= new greaterint();
        Scanner s = new Scanner(System.in);
        System.out.println("To Find\nA. Greatest of 2 Numbers Enter 2: \nB. Greatest of 3 Numbers Enter 3: ");
        no=s.nextInt();
        System.out.print("Enter the first number:");
        a = s.nextInt();
        System.out.print("Enter the second number:");
        b = s.nextInt();
        if(no==2)        
        g.greater(a,b);
        else if(no==3)	
        {	
        System.out.print("Enter the third number:");
        c = s.nextInt();
        g.greater(a,b,c);
        }
	}

}
