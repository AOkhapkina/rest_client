package spring_course.rest;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import spring_course.rest.Communication;
import spring_course.rest.configurations.WebConfiguration;
import spring_course.rest.entity.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfiguration.class);
        Communication communication = context.getBean(Communication.class, "communication");
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

//        ResponseEntity<Employee> employee = communication.getEmployee(1);
//        System.out.println(employee);

        Employee employeeBiId= new Employee();
        employeeBiId = communication.getEmployeeById(2);
        System.out.println(employeeBiId);

        //Creating
        Employee newEmployee = new Employee("Garry", "Perl", "IT", 1100);
        communication.saveEmployee(newEmployee);
        //Updating
        Employee employee2 = new Employee("Svetlana", "Perova", "HR", 1000);
        employee2.setId(13);
        communication.saveEmployee(employee2);

        communication.deleteEmployee(150);


    }
}
