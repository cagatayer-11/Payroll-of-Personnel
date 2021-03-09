
public class ResearchAssistant extends Academician{

	public ResearchAssistant(String nameSurname, String registerNumber, String position,int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		
	}

	
	@Override
	// I override this method from Academician class.
	public double getSsBenefits() {
		return super.getBaseSalary()*((double)105/100);
	}

	@Override
	// I override this method because I have to calculate salary and set to the totalSalary , from Personnel class.
	public void calculateSalary() {
		super.setSeverancePay();
		double totalSalary =  getBaseSalary()+ getSsBenefits() +getSeverancePay() ;
		super.setTotalSalary(totalSalary);
	
	}

	

}
