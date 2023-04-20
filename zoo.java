package pp;

public class zoo {
  public static void main(String[]args) {
	  boolean flag=true;
	  int Age;
	  Animal[]arr=new Animal[5];
	  arr[0]=new Animal("elf",8,"female",200,false,false);
	  arr[1]=new Animal("lion",6,"male",60,false,true);
	  arr[2]=new Animal("monkey",4,"male",60,false,false);
	  arr[3]=new Animal("karakal",5,"male",55,false,true);
	  arr[4]=new Animal("cat",4,"female",12,false,false);
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i].getgender().equals("female")) {
			  System.out.println(arr[i]);
		  }
	  }//-1 age for female animals
		  for(int i=0;i<arr.length;i++) {
			  Age=arr[i].getAge();
		      if(arr[i].getgender().equals("female")){
		    	  Age-=1;
		      }
		      else {
		    	  Age+=3;
		      }
            //arr[i].setAge(Age);
	  }
		  //the oldest animal
		  int oldIndex=0;
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i].getAge()>arr[oldIndex].getAge()) {
				  oldIndex=i;
			  }
		  }
		  //check the youngest that live in water
		  System.out.println("the oldest animal is");
		  System.out.println(arr[oldIndex]);
		  int newIndex=0;
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i].isliveinwater()==true) {
			   if(arr[i].getAge()<arr[newIndex].getAge()) {
				  newIndex=i;
			  }
			   
			  }
		  }
		  System.out.println("the youngest one is");
		  System.out.println(arr[newIndex]);
		  //int count=0;
		  //for(int i=0;i<arr.length&&flag;i++) {
		    // if(arr[i].gettoref()==true) {
		    	 //if(arr[i].getAge()>=10) {
		    	 //count++;
		    	// }
		    	 //if(count==2) {
		    	//	 flag=false;
		    //	 }
		  //}
		     //System.out.println("the two are");
		     //System.out.println(arr[count]);
  
}
}

