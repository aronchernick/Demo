package demo.src.main.java.com.example.demo; 
  
import org.springframework
.stereotype
.Repository; 
  
// Importing the employees class to 
// use the defined properties 
// in this class 
import com.example.demo.EmployeesList; 
  
@Repository
  
// Class to create a list 
// of employees 
public class EmployeeDAO { 
  
    private static EmployeesList list 
        = new EmployeesList(); 
  
    // This static block is executed 
    // before executing the main 
    // block 
    static
    { 
  
        // Creating a few employees 
        // and adding them to the list 
        list.getEmployeeList().add( 
            new Employee( 
                1, 
                "Prem", 
                "Tiwari", 
                "chapradreams@gmail.com")); 
  
        list.getEmployeeList().add( 
            new Employee( 
                2, "Vikash", 
                "Kumar", 
                "abc@gmail.com")); 
  
        list.getEmployeeList().add( 
            new Employee( 
                3, "Ritesh", 
                "Ojha", 
                "asdjf@gmail.com")); 
  
            
    } 
  
    // Method to return the list 
    public EmployeesList getAllEmployees() 
    { 
  
        return list; 
    } 
  
        
        // Method to add an employee 
        // to the employees list 
        public void
        addEmployee(Employee employee) 
    { 
        list.getEmployeeList() 
            .add(employee); 
            
    } 
} 