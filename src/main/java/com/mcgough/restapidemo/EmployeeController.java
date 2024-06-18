package com.mcgough.restapidemo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    // generate a mutable list of sample employees that contain an id, name, and role
    private List<Employee> employees = new ArrayList<Employee>() {{
        add(new Employee(1, "John Doe", "Developer"));
        add(new Employee(2, "Jane Doe", "Manager"));
        add(new Employee(3, "Jim Doe", "CEO"));
    }};

    // return a list of all employees when the /employees endpoint is hit with a GET request. Use a ResponseEntity to return a 200 status code.
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok(employees);
    }


}
