package com.mdp.CURD.service;


import com.mdp.CURD.model.Details;
import com.mdp.CURD.repo.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetService {
    @Autowired
    private DetailsRepo detailsRepo;
    public List<Details> getService() {
        return detailsRepo.findAll();
}

}
