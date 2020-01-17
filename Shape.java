import java.util.*;

class Shape
{
	protected String colour="RED";
	
	Shape()
	{
		colour="BLUE";
	}
	Shape(String c)
	{
		colour=c;
	}
	
	String getColour()
	{
		return colour;
	}
	
	void setColour(String c)
	{
		colour=c;
	}
	
	
		
	
}


class Circle extends Shape
{
	protected float radius=1.0;
	
	Circle()
	{
		radius =1.0;
	}
	Circle(float r)
	{
		radius=r;
	}
	Circle(float r,String c)
	{
		super(c);
		radius=r;
	}
	float getRadius()
	{
		return radius;
	}
	void setRadius(float r)
	{
		radius=r;
	}	
	float getArea()
	{
		return (3.14*radius*radius);
	}
	float getPerimeter()
	{
		return (6.28*radius);
	}
}

class Rectangle extends Shape
{
	protected float width=1.0,length=1.0;

	Rectangle()
	{
		length =1.0;width=2.0;
	}
	Rectangle(float l,float w)
	{
		length=l;
		width=w;		
	}
	Rectangle(float l,float w,String c)
	{
		super(c);
		length=l;
		width=w;		
		
	}
	float getWidth()
	{
		return width;
	}
	float getLength()
	{
		return length;
	}
	void setWidth(float r)
	{
		width=r;
	}
	void setLength(float r)
	{
		length=r;
	}	
	float getArea()
	{
		return (length*width);
	}
	float getPerimeter()
	{
		return (2*(length+width));
	}


}


class Square extends Rectangle
{
	Square()
	{
		super(1.0,1.0);
	}
	Square(float s)
	{
		super(s,s);
	}
	Square(float s,String c)
	{
		super(s,s,c);
	}
	float getSide()
	{
		return getLength();
	}
	void setSide(float s)
	{
		setLength(s);
		setWidth(s);
	}
	float getArea()
	{
		return(s*s);
	}
	float getPerimeter()
	{
		return(4*s);
	}		
}


public class TestShape
{
	public static void main(String args[])
	{
		Circle C;
		Rectangle R;
		Square S;
		Scanner s=new Scanner(System.in);
		int ch,ch1;
		float x,y;
		String c;		
		do
		{
			System.out.print("\nMenu:\n1.Circle\n2.Rectangle\n3.Square\n4.Exit\n\nChoice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("\nCircle: 1.Default  2.Change radius  3. Change Radius and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						C=new Circle();
					}
					else if(ch1==2)
					{
						System.out.print("Radius: ");x=s.nextfloat();
						C=new Circle(x);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Radius: ");x=s.nextfloat();
						C=new Circle(x,c);
					
					}
					System.out.println("Area of the circle is: "+C.getArea()+"\nPerimeter of the circle is: "+C.getPerimeter());
					break;
		 
				case 2:
					System.out.print("\nRectangle: 1.Default  2.Change dimensions  3. Change dimensions and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						R=new Rectangle();
					}
					else if(ch1==2)
					{
						System.out.print("Length: ");x=s.nextfloat();
						System.out.print("Width: ");y=s.nextfloat();
						R=new Rectangle(x,y);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Length: ");x=s.nextfloat();
						System.out.print("Width: ");y=s.nextfloat();
						R=new Rectangle(x,y,c);
					
					}
					System.out.println("Area of the Rectangle is: "+R.getArea()+"\nPerimeter of the Rectangle is: "+R.getPerimeter());
					break;
				case 3:
					System.out.print("\nCircle: 1.Default  2.Change side  3. Change side and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						S=new Square();
					}
					else if(ch1==2)
					{
						System.out.print("Side: ");x=s.nextfloat();
						S=new Square(x);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Side: ");x=s.nextfloat();
						S=new Square(x,c);
					
					}
					System.out.println("Area of the Square is: "+S.getArea()+"\nPerimeter of the Square is: "+S.getPerimeter());
					break;
			}		
		}while(ch!=4);
	}
		
}
*************************************************************************
import java.io.*;
import java.util.*;
interface Student
{
float[] getMarks();
float calGPA();
}

public class Person
{
	private String name;
	private String address;
	Person(String n,String add)
	{
		name=n;
		address=add;
	}

	String getName()
	{
		return name;
	}
	
	String getAddress()
	{
		return address;
	}
	
	void setAddress(String ad)
	{
		address=ad;
	
	}
}

public class Employee extends Person
{
	private String empid;
	private String dept;
	private int basic;
	Employee(String n.String ad,int ei,String dep,int b)
	{
		super(n,ad);
		empid=ei;
		dept=dep;
		basic=b;
	}
	
	int getEmpid()
	{
	 return empid;
	}
	
	String getDept()
	{
		return dept;
	}
	
	void setDept(String d)
	{
		dept=d;
	}
	
	void setBasic(int b)
	{
		basic=b;
	}
	
	int getBasic()
	{
		return basic;
	}
	
	float calSalary()
	{
		float pay=0.0;
		pay=basic+(.6*basic)+(.1*basic);
		return pay;
	}
}

public class Faculty extends Employee
{
	private String designation;
	private String course;
	Faculty(String s,String a,int e,String d,int b,String des,String c)
	{
		super(s,a,e,d,b);
		designation=des;
		course=c;
	}
	
	String getDesig()
	{
		return designation;
	}
	
	void setDesig(String d)
	{
		designation=d;
	}
	
	void setCourse(String c)
	{
		course=	c;
	}
				
	String getCourse()
	{
		return course;
	}
	
	float calSalary()
	{
		System.out.println("Salary inside Faculty");
		float pay=0.0;
		pay=basic+(.6*basic)+(.1*basic);
		return pay;
	}
}

public class ResearchAssistant extends emplyee,implements Student
{
	private String project;
	private String course;
	int n;
	
	ResearchAssistant(String s,String a,int e,String d,int b,String p,String c)
	{
		super(s,a,e,d,b);
		project=p;
		course=c;
	}
	
	String getProject()
	{
		return project;
	}
	
	String get Course()
	{
		return course;
	}
	
	void setCourse(String c)
	{
		course=c;
	}
	
	public float[] getMarks()throes IOException			
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of marks");
		 n=Integer.parseInt(in.readLine());
		inti;
		float mark[]=new float[n];
		for(i=0;i<n;i++)
		{
		mark[i]=Float.parseFloat(in.readLine());
		}
		
		return mark;
	}
		
	public float calcGPA()
	{
		int i;
		float g[] =new float[n];
		float[] m=getmarks();
		float sum=0.0,cgpa=0.0
		for(int i=0;i<n;i++)
		     {
		       g[i]=(m[i]/10);
		     }
		 
		     for(int i=0;i<n;i++)
		     {
			sum+=g[i];
		     }
		 
		     cgpa=sum/n;
	
		return cgpa;
	}
	
	float calSalary()
	{
		System.out.println("Salary inside ResearchASSISTANT");
		float pay=0.0;
		pay=basic+(.6*basic)+(.1*basic);
		return pay;
	}
}

public class TestInterface
{
	public static void main(String args[])
	{
		Employee e;
		Faculty f;
		ResearchAssistant r;
		Scanner s=new Scanner(System.in);
		int ch,ch1;
		
		String c,x,y;
		String n,d,a;
		int e,b;
		do
		{
			System.out.print("\nMenu:\n1.EMPLOYEE\n2.FACULTY\n3.RESEARCHASSISTANT\n4.Exit\n\nChoice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("\nEMPLOYEE: 1.Default  2.Change department \n 3. Change basic \n4.Calculate Salary\nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	System.out.println("Enter the name");
						n=in.readLine();
						System.out.println("Enter the employee id");
						e=Integer.parseInt(in.readLine());	
						 
						System.out.println("Enter the address");
						a=in.readLine();	
						System.out.println("Enter the department");
						d=in.readLine())	
						System.out.println("Enter the basic pay");
						b=Integer.parseInt(in.readLine());	
						e=new Employee(n,a,e,d,b);
					}
					else if(ch1==2)
					{
						System.out.print("Department: ");x=s.nextLine();
						e.setDept(x)
					}
					else if(ch1==3)
					{
						System.out.print("Basic: ");c=s.nextInt();
						e.setBasic
					
					}
					else
					{
					x=e.calSal()
					System.out.println("Salary is"+x);
					
					break;
		 
				case 2:
					System.out.print("\nFACULTY: 1.Default  2.Change DESIGNATION 3. Change COURSE \n4.CALCULATE SALARY\nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
					System.out.println("Enter the name");
						n=in.readLine();
						System.out.println("Enter the employee id");
						e=Integer.parseInt(in.readLine());	
						 
						System.out.println("Enter the address");
						a=in.readLine();	
						System.out.println("Enter the department");
						d=in.readLine())	
						System.out.println("Enter the basic pay");
						System.out.println("Enter the designation;");
						String ds=s.nextLine();
						System.out.pintln("Entre the course");
						String c=s.nextLine()
						
						f=new Faculty(n,a,e,d,b,ds,c);
					}
					else if(ch1==2)
					{
						System.out.print("Designation: ");x=s.nextLine();
						f.setDesig();
					}
					else if(ch1==3)
					{
						System.out.print("Course: ");x=s.nextLine();
						f.setCourse();
						
					
					}
					else
					{
					
					System.out.println("Salary is: "+f.calSalary());
					break;
				case 3:
					System.out.print("\nReasearchAssistant: 1.Default  2.Change COURSE  3. GETMARKS \n4.CAL GPA\n5.CAL SALARY\n Choice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						System.out.println("Enter the name");
						n=in.readLine();
						System.out.println("Enter the employee id");
						e=Integer.parseInt(in.readLine());	
						 
						System.out.println("Enter the address");
						a=in.readLine();	
						System.out.println("Enter the department");
						d=in.readLine())	
						System.out.println("Enter the basic pay");b=s.nextInt();
						System.out.println("Enter the project;");
						String ds=s.nextLine();
						System.out.pintln("Entre the course");
						String c=s.nextLine()
						
						r=new ResearchAssistant(n,a,e,d,b,ds,c);
					else if(ch1==2)
					{
						System.out.print("Course: ");x=s.nextLine();
						r.setCourse();
						
					}
					else if(ch1==3)
					{
					float[] a=new float[100];
					a[]=r.getMarks();
					
					}
					else if*ch1==4)
					{
						System.out.println("The gpa is"r.calcGPA());
					}
					else
					{
					System.out.println("Salary is"+r.calSalary());
					}				
					break;
			}		
		}while(ch!=4);
	}
		
}

			
		
	
		

	
