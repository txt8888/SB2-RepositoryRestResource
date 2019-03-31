package org.phan.hr.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tcp on 03/31/2019.
 */
@RestController
@Slf4j
public class HelloWorld {

    @RequestMapping("/hello")
    public String index() {
        HelloWorld.log.trace("A TRACE Message");
        HelloWorld.log.debug("A DEBUG Message");
        HelloWorld.log.info("An INFO Message");
        HelloWorld.log.warn("A WARN Message");
        HelloWorld.log.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}