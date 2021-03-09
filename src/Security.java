import java.util.ArrayList;

public class Security extends Personnel{
	// These attributes are unique to Security.
	private int hourOfWork;
	private int transMoney;
	private int foodMoney;
	
	public Security(String nameSurname, String registerNumber, String position, int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		// These numbers are default but I edit these according to working hours. 
		this.foodMoney = 4*6*10; 
		this.transMoney = 4*6*5;
		this.hourOfWork = 0;
	}
	
	// Getter-setter methods
	public void setHourOfWork() { 
		ArrayList <Integer> list = new ArrayList();
		list.add(super.getWorkingHour1());
		list.add(super.getWorkingHour2());
		list.add(super.getWorkingHour3());
		list.add(super.getWorkingHour4());
		for (Integer workHour : list) {
			if (workHour >= 54) {
				this.hourOfWork += 10*54;
			}
			else if (workHour >= 30) {
				this.hourOfWork += (workHour)*10;
			}
			else if (workHour < 30){
				this.hourOfWork += 0;
				this.transMoney -= 6*5;
				this.foodMoney -= 6*10;
			}
		}
	}
	
	public int getHourOfWork() {
		return this.hourOfWork;
	}
	
	public int getTransMoney() {
		return this.transMoney;
	}
	
	public int getFoodMoney() {
		return this.foodMoney;
	}
	
	//----------------------------------------------
	
	
	@Override
	// Override from Personnel class.
	public void calculateSalary() {
		setHourOfWork();
		super.setSeverancePay();
		double totalSalary =   getHourOfWork() + getTransMoney() +getFoodMoney()+ getSeverancePay();
		setTotalSalary(totalSalary);
	
	}

}
