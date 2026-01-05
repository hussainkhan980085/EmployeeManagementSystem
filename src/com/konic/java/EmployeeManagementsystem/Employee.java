package com.konic.java.EmployeeManagementsystem;

import java.util.Objects;

public class Employee extends BasePerson implements Comparable<Employee> {

	private String Department;
	private static final String COMPANY_NAME = "Konic Technologies";

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Department);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Department, other.Department);
	}

	@Override
	public int compareTo(Employee o) {

		if (this.id < o.id) {
			return -1;
		} else if (this.id > o.id) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "(" + Department + " , " + id + " , " + name + ")";
	}

}
