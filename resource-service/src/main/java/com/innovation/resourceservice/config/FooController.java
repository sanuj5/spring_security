package com.innovation.resourceservice.config;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class FooController {
 
    @PreAuthorize("hasAuthority('custom')")
    @RequestMapping(method = RequestMethod.GET,  value = "/foo")
    @ResponseBody
    @CrossOrigin
    public String findById() {
        return "Sanuj";
    }
}