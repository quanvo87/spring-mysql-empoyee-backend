package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employees")
public class MainController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public @ResponseBody String addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return employee.toString() + " created!";
    }

    @GetMapping
    public @ResponseBody Iterable<Employee> employees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody String employee(@PathVariable Long id) {
        return employeeRepository.findOne(id).toString();
    }

    @PutMapping
    public @ResponseBody String updateEmployee(@RequestBody Employee user) {
        employeeRepository.save(user);
        return user.toString() + " updated!";
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String deleteEmployee(@PathVariable("id") Long id) {
        Employee user = employeeRepository.findOne(id);
        employeeRepository.delete(id);
        return user.toString() + " deleted!";
    }
}