//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.17 at 04:09:28 PM CDT 
//


package com.sunil.jaxb.classes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sunil.jaxb.classes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Name_QNAME = new QName("", "Name");
    private final static QName _Telephone_QNAME = new QName("", "Telephone");
    private final static QName _Email_QNAME = new QName("", "Email");
    private final static QName _Department_QNAME = new QName("", "Department");
    private final static QName _Employee_QNAME = new QName("", "Employee");
    private final static QName _EmployeeInfo_QNAME = new QName("", "Employee_Info");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sunil.jaxb.classes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeType }
     * 
     */
    public EmployeeType createEmployeeType() {
        return new EmployeeType();
    }

    /**
     * Create an instance of {@link EmployeeInfoType }
     * 
     */
    public EmployeeInfoType createEmployeeInfoType() {
        return new EmployeeInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Telephone")
    public JAXBElement<String> createTelephone(String value) {
        return new JAXBElement<String>(_Telephone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Department")
    public JAXBElement<String> createDepartment(String value) {
        return new JAXBElement<String>(_Department_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Employee")
    public JAXBElement<EmployeeType> createEmployee(EmployeeType value) {
        return new JAXBElement<EmployeeType>(_Employee_QNAME, EmployeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Employee_Info")
    public JAXBElement<EmployeeInfoType> createEmployeeInfo(EmployeeInfoType value) {
        return new JAXBElement<EmployeeInfoType>(_EmployeeInfo_QNAME, EmployeeInfoType.class, null, value);
    }

}
