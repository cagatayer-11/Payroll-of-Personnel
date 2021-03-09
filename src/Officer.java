import java.util.ArrayList;

public class Officer extends Personnel{
	
	// These attributes are unique to Officer.
	private int baseSalary;
	private double ssBenefits;
	private int overWorkSalary;
	
	public Officer(String nameSurname, String registerNumber, String position,int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		this.baseSalary = 2600;
		this.ssBenefits=0;
		this.overWorkSalary = 0;
	}

	
	// Getter-setter method

	public double getSsBenefits() {
		return this.baseSalary*((double)65/100);
	}

	
	public void setOverWorkSalary() {
		ArrayList <Integer> list = new ArrayList();
		list.add(super.getWorkingHour1());
		list.add(super.getWorkingHour2());
		list.add(super.getWorkingHour3());
		list.add(super.getWorkingHour4());
		for (Integer workHour : list) {
			if (workHour >= 50) {
				 overWorkSalary += 10*20;
			}
			else if (workHour >= 40) {
				 overWorkSalary += (workHour-40)*20;
			}
			
		}
	}
	public int getOverWorkSalary() {
		return overWorkSalary;
	}
	
	//--------------------------------------------------
	
	@Override
	// Override from Personnel class.
	public void calculateSalary() {
		setOverWorkSalary();
		super.setSeverancePay();
		double totalSalary =   this.baseSalary + getSsBenefits()  +getSeverancePay() + getOverWorkSalary();
		setTotalSalary(totalSalary);
		
	}
}
