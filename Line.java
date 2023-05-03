package classs;

public class Line {
   private Point p1;
   private Point p2;
  public Line(Point p1,Point p2 ) {
	  this.p1=new Point(p1.getX(),p1.getY());
	  this.p2=new Point(p2.getX(),p2.getY());
  }
  public String ToString(Point p1,Point p2) {
	  String st="";
	  st+="point1:"+p1.ToString()+"point2:"+p2.ToString();
	  return st;
  }
  public Point getpoint1() {
	  return new Point(p1.getX(),p1.getY());
  }
  public void setpoint1(Point p1) {
	  this.p1=p1;
  }
  public Point getpoint2() {
	  return new Point(p2.getX(),p2.getY());
  }
  public void setpoint2(Point p2) {
	  this.p2=p2;
  }
  public double getdistance(Point p1,Point p2) {
	  return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
  }

}
