package com.sunil.jaxb.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sunil.jaxb.classes.EmployeeInfoType;
import com.sunil.jaxb.classes.EmployeeType;
import com.sunil.jaxb.classes.ObjectFactory;

public class JAXBMarshaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			//create JAXBContext
			JAXBContext context = JAXBContext.newInstance("com.sunil.jaxb.classes");

			//create Marshaller
			Marshaller marshaller = context.createMarshaller();

			//create employee
			EmployeeType emp1 = new EmployeeType();
			emp1.setName("Employee1");
			emp1.setEmployeeNumber(101);
			emp1.setTelephone("123-143-1231");
			emp1.setDepartment("Coding");
			emp1.setEmail("emp1@google.com");

			//create second employee
			EmployeeType emp2 = new EmployeeType();
			emp2.setName("Employee2");
			emp2.setEmployeeNumber(102);
			emp2.setTelephone("123-144-1231");
			emp2.setDepartment("Coding");
			emp2.setEmail("emp2@google.com");

			EmployeeInfoType emplInfoType = new EmployeeInfoType();
			List<EmployeeType> empList = (List<EmployeeType>)emplInfoType.getEmployee();
			empList.add(emp1);
			empList.add(emp2);

			marshaller.marshal(new ObjectFactory().createEmployeeInfo(emplInfoType), new FileOutputStream("output.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
