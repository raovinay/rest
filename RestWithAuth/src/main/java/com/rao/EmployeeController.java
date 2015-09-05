package com.rao;

import com.rao.data.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vinay on 7/23/2015.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    Map<Long, Employee> emps = new HashMap<>();
    @RequestMapping(method = RequestMethod.GET)
    public Employee getEmployee(@RequestParam(value="id") long id) {
        return emps.get(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Employee updateEmployee(@RequestParam(value="id") long id, @RequestParam(value="name") String name) {
        Employee employee = new Employee(id, name);
        emps.put(id, employee);
        return employee;
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Employee createEmployee(@RequestParam(value="id") long id, @RequestParam(value="name") String name) {
        Employee employee = new Employee(id, name);
        emps.put(id, employee);
        return employee;
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public Employee deleteEmployee(@RequestParam(value="id") long id) {
        return emps.remove(id);
    }
}
