package com.mdp.CURD.service;

import com.mdp.CURD.model.Details;
import com.mdp.CURD.repo.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class PutService {
    @Autowired
    private DetailsRepo detailsRepo;
    public Details putService(Long id, Details details) {
        Details dbDetails=detailsRepo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Details not found for ID: " + id));
        dbDetails.setFirstName(details.getFirstName());
        dbDetails.setMiddleName(details.getMiddleName());
        dbDetails.setLastName(details.getLastName());
        return detailsRepo.save(dbDetails);
    }
}
