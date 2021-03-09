import java.util.ArrayList;

public class FacultyMember extends Academician{
	
	// This attribute is unique to FacultyMember. 
	private int addCourseFee;

	public FacultyMember(String nameSurname, String registerNumber, String position, int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		this.addCourseFee = 0;
	}

	// Getter-setter method
	public int getAddCourseFee() {
		return addCourseFee;
	}


	public void setAddCourseFee() {
		ArrayList <Integer> list = new ArrayList();
	
		list.add(super.getWorkingHour1());
		list.add(super.getWorkingHour2());
		list.add(super.getWorkingHour3());
		list.add(super.getWorkingHour4());
		for (Integer workHour : list) {
			if (workHour >= 48) {
			addCourseFee += 8*20;
			}
			else if (workHour >= 40) {
			addCourseFee += (workHour-40)*20;
			}
		
		}
		
	}
	//---------------------------------------
	
	
	@Override
	// I override this method from Academician class.
	public double getSsBenefits() {
		return super.getBaseSalary()*((double)135/100);
	}
	
	
	
	
	@Override 
	// I override this method because I have to calculate salary and set to the totalSalary,from Personnel class.
	public void calculateSalary() {
		setAddCourseFee();
		super.setSeverancePay();
		double totalSalary =  getBaseSalary()+ getSsBenefits() +getSeverancePay()+ getAddCourseFee();
		super.setTotalSalary(totalSalary);
		
	}

	


	
	
	

	




}
