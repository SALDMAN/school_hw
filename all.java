package classs;

public class all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Point p1=new Point(3,5);
    Point p2= new Point(4,9);
    Line l= new Line(p1,p2);
    System.out.println(l);
    p1.setX(9);
    p2.setY(10);
    Line l2=new Line(p1,p2);
    System.out.println(l.ToString(p1, p2));
    System.out.println(l2.ToString(p1, p2));
    System.out.println(l.getdistance(p1, p2));
	}

}
