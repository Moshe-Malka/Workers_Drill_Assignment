package moshemalka.com;
public abstract class Worker
{
	protected String name;
	protected String address;
	protected int number;
	protected Department dept = Department.General;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Worker(String name, String address, int number)
	{
		//System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public void mailCheck()
	{
		System.out.println("Mailing a check to " + this.name
				+ " " + this.address);
	}

	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String newAddress)
	{
		address = newAddress;
	}
	
	public int getNumber()
	{
		return number;
	}

	public String toString()
	{
		return name + " " + address + " " + number;
	}

	public boolean equals(Object obj) {
		
		if (obj instanceof Worker) {
			Worker p = (Worker)obj;
			
			return (this.number == p.number 
					&& this.name.equals(p.name) 
					&& this.address.equals(p.address));
		}else {
			return false;
		}
	}
	
	public abstract double computeWeeklyPay();
}