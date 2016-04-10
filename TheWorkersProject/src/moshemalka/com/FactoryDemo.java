package moshemalka.com;

public class FactoryDemo {

	public static void main(String[] args) {
		Factory factory = new Factory("Moogle");
		
		Employee e1 = new Employee("John Adams", "Boston, MA", 2, 2400.00);
		e1.setDept(Department.Marketing);
		Employee e2 = new Employee("Mohamad Cohen", "Ambehta, UP", 3, 3600.00);
		Manager m1 = new Manager("Sandra Bolok", "New York, MN", 1, 7600.00, 3000);
		
		factory.addWorker(e1);
		factory.addWorker(e2);
		factory.addWorker(m1);
		
		System.out.println(factory);
		System.out.println();
		
		System.out.println("Total weekly pay in "
				+ factory.getFactoryName()
				+ " is "
				+ factory.computeTotalPayPerWeek());

//		System.out.println("No. of workers in "
//				+ factory.getFactoryName()
//				+ " is "
//				+ factory.noOfWorkers());
//		
//		System.out.println(factory);
//		
//		factory.ReadMail();
//		
//		Worker worstWorker = new Employee("John Adams", "Boston, MA", 2, 2400.00);
//		factory.FireWorker(worstWorker);
//		
		System.out.println("\nlist of workers after removal of Mohamad cohen");
		System.out.println(factory);
		
		
		
		Worker worstworker = new Employee("Mohamad Gadir", "Ambehta, UP", 3, 3600.00);
		if(factory.fireWorker(worstworker))
		{
			System.out.println(worstworker + " was fired");
		}
		
		else 
			System.out.println("Worker was not fired");
		
		
		
		System.out.println(factory);
		System.out.println();
		
		System.out.println("Total weekly pay in "
				+ factory.getFactoryName()
				+ " is "
				+ factory.computeTotalPayPerWeek());

	}

}
