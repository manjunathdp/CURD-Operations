package com.mdp.CURD.service;

import com.mdp.CURD.model.Details;
import com.mdp.CURD.repo.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DeleteService {
    @Autowired
    DetailsRepo detailsRepo;
    public Details deleteService(Long id) {
        Details dbDetails = detailsRepo.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Details NOT FOUND for ID "+id));
        detailsRepo.deleteById(id);
        return dbDetails;
    }
}
