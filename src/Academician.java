
public class Academician extends Personnel{
	// These attributes are unique to Academician.
	private int baseSalary ;
	private double ssBenefits ;
	
	
	public Academician(String nameSurname, String registerNumber, String position, int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		this.baseSalary = 2600;
		this.ssBenefits = 0;
	}
	
	// Getter methods .
	public int getBaseSalary() {
		return this.baseSalary;
	}
	
	// This one for overriding.
	public double getSsBenefits() {
		return this.ssBenefits;
	}

	

	//--------------------------------
	
	

	

}