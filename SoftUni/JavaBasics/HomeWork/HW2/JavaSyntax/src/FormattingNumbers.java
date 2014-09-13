import java.util.Scanner;


public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = scan.nextDouble(),c = scan.nextDouble();
		System.out.printf("|%10X",a);
		String binary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("|%s|",binary);
		System.out.printf("%10.2f|", b);
		System.out.printf("%-10.3f|", c);
		scan.close();
	}
}
