package classs;

public class Date {
   private int day;
   private int mounth;
   private int year;
public Date(int d,int m,int y) {
	day=d;
	mounth=m;
	year=y;
}
public int getDay() {
	return day;
}
public void setDay(int d) {
	day=d;
}
public int getMounth() {
	return mounth;
}
public void setMounth(int m) {
	mounth =m;
}
public int getYear() {
	return year;
}
public void setYear(int y) {
	year= y;
}
   public String ToString() {
	   String st="";
	   st+="the day:"+
	   day+
	   "the mounth is:"+
	   mounth+
	   "the year is:"+
	   year;
	   return st;
   }
}
