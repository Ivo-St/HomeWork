import java.util.Scanner;


public class PointsInFigure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble(),
				y=scan.nextDouble();
		if((x>=12.5&&x<=22.5)&&(y>=6&&y<=13.5)&&(!((x>17.5&&x<20)&&(y>8.5&&y<13.5)))){
			System.out.print("Inside");
		}
		else
			System.out.print("Outside");
		scan.close();
	}
}
