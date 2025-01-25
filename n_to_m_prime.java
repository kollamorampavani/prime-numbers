package loops;
import java.util.*;
public class n_to_m_prime {
	public static void printprime(int n,int m) {
		for(int i=n;i<=m;i++) {
			if(checkprime(i)) {
				System.out.println(i);
			}
		}
		
		
	}
	public static boolean checkprime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
			    return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("enter n and m");
       int n=scan.nextInt();
       int m=scan.nextInt();
       printprime(n,m);
       
	}

}
