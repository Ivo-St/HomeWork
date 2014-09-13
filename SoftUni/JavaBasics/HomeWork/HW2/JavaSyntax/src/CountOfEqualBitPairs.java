import java.util.Scanner;


public class CountOfEqualBitPairs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print(ones(n)+zeros(n));
		scan.close();
	}
	public static int ones(int n){
		boolean flag = false;
		int result = 0;
		while(n>0){
			if(n%2==1){
				if(flag==true)
					result++;
				flag=true;
			}
			else
				flag=false;
			n/=2;
		}
		return result;
	}
	public static int zeros(int n){
		boolean flag = false;
		int result = 0;
		while(n>0){
			if(n%2==0){
				if(flag==true)
					result++;
				flag=true;
			}
			else
				flag=false;
			n/=2;
		}
		return result;
	}
}
