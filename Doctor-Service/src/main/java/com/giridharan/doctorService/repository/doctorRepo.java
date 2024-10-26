package com.giridharan.doctorService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giridharan.doctorService.entity.doctor;

@Repository
public interface doctorRepo extends JpaRepository<doctor, Integer>{

}
