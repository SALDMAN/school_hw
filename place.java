package classs;

public class place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Date d= new Date(15,7,2010);
    Person p =new Person("dave","selon","new york",d);
    System.out.println(p);
    d.setDay(20);
    System.out.println(p.Tostring());
    Person p1=p;
    System.out.println(p1.Tostring());
    Person p2= new Person("adi","nom","pardes",d);
    System.out.println(p2.Tostring());
	}

}
