package spring_course.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import spring_course.rest.entity.Employee;

import java.util.List;

@Component
public class Communication {
    // для совершения HTTP request прописать зависимость в entity от бина RestTemplate из WebConfiguration
    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/spring_rest_json_app/api/employees";


    public List<Employee> showAllEmployees(){

        return null;
    }

    public Employee getEmployee(int id){

        return null;
    }

    public void saveEmployee(Employee employee){

    }

    public void deleteEmployee (int id){

    }


}
