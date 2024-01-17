package com.tutorials;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;


public class Pgm3 {
        
		private final List<Employee> employees;

		public Pgm3() {
			employees = Arrays.asList(
					new Employee(1, "Edward", "Admin", "Senior Executive", 15000d, LocalDate.of(2000, 4, 15)),
					new Employee(2, "Alice", "Admin", "Executive", 7000d, LocalDate.of(2000, 4, 15)),
					new Employee(3, "Bob", "HR", "Associate Executive", 5000d, LocalDate.of(2000, 4, 15)),
					new Employee(4, "Charlie", "HR", "Executive", 7000d, LocalDate.of(2000, 4, 15)),
					new Employee(5, "David", "IT", "Senior Executive", 15000d, LocalDate.of(2000, 4, 15)),
					new Employee(6, "Edward", "HR", "Executive", 7000d, LocalDate.of(2000, 4, 15)),
					new Employee(7, "Alice", "HR", "Executive", 7000d, LocalDate.of(2000, 4, 15)),
					new Employee(8, "Bob", "IT", "Executive", 7000d, LocalDate.of(2000, 4, 15)),
					new Employee(9, "Charlie", "Admin", "Executive", 7000d, LocalDate.of(2000, 4, 15)),
					new Employee(10, "David", "Admin", "Associate Executive", 7000d, LocalDate.of(2000, 4, 15)));
		}
		
		
		public List<Employee> getEmployeesWithSalaryAbove(Double amount) {
			//List<Employee> emp = employees.stream().filter(e->e.getSalary()>amount).collect(Collectors.toList());
			List<Employee> emp = new ArrayList<Employee>();
			for(Employee e: employees) {
				if(e.getSalary()>amount) {
					emp.add(e);
				}
			}
			return emp;
		}
		
		public List<Employee> getSortedEmployeesByDepartmentAndName()	{
			// Place your implementation logic here
			return null;
		}

		public Employee getEmployeeById(Integer id)	{
			 Employee e1 = employees.stream().filter(e->e.getId()==id).findAny().orElse(null);
			//Employee e1 = (Employee) employees.stream().filter
				/*
				 * Employee e1 = null; int flag=1; for(Employee e:employees) { if(e.getId()==id)
				 * { e1=e; flag=1; break;} else { flag=0; } } if(flag==1) { return e1; } else
				 * return null;
				 * 
				 * }
				 */
			 employees.forEach(e->System.out.println(e));
			 return e1;
		}

		public static void main(String args[]) {
			Pgm3 employeeManager = new Pgm3();
			System.out.println(employeeManager.getEmployeeById(6));
			//System.out.println(employeeManager.getEmployeesWithSalaryAbove(10000D));
			System.out.println(employeeManager.getSortedEmployeesByDepartmentAndName());
			//employeeManager.getEmployeeById(5);
		}
	}

	class Employee {

		private Integer id;

		private String name;

		private String department;

		private String designation;

		private Double salary;

		private LocalDate dateofJoining;

		public Employee(Integer id, String name, String department, String designation, Double salary,
				LocalDate dateofJoining) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.designation = designation;
			this.salary = salary;
			this.dateofJoining = dateofJoining;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		public LocalDate getDateofJoining() {
			return dateofJoining;
		}

		public void setDateofJoining(LocalDate dateofJoining) {
			this.dateofJoining = dateofJoining;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
					+ ", salary=" + salary + ", dateofJoining=" + dateofJoining + "]\n";
		}
		
		
	}



