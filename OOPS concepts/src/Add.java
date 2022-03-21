public class Add {
	 public void add(int x,int y) 
	 {      System.out.println("Add is"+(x+y));  
	 }     public void add(int x,int y,int z)  
	 {      System.out.println("Add is"+(x+y+z));   
	 }     public void add(int x,int y,int z,int q)  
	 {      System.out.println("Add is"+(x+y+z+q));   
	 }     public static void main(String[] args)    
	 {       Add ob=new Add();     
	 ob.add(4,5);   
	 ob.add(4,5,6); 
	 ob.add(4,5,6,7);  
	 }
}