package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.Market;

@Repository
public interface Marketrepository extends JpaRepository<Market,Integer>{

}
