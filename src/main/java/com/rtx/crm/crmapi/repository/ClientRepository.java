package com.rtx.crm.crmapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rtx.crm.crmapi.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
 