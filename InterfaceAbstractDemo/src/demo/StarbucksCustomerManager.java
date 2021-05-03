package demo;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	private PersonCheckService personCheckService;
	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		 
		this.personCheckService = personCheckService;
	}
	@Override
	public void Save(Customer customer) throws Exception {
		if(personCheckService.CheckIfPerson(customer))
			super.Save(customer);
		else
			throw new Exception("Not a valid person");
		
	}

	
}
