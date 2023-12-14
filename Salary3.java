class Employee
{
	String name,mail;
	float basic,gross;
	void salary()
	{
		float da,hra,pf,cf;
		da=basic*97/100;
		hra=basic*10/100;
		pf=basic*12/100;
		cf=basic*0.1f/100;
		gross=basic+da+hra-pf-cf;
		
		System.out.println("Name of Employee - "+name);
		System.out.println("Basic Salary of Employee - "+basic);
		System.out.println("Mail of  Employee - "+mail);
		System.out.println("Gross sal of Employee - "+gross);
		System.out.println("\n");
	}
};
class Programmer extends Employee
{
	Programmer(String name1,int sal,String mail1)
	{
		System.out.println("Programmer Salary Details");
		name=name1;
		mail=mail1;
		basic = sal;
		System.out.println("\n");
	}
}
class TeamLead extends Employee
{
	TeamLead(String name1,int sal,String mail1)
	{
		System.out.println("TeamLead Salary Details");
		name=name1;
		mail=mail1;
		basic = sal;
		System.out.println("\n");
	}
}
class APM extends Employee
{
	APM(String name1,int sal,String mail1)
	{
		System.out.println("APM Salary Details");
		name=name1;
		mail=mail1;
		basic = sal;
		System.out.println("\n");
	}
}
class ProjectManager extends Employee
{
	ProjectManager(String name1,int sal,String mail1)
	{
		System.out.println("ProjectManager Salary Details");
		name=name1;
		mail=mail1;
		basic = sal;
		System.out.println("\n");
	}
}
public class Salary3
{
	public static void main(String args[])
	{
		Programmer p = new Programmer("Suresh Mishra",60000,"suresh9@gmail.com");
		p.salary();
		
		TeamLead t =new TeamLead("Rohit Sharma",70000,"rohit15@gmail.com");
		t.salary();
		
		APM a = new APM("Virat Kohli",90000,"rohitsharma2@gamil.com");
		a.salary();
		
		ProjectManager m = new ProjectManager("Hardik Pandya",100000,"hardikpandya@gmail.com");
		m.salary();
		
	}
}