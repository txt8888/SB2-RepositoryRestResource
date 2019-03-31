package org.phan.hr.controller;

import lombok.extern.slf4j.Slf4j;
import org.phan.hr.model.Department;
import org.phan.hr.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tcp on 03/31/2019.
 */
@RestController
@Slf4j
public class HelloWorld {

    @Autowired
    DepartmentRepository repository;

    @RequestMapping("/hello")
    public String index() {
        HelloWorld.log.trace("A TRACE Message");
        HelloWorld.log.debug("A DEBUG Message");
        HelloWorld.log.info("An INFO Message");
        HelloWorld.log.warn("A WARN Message");
        HelloWorld.log.error("An ERROR Message");

        List<Department> departments = this.repository.findAll();
        for (Department department : departments) {
            HelloWorld.log.info("employee: " + department.getName());
        }

        return "Howdy! Check out the Logs to see the output...";
    }
}