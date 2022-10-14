
public class CustomerManager {
	
	
	private Customer _customer;
	private ICreditManager _creditManager;
	public CustomerManager (Customer customer, ICreditManager creditManager)
	{
		_customer= customer;
	}
	public void save()
	{
		System.out.println("Müþteri kaydedildi : " );
	}
	
	public void delete()
	{
		System.out.println("Müþteri silindi : " );
	}
	
	public void giveCredit()
	{
		_creditManager.calculate();
		System.out.println("Kredi verildi.");
	}

}
