package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.Payload;

public interface PayloadRepository extends JpaRepository<Payload, Integer>{

	public Payload findPayloadById(int id);
	public boolean existsById(int id);
	public Payload findByShipperId(String shipperId);
}
