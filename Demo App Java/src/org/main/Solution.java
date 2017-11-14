package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dummy.emp.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Session session = sf.openSession();
		int i=0;
		while(i<3){
			i++;
		session.beginTransaction();
		
	
		
		System.out.print("Enter the phone:");
		long phone = Long.valueOf(bf.readLine());
		System.out.print("Enter the Email:");
		String emailId = bf.readLine();
		System.out.print("Enter the Name:");
		String name = bf.readLine();
		Employee emp = new Employee(name, emailId, phone);
	
		System.out.println("Name:" + emp.getName());
		System.out.println("Email:" + emp.getEmailId());
		System.out.println("Phone:" + emp.getPhone());
		session.save(emp);
		session.getTransaction().commit();
		}
		session.close();
	}
}