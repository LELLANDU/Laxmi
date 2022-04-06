package project;
class Employ
{
	 private int empid;
	 private String name;
	 private double sal;
	 Employ()
	 {
		 empid=0;
		 name=null;
		 sal=0;
	 }
	 Employ(int empid,String name,double sal)
	 {
		 this.empid=empid;
		 this.name=name;
		 this.sal=sal;
	 }
	 Employ(Employ e)
	 {
		 this.empid=e.empid;
		 this.name=e.name;
		 this.sal=e.sal;
	 }
	 void display()
	 {
		 System.out.println(empid);
		 System.out.println(name);
		 System.out.println(sal);
	 }
}
public class App {

	public static void main(String[] args) {
     Employ e=new Employ();
     e.display();
     Employ e1=new Employ(101,"manasa",12000);
     e1.display();
     Employ e2=new Employ(e1);
     e2.display();
	}

}
