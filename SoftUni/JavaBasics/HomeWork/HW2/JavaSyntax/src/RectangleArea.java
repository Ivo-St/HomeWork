import java.util.Scanner;


public class RectangleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(),
				b = scan.nextInt();
		System.out.print(a*b);
		scan.close();
	}
}
