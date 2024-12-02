package com.versicule.decoraversiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.versicule.decoraversiculo.entities.Versicule;

public interface VersiculeRepository extends JpaRepository<Versicule, Long>{
    
}
