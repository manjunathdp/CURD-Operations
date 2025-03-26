package com.mdp.CURD.controller;


import com.mdp.CURD.model.Details;
import com.mdp.CURD.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/curd")
public class CurdController {
    @Autowired
    private GetService getService;
    @GetMapping("/get")
    public ResponseEntity<List<Details>> getInfo() {
        List<Details> details = getService.getService();
        //System.out.println("Fetched Data: " + details); // Debugging
        return ResponseEntity.ok(details);
    }


}
