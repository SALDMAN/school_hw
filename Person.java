package classs;

public class Person {
   private String name;
   private 	String familyname;
   private String city;
   public Date birthday;
// build function
public Person(String name,String familyname,String city,Date birthday) {
	  this.name=name;
	  this.familyname=familyname;
	  this.city=city;
	  this.birthday=birthday;
  }
//to get the name
public String getName() {
	return name;
}
//to set the name
public void setName(String name) {
	this.name = name;
}
// to get the last name
public String getFamilyname() {
	return familyname;
}
// to set the last name
public void setFamilyname(String familyname) {
	this.familyname = familyname;
}
//to get the city
public String getCity() {
	return city;
}
//to set the city
public void setCity(String city) {
	this.city = city;
}

//public Date getBirthday() {
	//return birthday;
//}
//public void setBirthday(Date birthday) {
	//this.birthday = birthday;
//}
public String Tostring() {
	   String st="";
	   st+="me name is:"+
	    name+
	   "last name:"+
	    familyname+
	   "city:"+
	    city+
	    "birthday:"+
	    birthday.ToString();
	   return st;
}
}
