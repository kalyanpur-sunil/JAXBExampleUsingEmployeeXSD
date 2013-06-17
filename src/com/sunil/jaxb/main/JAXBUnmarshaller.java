package com.sunil.jaxb.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sunil.jaxb.classes.EmployeeInfoType;
import com.sunil.jaxb.classes.EmployeeType;

/**
 * 
 * @author Sunil Kalyanpur
 *
 */
public class JAXBUnmarshaller {

	public static void main(String[] args) {
		//create JAXBContext
		try {
			JAXBContext context = JAXBContext.newInstance("com.sunil.jaxb.classes");

			//Create UnMarshaller
			Unmarshaller unmarshaller = context.createUnmarshaller();

			//unmarshal input stream to get contentTree
			JAXBElement<?> contentTree = (JAXBElement<?>)unmarshaller.unmarshal(new FileInputStream("employee.xml"));

			EmployeeInfoType employeeInfo = (EmployeeInfoType)contentTree.getValue();
			
			//get employee list
			List<EmployeeType> employeeList = employeeInfo.getEmployee();

			//loop through list and print employee details
			for(EmployeeType employee : employeeList){
				System.out.println(employee.getName() +"\t"+ employee.getEmployeeNumber() +"\t"+employee.getDepartment() +"\t"+employee.getEmail() +"\t"+employee.getTelephone() +"\t");
			}


		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}






	}

}
