package data;

public class Employee extends Person {
	protected int salary;
	protected String jobTitle;

	public Employee(int salary, String jobTitle) {
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	protected int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

	protected String getJobTitle() {
		return jobTitle;
	}

	protected void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", jobTitle=" + jobTitle + "]";
	}

}
