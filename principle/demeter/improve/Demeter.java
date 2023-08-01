package com.atguigu.principle.demeter.improve;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Demeter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//employees in whole school
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//employees in college
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

// manager of college employees
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("college employee id= " + i);
            list.add(emp);
        }
        return list;
    }

    public void printAllEmployee(){
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------college employees------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

//manager of school employees
//find direct friends of class SchoolManager
//hint: direct friends occur as attribute/global variable, method parameter or method return value
//==> direct friends: Employee, CollegeManager
//==> indirect friends: CollegeEmployee, against demeter principle
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("school employee id= " + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        //CollegeEmployee occurs as local variable and counts to indirect friends
        //==> against demeter principle
        //List<CollegeEmployee> list1 = sub.getAllEmployee();

        sub.printAllEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------school employees------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
