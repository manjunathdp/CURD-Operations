package com.mdp.CURD.service;

import com.mdp.CURD.model.Details;
import com.mdp.CURD.repo.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private DetailsRepo detailsRepo;
    public Details postService(Details details) {
        return detailsRepo.save(details);
    }
}
