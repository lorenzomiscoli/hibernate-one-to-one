package com.lorenzomiscoli.hibernate_one_to_one;

import com.lorenzomiscoli.hibernate_one_to_one.entities.Employee;
import com.lorenzomiscoli.hibernate_one_to_one.entities.EmployeeDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("default");
		EntityManager em = emFactory.createEntityManager();
		em.getTransaction().begin();
		Employee employee = new Employee();
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employee.setDetails(employeeDetails);
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emFactory.close();
	}

}
