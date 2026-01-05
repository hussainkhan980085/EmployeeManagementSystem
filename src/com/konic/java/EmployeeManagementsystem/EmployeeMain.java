package com.konic.java.EmployeeManagementsystem;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeService employeeService = new EmployeeService();
		System.out.println("===================");
		System.out.println("Add elements to list: " + employeeService.addEmployees());
		System.out.println("===================");
		System.out.println("List before removing duplicates: " + employeeService.list);
		System.out.println("list after removing duplicates: " + employeeService.removeDuplicate());
		System.out.println("===================");
		System.out.println("Add List to set: " + employeeService.convertSet());
		System.out.println("===================");
		System.out.println(employeeService.sortEmployee());
		System.out.println("===================");
		System.out.println("add data to map: " + employeeService.addMapData());
		System.out.println("===================");
		System.out.println("Add Data to tree set: " + employeeService.treeSet());
		System.out.println("===================");
		employeeService.retrieveUsingEntrySet();
		System.out.println("===================");
		employeeService.removeEmployeeSafely(101);
		System.out.println("===================");
		employeeService.explainFailFast();

	}

}
