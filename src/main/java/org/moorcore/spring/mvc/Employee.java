package org.moorcore.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;

    private String surName;

    private int salary;

    private String department;

    private String carBrand;

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
        languagesMap.put("Deutch", "DE");
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
