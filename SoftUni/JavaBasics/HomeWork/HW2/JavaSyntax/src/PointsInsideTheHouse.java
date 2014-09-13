import java.awt.geom.Path2D;
import java.util.Scanner;


public class PointsInsideTheHouse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble(), y = scan.nextDouble();
		double[] Xarr = { 17.51 ,12.51, 12.51, 17.51, 17.51, 20.01, 20.01, 22.53, 22.53 };
		double[] Yarr = { 3.51, 8.51,  13.51, 13.51, 8.511,  8.51,  13.51, 13.53, 8.53 };
		Path2D house = new Path2D.Double();
		house.moveTo(Xarr[0], Yarr[0]);
		for(int i=1;i<Xarr.length;i++){
			house.lineTo(Xarr[i], Yarr[i]);
		}
		house.closePath();
		if(house.contains(x, y))
			System.out.println("Inside");
		else
			System.out.println("Outside");
		scan.close();
	}
}
