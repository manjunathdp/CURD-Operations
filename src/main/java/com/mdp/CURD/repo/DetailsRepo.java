package com.mdp.CURD.repo;

import com.mdp.CURD.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepo extends JpaRepository<Details,Long> {
}
