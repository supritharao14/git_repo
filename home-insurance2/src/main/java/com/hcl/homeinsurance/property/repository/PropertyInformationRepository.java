package com.hcl.homeinsurance.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.homeinsurance.property.entity.PropertyInformation;

@Repository
public interface PropertyInformationRepository extends JpaRepository<PropertyInformation, Long> {

}