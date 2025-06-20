//package practise.Algorithms_Data Structures.Exercise 4_Employee Management System;

import java.util.*;

class employee{
    int employeeId;
    String employeeName;
    String position;
    int salary;

    public employee(){
        this.employeeId = employeeId;
        this. employeeName = employeeName;
        this . position= position;
        this . salary = salary;
    }
    public employee(int employeeId, String employeeName, String position, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.position = position;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee Id: " + employeeId + 
                           " Name: " + employeeName + 
                           " Position: " + position + 
                           " Salary: " + salary);
    }
}

public class Employee_management {

    static final int max = 100;
    static employee emp[] = new employee[max];
    static int count = 0;
    
    
    public static void addemp(employee em){
        if(count<max){
            emp[count] = em;
            count++;
            System.out.println("Added");
        } else{
            System.err.println("List full");
        }
    } 


    public static employee search(int id ){
        for(int i = 0; i<count ; i++){
            if(emp[i].employeeId == id){
                return emp[i];
            }
        }
        return null;
    }

    public static void del(int id){
        for(int i = 0; i< count; i++){
            if(emp[i].employeeId == id){
                for(int j =i; j < count-1; j++){
                    emp[j] = emp[j+1];
                }
                emp[count-1] = null; 
                count--;    
                System.out.println("Deleted");
            }
        }
        System.out.println("Not found");
    }
    
    
    public static void display(){
        
        for(int i = 0; i< count; i++){
            emp[i].display();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
        while(flag){
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.println("-------------------------------");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print(" Employee Id ");
                    int employeeId = sc.nextInt();
                    System.out.print(" Employee name ");
                    String  employeeName = sc.next();
                    System.out.print(" Employee Position ");
                    String position = sc.next();
                    System.out.print(" Employee Salary ");
                    int salary = sc.nextInt();
                    employee em = new employee(employeeId, employeeName, position, salary);
                    addemp(em);
                    break;

                case 2:
                System.out.print("Enter Employee ID to search: ");
                int searchId = sc.nextInt();
                employee found = search(searchId);
                if (found != null) {
                    found.display();
                } else {
                    System.out.print("Employee not found.");
                }
                break;

                case 3:
                    System.out.println(" Employee Id to delete");
                    int d = sc.nextInt();
                    del(d);
                    break;

                case 4:
                    System.out.println("Employees in inventory:");
                    display();
                    break;
                
                case 5:
                    System.out.println("Exiting the program.");
                    flag = false;
                    break;

                default:
                    System.out.println("Try again");
            }
        }
    }
}
