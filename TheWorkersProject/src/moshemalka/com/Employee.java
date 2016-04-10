package moshemalka.com;

public class Employee extends Worker
{
	protected double salary; //Annual salary

	public Employee(String name, String address, int number, double
			salary)
	{
		super(name, address, number);
		setSalary(salary);
	}
	
	public void mailCheck()
	{
		System.out.println("Mailing check to Employee " + getName()
				+ " with weekly income " + salary);
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double newSalary)
	{
		if(newSalary >= 0.0)
		{
			salary = newSalary;
		}
	}
	
	public double computeWeeklyPay()
	{
		//System.out.println("Computing weekly salary pay for " + getName());
		return salary/52;
	}
	
	public String toString()
	{
		return super.toString() +  " " + salary + " ";
	}
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Employee) {
			Employee e = (Employee)obj;
			
			return (super.equals(obj) 
					&& this.salary == e.salary) ;
		}else {
			return false;
		}
	}
	
}