public class Dev{
	public static void main(String args[]){
		//Employee e = new Employee();
		TempEmployee te = new TempEmployee();
		te.print();
		//e.print();
	}	
}

class Employee{
	public void print(){
		System.out.println("\n "+ "I am Employee");
	}
}

class TempEmployee extends Employee{
	public void print(){
		super.print();
		System.out.println("\n"+"I am Temporary Employee");
	}
}		