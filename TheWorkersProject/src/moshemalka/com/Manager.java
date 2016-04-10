package moshemalka.com;

public class Manager extends Employee implements ExpensesEntitled{

	protected double yearlyBonus;
	protected double expenses;
	public Manager(String name, String address, int number, double
			salary, double bonus)
	{
		super(name, address, number, salary);
		setBonus(bonus);
	}

	public void mailCheck()
	{
		System.out.println("Mailing check to Manager " + getName()
				+ " with weekly income " + computeWeeklyPay());
	}
	
	public double getBonus()
	{
		return yearlyBonus;
	}
	
	public void setBonus(double newBonus)
	{
		if(newBonus >= 0.0)
		{
			yearlyBonus = newBonus;
		}
	}
	
	public double computeWeeklyPay()
	{
		//System.out.println("Computing weekly salary pay for " + getName());
		return (salary + yearlyBonus)/52;
	}
	
	public String toString()
	{
		return super.toString() +  " " + yearlyBonus + " ";
	}
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Manager) {
			return (super.equals(obj) 
					&& this.yearlyBonus == ((Manager)obj).yearlyBonus) ;
		}else {
			return false;
		}
	}

	@Override
	public void setExpenses(double expense) {
		this.expenses = Math.min(expense, 1000.0);
		
	}

	@Override
	public double getExpenses() {
		return this.expenses;
	}
}
