package com.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.model.RegisteredNetwork;
@Repository
public interface RegisteredNetworkRepository extends JpaRepository<RegisteredNetwork, Integer>{

}
