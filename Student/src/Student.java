public class Student 
{

//int noofstudents;// 

//String Name;//
int roll;
public void setRoll(int R)
 {
	this.roll=R; 
}
public int getRoll()
{
	return roll;
 }
void display()
{
	System.out.println("Welcome to M12 Batch");
}
public static void main(String[] args) 
{

Student obj=new Student();
obj.display();
 obj.setRoll(10);
 System.out.println(obj.getRoll());
}
}