package com.konic.java.EmployeeManagementsystem;

import java.util.*;

public class EmployeeService {
	List<Employee> list = new LinkedList<Employee>();

	// using method i added employees to list
	public List<Employee> addEmployees() {
		list.clear();
		Employee e1 = new Employee(0, null, null);
		e1.setId(101);
		e1.setName("Hussain");
		e1.setDepartment("Hr");

		Employee e2 = new Employee(0, null, null);
		e2.setId(102);
		e2.setName("Khan");
		e2.setDepartment("It");

		Employee e3 = new Employee(0, null, null);
		e3.setId(101);
		e3.setName("Hussain");
		e3.setDepartment("Hr");

		Employee e4 = new Employee(0, null, null);
		e4.setId(103);
		e4.setName("Hassain");
		e4.setDepartment("It");

		Employee e5 = new Employee(0, null, null);
		e5.setId(104);
		e5.setName("Munna");
		e5.setDepartment("Admin");

		list.addLast(e1);
		list.addLast(e2);
		list.addLast(e3);
		list.addLast(e4);
		list.addLast(e5);
		return list;
	}

	// using method i removed duplicates
	public List<Employee> removeDuplicate() {
		addEmployees();

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}

		return list;
	}

	Set<Employee> set = new HashSet<>();

	// using method i converted list to set
	public Set<Employee> convertSet() {
		Set<Employee> set = new HashSet<>(list);
		return set;
	}

	// using method i have sort the data using comparable
	public List<Employee> sortEmployee() {
		addEmployees();
		System.out.println("List before sorting: ");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("List after sorting: ");
		return list;

	}

	// map object creation
	Map<Integer, Employee> map = new LinkedHashMap<>();

	// using method i have added data to map key= employee id and value= employee
	public Map<Integer, Employee> addMapData() {
		addEmployees();
		removeDuplicate();
		for (Employee e : list) {
			map.put(e.getId(), e);
		}
		return map;
	}

	// sort employees in tree map which provide auto sorting
	Set<Employee> tSet = new TreeSet<>();

	public Set<Employee> treeSet() {
		addEmployees();
		Set<Employee> tSet = new TreeSet<>(list);
		return tSet;
	}

	// retrieve employee in map using id
	public void retrieveUsingEntrySet() {
		addMapData();
		System.out.println("Employees with and value: ");
		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

	// removing elements
	public void removeEmployeeSafely(int id) {
		addMapData(); // load map data
		System.out.println("before removing : " + map.values());

		Iterator<Map.Entry<Integer, Employee>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, Employee> entry = itr.next();
			if (entry.getKey() == id) {
				itr.remove(); // SAFE removal
				System.out.println("Employee removed safely");
			}
		}
		System.out.println("map after removing index " + id + " " + map.values());
	}

	// FailFAst
	public void explainFailFast() {

		for (Employee e : list) {
			if (e.getId() == 101) {
				list.remove(e); // causes exception
			}
		}
	}

}
