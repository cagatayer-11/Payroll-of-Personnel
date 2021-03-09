import java.util.ArrayList;

public class Chief extends FullTime{

	public Chief(String nameSurname, String registerNumber, String position,int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		
	}

	@Override
	// From FullTime class
	public void setOverWorkAndDayOfWork() { // In one method , I set all attributes.
		ArrayList <Integer> list = new ArrayList();
		list.add(getWorkingHour1());
		list.add(getWorkingHour2());
		list.add(getWorkingHour3());
		list.add(getWorkingHour4());
		for (Integer workHour : list) {
			if (workHour > 48) {
				super.setOverWorkSalary(8*15+super.getOverWorkSalary()) ;
				setDayOfWork(5*125+getDayOfWork());
			}
			else if (workHour >= 40) {
				super.setOverWorkSalary((workHour-40)*15+super.getOverWorkSalary())  ;
				setDayOfWork(5*125+getDayOfWork());
			}
				else {
				super.setOverWorkSalary(0+super.getOverWorkSalary());
				
			}
			
		
		
	}

	
	}
	
	@Override
	// Override from Personnel class.
	public void calculateSalary() {
		super.setSeverancePay();
		setOverWorkAndDayOfWork();
		double totalSalary = getDayOfWork() + getOverWorkSalary() +getSeverancePay();
		super.setTotalSalary(totalSalary);
	
	}

}