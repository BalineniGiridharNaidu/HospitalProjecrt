package com.giridharan.appointmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giridharan.appointmentService.entity.appointment;

@Repository
public interface appointmentRepo extends JpaRepository<appointment, Integer>{

}
