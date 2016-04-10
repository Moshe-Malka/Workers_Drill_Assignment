package moshemalka.com;
import java.util.ArrayList;


public class Factory {

	private String factoryName; 
	private ArrayList<Worker> workers;

	public Factory(String name){
		factoryName = name;
		workers = new ArrayList<Worker>();
	}

	public void addWorker(Worker p){
		workers.add(p);
	}

	public double computeTotalPayPerWeek(){
		double total = 0;
		for (Worker w:workers){
			total += w.computeWeeklyPay(); // computePay is abstract in Worker class!
		}
		return total;
	}

	public String toString() {
		String msg = "These are the workers of "+ this.factoryName + ":\n";

		for (Worker w:workers){
			msg += w.getClass().getName(); // type of worker
			msg += " ";
			msg += w; // p.toString() is called! 
			msg += "\n"; // newline after each worker
		}
		return msg;
	}

	public boolean fireWorker(Worker w){
		if (workers.contains(w)) { // use equals 
			workers.remove(w); // use equals 
			return true;
		} else{
			return false;
		}
	}
	
	
	public void ReadMail(){
	
		for (Worker p:workers){
			p.mailCheck();
		}
	}
	
	
	public String getFactoryName() {
		return factoryName;
	}

	public int noOfWorkers(){
		return workers.size();
	}

	public double computeTotalExpenses()
	{
		double total = 0;
		for (Worker w : workers) {
			if (w instanceof ExpensesEntitled)
			{
				total += ((ExpensesEntitled)w).getExpenses();
			}
		}
		return total;
	}
	






}
