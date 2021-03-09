import java.util.ArrayList;

public class FullTime extends Employee{
	
	// These attributes are unique to FullTime.
	private int dayOfWork;
	private int overWorkSalary;
	
	
	public FullTime(String nameSurname, String registerNumber, String position, int yearOfStart) {
		super(nameSurname, registerNumber, position, yearOfStart);
		this.dayOfWork = 0;
		this.overWorkSalary=0;
	}


	
	// I write method because for use overriding in Chief and Worker classes.
	public void setOverWorkAndDayOfWork() {
		
		
	}
	
	
	// Getter-setter methods
	
	public int getOverWorkSalary() {
		return this.overWorkSalary;
	}
	public void setOverWorkSalary(int overWorkSalary) {
		this.overWorkSalary = overWorkSalary;
	}


		

	public void setDayOfWork(int dayOfWork) {
		this.dayOfWork = dayOfWork;
	}
	public int getDayOfWork() {
		return this.dayOfWork;
	}


	//--------------------------------------------


	
}
