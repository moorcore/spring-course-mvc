package org.moorcore.spring.mvc;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 33, message = "* Name must be between 2 and 33 symbols")
    @NotBlank(message = "* Name is a required field")
    private String name;

    @Size(min = 2, max = 33, message = "* Surname must be between 2 and 33 symbols")
    @NotBlank(message = "* Surname is a required field")
    private String surName;
    
    @Min(value = 700, message = "* Must be greater than 699")
    @Max(value = 3500, message = "* Must be less than 3501")
    private int salary;

    private String department;

    private String carBrand;

    @Pattern(regexp = "\\d{3}-\\{2}-\\d{2}", message = "* Please use pattern XXX-XX-XX")
    private String phoneNumber;

    private Map<String, String> departments;

    private Map<String, String> carBrands;

    private String[] languages;

    private Map<String, String> languagesMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("Dodge Challenger", "Challenger");
        carBrands.put("Ford Mustang", "Mustang");
        carBrands.put("Dodge Charger", "Charger");

        languagesMap = new HashMap<>();
        languagesMap.put("English", "EN");
        languagesMap.put("Deutsch", "DE");
        languagesMap.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name = '" + name + '\'' +
                ", surName = '" + surName + '\'' +
                ", salary = " + salary +
                ", department = '" + department + '\'' +
                '}';
    }
}
