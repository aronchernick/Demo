package demo.src.main.java.com.example.demo; 
  
import java.util.ArrayList; 
import java.util.List; 
  
// Class to store the list of 
// all the employees in an 
// Array List 
public class EmployeesList { 
  
    private List<Employee> employeeList; 
  
    // Method to return the list 
    // of employees 
    public List<Employee> getEmployeeList() 
    { 
  
        if (employeeList == null) { 
  
            employeeList 
                = new ArrayList<>(); 
  
                    
        } 
  
        return employeeList; 
  
            
    } 
  
    public void
    setEmployeeList( 
        List<Employee> employeeList) 
    { 
        this.employeeList 
            = employeeList; 
    } 
} 