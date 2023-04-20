
package pp;

public class Animal {
	private String name;
	private int Age;
	private String gender;
	private double weight;
	private boolean livesInWater;
	private boolean carnivore;
	public Animal(String name,int age,String gender,double waigth,boolean underwater,boolean toref) {
		this.name=name;
		this.Age=age;
		this.gender=gender;
		this.weight=weight;
		this.livesInWater=livesInWater;
		this.carnivore=carnivore;
	}
	public String getname() {
		return name;
	}
	public void setname() {
		this.name=name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge() {
		this.Age=Age;
	}
	public String getgender() {
		return gender;
	}
	public void setgender() {
		this.gender=gender;
	}
	public double getwaigth() {
		return weight;
	}
	public void setweigth() {
		this.weight=weight;
	}
	public boolean isliveinwater() {
		return livesInWater;
	}
	public void setunderwater() {
		this.livesInWater=livesInWater;
	
	}
	public boolean gettoref() {
		return carnivore;
	}
	public void settoref() {
		this.carnivore=carnivore;
		
	}
	public String toString() {
		  String str="Animal-"+"\n";
	      str += "the name:"+this.name+"\n";
	      str += "gender:"+this.gender+"\n";
	      str += "age:"+this.Age+"\n";
	      str += "weight" + this.weight+"\n";
	      if (this.carnivore)
		str += "is carnivore"+"\n";
	      else
	              str += "is not carnivore" + "\n";
	      if (this.livesInWater)
	              str += "is live in water"+"\n";
	      else
	              str += "is not live in water" + "\n";
	      return str;
	}
	
}