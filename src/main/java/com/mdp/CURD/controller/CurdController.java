package com.mdp.CURD.controller;


import com.mdp.CURD.model.Details;
import com.mdp.CURD.service.GetService;
import com.mdp.CURD.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curd")
public class CurdController {
    @Autowired
    private GetService getService;
    @Autowired
    private PostService postService;
    @GetMapping("/get")
    public ResponseEntity<List<Details>> getInfo() {
        List<Details> details = getService.getService();
        //System.out.println("Fetched Data: " + details); // Debugging
        return ResponseEntity.ok(details);
    }
    @PostMapping("/post")
    public ResponseEntity<Details> postInfo(@RequestBody Details details) {
        Details savedDetails = postService.postService(details);
        return ResponseEntity.ok(savedDetails);
    }


}
