import java.util.ArrayList;

public class PartTime extends Employee{
	private int hourOfWork;

	public PartTime(String nameSurname, String registerNumber, String position, int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		this.hourOfWork = 0;
	}
	
	// Getter-setter methods
	
	public void setHourOfWork() {
		ArrayList <Integer> list = new ArrayList();
		hourOfWork = 0;
		list.add(super.getWorkingHour1());
		list.add(super.getWorkingHour2());
		list.add(super.getWorkingHour3());
		list.add(super.getWorkingHour4());
		for (Integer workHour : list) {
			if (workHour > 20) {
				hourOfWork +=20*18;
			}
			else if (workHour >= 10) {
				hourOfWork += workHour*18 ;
			}
			else {
				hourOfWork += 0;		
			}
		}
	}
	public int getHourOfWork() {
		return hourOfWork;
	}
	
	
	
	
	@Override
	// Override from Personnel class.
	public void calculateSalary() {
		setHourOfWork();
		super.setSeverancePay();
		double totalSalary = getHourOfWork() +getSeverancePay();
		super.setTotalSalary(totalSalary);
		
	}


}
