package com.cg.assignment.employee;
/*
 * This is a program which calculates the annual salary, tax to be paid and other such details
 * All the calculated results are then printed
 */
public class Employee {
	private int employeeId;
	private String employeeName = new String();
	private double monthlyBasicSalary;
	private final int medicalAllowance = 1250;
	private final int conveyanceAllowance = 800;
	private double pfRate = 0.1;

	double getHra() {
		return (0.5 * monthlyBasicSalary);
	}

	double getPfRate() {
		return (pfRate);
	}

	void setPfRate(double pfRate) {
		this.pfRate = pfRate;
	}

	double getPf() {
		if ((getPfRate() * monthlyBasicSalary) < 6500) {
			return (getPfRate() * monthlyBasicSalary);
		} else
			return (6500);
	}

	int getProfessionalTax() {
		if (monthlyBasicSalary <= 10000) {
			return (50);
		} else
			return (100);
	}

	double getAnnualBasic() {
		return (12 * monthlyBasicSalary);
	}

	double getMonthlyGrossSalary() {
		return (monthlyBasicSalary + medicalAllowance + conveyanceAllowance + getHra());
	}

	double getAnnualGrossSalary() {
		return (12 * (getMonthlyGrossSalary()));
	}

	double getMonthlyDeductions() {
		return (getPf() + getHra() + getProfessionalTax());
	}

	double getMonthlyTakeHome() {
		return (getMonthlyGrossSalary() - getMonthlyDeductions());
	}

	double getAnnualTakeHome() {
		return (12 * getMonthlyTakeHome());
	}

	double getESIC() {
		if (monthlyBasicSalary <= 500) {
			return (0.0475 * monthlyBasicSalary);
		} else
			return (5000);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getMonthlyBasicSalary() {
		return monthlyBasicSalary;
	}

	public void setMonthlyBasicSalary(double monthlyBasicSalary) {
		this.monthlyBasicSalary = monthlyBasicSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", monthlyBasicSalary="
				+ monthlyBasicSalary + ", medicalAllowance=" + medicalAllowance + ", conveyanceAllowance="
				+ conveyanceAllowance + ", pfRate=" + pfRate + ", getHra()=" + getHra() + ", getPfRate()=" + getPfRate()
				+ ", getPf()=" + getPf() + ", getProfessionalTax()=" + getProfessionalTax() + ", getAnnualBasic()="
				+ getAnnualBasic() + ", getMonthlyGrossSalary()=" + getMonthlyGrossSalary()
				+ ", getAnnualGrossSalary()=" + getAnnualGrossSalary() + ", getMonthlyDeductions()="
				+ getMonthlyDeductions() + ", getMonthlyTakeHome()=" + getMonthlyTakeHome() + ", getAnnualTakeHome()="
				+ getAnnualTakeHome() + ", getESIC()=" + getESIC() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getEmployeeName()=" + getEmployeeName() + ", getMonthlyBasicSalary()=" + getMonthlyBasicSalary()
				+ "]";
	}

}
