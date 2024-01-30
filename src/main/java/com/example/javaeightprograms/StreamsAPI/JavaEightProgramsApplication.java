package com.example.javaeightprograms.StreamsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JavaEightProgramsApplication {

	static List<Employee> employees = new ArrayList<>();

	static {
		employees.add(
				new Employee("akshay","chaganthi",10000.00, List.of("Maths project","social project"))
		);

		employees.add(
				new Employee("Sonia","chaganthi",125000.00, List.of("biology project","physics project"))
				);

		employees.add(
				new Employee("azzu","choud",1035000.00, List.of("chemistry project","botny project"))
				);
	}


	public static void main(String[] args) {

		//SpringApplication.run(JavaEightProgramsApplication.class, args);

		employees.stream().
				forEach(employee -> System.out.println(employee)
		);

		//map
		//Collect
		List<Employee> increasedSalary =  employees.stream()
				.map(employee -> new Employee(
						employee.getFirstName(),
						employee.getLastName(),
						employee.getSalary() * 1.10,
						employee.getProjects()
						))
				.collect(Collectors.toList());

		System.out.println("Increased Salary of employee " +increasedSalary);

		//Filter operation

		Employee filterEmployee =
				employees.stream()
						.filter(employee -> employee.getSalary() > 12000)
						.map(employee -> new Employee(
								employee.getFirstName(),
								employee.getLastName(),
								employee.getSalary(),
								employee.getProjects()
								)
						)
						.findFirst()
						.orElse(null);
		System.out.println("Filter employee list...."+filterEmployee);

		//flatMapp

		String projects =
				employees.stream()
						.map(employee -> employee.getProjects())
						.flatMap(strings -> strings.stream())
						.collect(Collectors.joining(","));

		System.out.println(projects);
	}

}
