package net.demoapps.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.demoapps.springboot.entity.WikimediaData;


public interface WikiMediaDataRepository extends JpaRepository<WikimediaData, Long>{
	
}

