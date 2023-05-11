
public class Color {
  private String color_name;
  private double ovi;
  private String type;
  
  //normal
  public Color(String color_name,double ovi,String type) {
	  this.color_name=color_name;
	  this.ovi=ovi;
	  this.type=type;
  }
  //copy
  public Color(Color c) {
	  this.color_name=c.color_name;
	  this.ovi=c.ovi;
	  this.type=c.type;
  }
public String getColor_namne() {
	return color_name;
}
public void setColor_namne(String color_name) {
	this.color_name = color_name;
}
public double getOvi() {
	return ovi;
} 
public void setOvi(double ovi) {
	this.ovi = ovi;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
  public String toString(String color_name,double ovi,String type) {
	  return "name:"+color_name+"ovi:"+ovi+"type:"+type;
  }
}
