package com.ajblima.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajblima.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
