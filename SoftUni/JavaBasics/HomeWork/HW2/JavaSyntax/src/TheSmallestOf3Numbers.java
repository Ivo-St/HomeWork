import java.util.Scanner;

public class TheSmallestOf3Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
		double smallest = a;
		if(smallest>b)
			smallest=b;
		if(smallest>c)
			smallest=c;
		System.out.print(smallest);
		scan.close();
	}
}
