package Java2;
import java.util.Vector;

class Point11 {
	private int x,y;
	public Point11(int x, int y) {
		this.x =x;
		this.y =y;
	}
	public String toString() {
		return "(" + x + "," + y +")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point11> v= new Vector<Point11>();
		
		v.add(new Point11(2,3));
		v.add(new Point11(-5,20));
		v.add(new Point11(130,-8));
		
		v.remove(1);
		
		for(int i=0; i<v.size(); i++) {
			Point11 p = v.get(i);
			System.out.println(p);
		}
	}
}
