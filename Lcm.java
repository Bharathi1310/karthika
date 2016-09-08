# karthika
import java.util.Scanner;


public class Lcm {


	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the firstnumber");
		int a=in.nextInt();
		System.out.println("enter the secondnumber");
		int b=in.nextInt();
	    int max;
	    int min ;
	    int lcm = 0;
	    int x;
	    if(a>b){
	    	max=a;
	    	min=b;
	    }
	    else{
	    	min=a;
	    	max=b;
	    }
	    int i=0;
		while(i<=min){
			x=max*i;
			if(x%min==0){
				lcm=x;
		
			}
			i++;
			
		}System.out.println(lcm);
	}
}
		
