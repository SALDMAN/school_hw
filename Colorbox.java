public class Colorbox {
  private Color [] arr;
  private int count;
  
  
  //build function of the max colors
  public Colorbox(int maxcolornum) {
	  arr=new Color[maxcolornum];
	  count=0;
  }
  
  //adding color to the array
  public void addcolor(Color c) {
	  if(count<arr.length) {
		  arr[count]=new Color(c);
		  count++;  
	  }
  }
 
  //returns how much colors
  public int giveColornum(Color c) {
	  int camot;
	  camot=arr.length;
	  return camot;
  }
  
  //check the bigest size
  
  public double givebigsize(Color c) {
      double bigc=0;
	  for(int i=0;i<arr.length;i++) {
		  
		  if(bigc<arr[i].getOvi()) {
			  bigc=arr[i].getOvi();;
		  }
	  }
	  return bigc;
  }
  
  //check if there blue color
  
  public boolean isblue(Color c) {
	  boolean flag=false;
	  for(int i=0;i<arr.length&&!flag;i++) {
		  if(arr[i].getColor_namne().equals("blue")) {
			  flag=true;
		  }
	  }
	  return flag;
  }
  
public Color [] getArr() {
	return arr;
}

public void setArr(Color [] arr) {
	this.arr = arr;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}
}
