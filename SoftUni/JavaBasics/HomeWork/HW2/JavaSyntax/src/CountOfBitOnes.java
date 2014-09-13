import java.util.Scanner;


public class CountOfBitOnes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(),result=0;
		while(n>0){
			if(n%2==1)
				result++;
			n/=2;
		}
		System.out.print(result);
		scan.close();
	}
}
