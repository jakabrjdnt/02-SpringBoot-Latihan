/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repositories;

import com.entities.Educations;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jakab
 */
public interface EducationRepository extends JpaRepository<Educations, Integer>{
    
}
