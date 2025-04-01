package org.taskmanger.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taskmanger.crud.models.Customer;
import org.taskmanger.crud.models.Employee;
import org.taskmanger.crud.models.Pet;
import org.taskmanger.crud.models.Task;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/task/add/{taskName}/{assignedTo}/{priority}/{resolutionTime}")
    public String addtask(@PathVariable String taskName, @PathVariable String assignedTo, @PathVariable int priority, @PathVariable String resolutionTime) {
        Task myTask=new Task();
        myTask.setTaskName(taskName);
        myTask.setAssignedTo(assignedTo);
        myTask.setPriority(priority);
        myTask.setResolutionTime(resolutionTime);
        return "Your Task name is  "+ myTask.getTaskName() + ".Assigned To: "+myTask.getAssignedTo()+  ".Priority: " + myTask.getPriority() +". Resolution Time: " + myTask.getResolutionTime();
    }

    @GetMapping("/petdetails/{petName}/{petAge}/{petWeight}/{petOwner}")
    public String petdetails(@PathVariable String petName, @PathVariable int petAge,@PathVariable long petWeight, @PathVariable String petOwner){
    Pet mypet=new Pet();
    mypet.setPetName(petName);
    mypet.setPetAge(petAge);
    mypet.setPetWeight(petWeight);
    mypet.setPetOwner(petOwner);
        return "The pet name is " +mypet.getPetName()+ " Pet Age: " +mypet.getPetAge()+ " Pet Weight: " +mypet.getPetWeight()+ " Pet Owner: "+mypet.getPetOwner();
    }

    @GetMapping("/employeedetails/{employeeName}/{employeeId}/{employeeDepartment}/{Salary}")
    public String employeedetails(@PathVariable String employeeName, @PathVariable int employeeId,@PathVariable String employeeDepartment, @PathVariable double Salary){
        Employee employee=new Employee();
        employee.setEmployeeName(employeeName);
        employee.setEmployeeId(employeeId);
        employee.setEmployeeDepartment(employeeDepartment);
        employee.setSalary(Salary);
        return "Employee Name: " +employeeName+ " Employee Id: " +employeeId+ " Employee Department: "+employeeDepartment+ " Employee Salary " +Salary;
    }
    @GetMapping("/customerdetails/{customerName}/{customerAge}/{customerEmail}/{customerCity}")
    public String customerdetails(@PathVariable String customerName,@PathVariable int customerAge,@PathVariable String customerEmail,@PathVariable String customerCity){
        Customer customer=new Customer();
        customer.setCustomerName(customerName);
        customer.setCustomerAge(customerAge);
        customer.setCustomerEmail(customerEmail);
        customer.setCustomerCity(customerCity);
        return " Customer Name: "+customerName+" Customer Age: "+customerAge+ " Customer Email: "+customerEmail+" Customer City: " +customerCity;
    }

}
