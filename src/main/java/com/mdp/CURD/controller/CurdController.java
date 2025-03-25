package com.mdp.CURD.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/curd")
public class CurdController {
    @GetMapping("/get")
    public ResponseEntity<?>getInfo() {
        return ResponseEntity.ok("testing");
    }

}
