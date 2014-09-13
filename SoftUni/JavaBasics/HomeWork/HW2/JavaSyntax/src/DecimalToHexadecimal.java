import java.util.Scanner;


public class DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.printf("%X",num);
		scan.close();
	}
}
