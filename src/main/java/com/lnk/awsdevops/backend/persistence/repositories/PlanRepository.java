package com.lnk.awsdevops.backend.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lnk.awsdevops.backend.persistence.domain.backend.Plan;

@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}
