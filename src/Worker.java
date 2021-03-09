import java.util.ArrayList;

public class Worker extends FullTime {

	public Worker(String nameSurname, String registerNumber, String position, int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		
	}

	@Override
	// From FullTime class
	public void setOverWorkAndDayOfWork() { // In one method , I set all attributes.
		ArrayList <Integer> list = new ArrayList();
		
		list.add(super.getWorkingHour1());
		list.add(super.getWorkingHour2());
		list.add(super.getWorkingHour3());
		list.add(super.getWorkingHour4());
		for (Integer workHour : list) {
			if (workHour > 50) {
				super.setOverWorkSalary(10*11+super.getOverWorkSalary()) ;
				super.setDayOfWork(5*105+super.getDayOfWork());
			}
			else if (workHour >= 40) {
				super.setOverWorkSalary((workHour-40)*11+super.getOverWorkSalary())  ;
				super.setDayOfWork(5*105+super.getDayOfWork());
			}
			else {
				super.setOverWorkSalary(0+super.getOverWorkSalary());
				
			}
			
		}
		
	}
	
	@Override
	// Override from Personnel class.
	public void calculateSalary() {
		setOverWorkAndDayOfWork();
		super.setSeverancePay();
		double totalSalary = getDayOfWork() + getOverWorkSalary() +getSeverancePay();
		super.setTotalSalary(totalSalary);
		
	}
	

	
	
	
	
	
	
	

	

	
}
