package moshemalka.com;

public class ContractWorker extends Worker implements ExpensesEntitled{

	protected int weeklyHoures;
	
	protected double travelExpenses;
	protected double foodExpenses;
	
	public int getWeeklyHoures() {
		return weeklyHoures;
	}

	public void setWeeklyhoures(int weeklyhoures) {
		this.weeklyHoures = weeklyhoures;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	protected double ratePerHour;
	
	public ContractWorker(String name, String address, int number, double rate , int hours)
	{
		super(name, address, number);
		this.weeklyHoures = hours;
		this.ratePerHour = rate;
	}
	
	@Override
	public double computeWeeklyPay() {
		
		return ratePerHour * weeklyHoures;
	}

	
	public String toString()
	{
		return super.toString() + " " + weeklyHoures + " " + ratePerHour + " ";
	}
	
public boolean equals(Object obj) {
		
		if (obj instanceof ContractWorker) {
			return (super.equals(obj) 
					&& this.weeklyHoures == ((ContractWorker)obj).weeklyHoures
					&& this.ratePerHour == ((ContractWorker)obj).ratePerHour);
		}else {
			return false;
		}
	}

@Override
public void setExpenses(double expense) {
	this.travelExpenses = expense/2;
	this.foodExpenses = expense/2;
}

@Override
public double getExpenses() {
	return this.travelExpenses + this.foodExpenses;
}
}
