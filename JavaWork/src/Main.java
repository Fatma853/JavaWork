
public class Main {

	public static void main(String[] args) {
		CreditManager creditManager= new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		// �nstance olusturmak , instance creation
		
		Customer customer= new Customer();
		customer.Id = 1;
		customer.City = "Ankara";
		
		//IoC Container
		CustomerManager customerManager= new CustomerManager(new Person(), new TeacherCreditManager());
		customerManager.giveCredit();
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.TaxNumber = "10000";
		company.CompanyName= "Ar�elik";
		company.Id= 100;
		
		
		Person person = new Person();
		person.FirstName = "Ahmet";

	}

}
