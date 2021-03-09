import java.util.Calendar;

public class  Personnel {
// These  attributes are common  attributes of each personnel.
private String nameSurname;
private String registerNumber;
private String position;
private int yearOfStart;
private int currentYear;
private int workingHour1;
private int workingHour2;
private int workingHour3;
private int workingHour4;
private double severancePay;
private double totalSalary;

public Personnel(String nameSurname, String registerNumber, String position, int yearOfStart) {

	this.nameSurname = nameSurname;
	this.registerNumber = registerNumber;
	this.position = position;
	this.yearOfStart = yearOfStart;
	this.currentYear = 2020;

}


// Getter-setter methods

public double getSeverancePay() {
	return severancePay;
}

public void setSeverancePay() {
	this.severancePay = (getCurrentYear() - getYearOfStart()) * 20*0.8 ;
}


public double getTotalSalary() {
	return totalSalary;
}
public void setTotalSalary(double totalSalary) {
	this.totalSalary = totalSalary;
}


public String getNameSurname() {
	return this.nameSurname;
}


public String getRegisterNumber() {
	return this.registerNumber;
}


public String getPosition() {
	return this.position;
}


public int getYearOfStart() {
	return this.yearOfStart;
}



public int getWorkingHour1() {
	return workingHour1;
}
public void setWorkingHour1(int workingHour1) {
	this.workingHour1 = workingHour1;
}
public int getWorkingHour2() {
	return workingHour2;
}
public void setWorkingHour2(int workingHour2) {
	this.workingHour2 = workingHour2;
}
public int getWorkingHour3() {
	return workingHour3;
}
public void setWorkingHour3(int workingHour3) {
	this.workingHour3 = workingHour3;
}
public int getWorkingHour4() {
	return workingHour4;
}
public void setWorkingHour4(int workingHour4) {
	this.workingHour4 = workingHour4;
}


public void  calculateSalary() {
	
}
public int getCurrentYear() {
	return this.currentYear;
}


@Override
// From Object class
public String toString() { // for writing txt files.
	return String.format("%s : %s\n%s : %s\n%s : %s\n%s : %s\n%s : %d\n%s : %.2f %s",
			"Name",getNameSurname().split(" ")[0],
			"Surname",getNameSurname().split(" ")[1],
			"Registration Number",getRegisterNumber(),
			"Position",getPosition(),
			"Year of Start",getYearOfStart(),
			"Total Salary",getTotalSalary(),"TL");
}



}
