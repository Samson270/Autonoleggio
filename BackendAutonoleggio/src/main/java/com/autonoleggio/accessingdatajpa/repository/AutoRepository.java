package com.autonoleggio.accessingdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autonoleggio.accessingdatajpa.Auto;

public interface AutoRepository  extends JpaRepository<Auto, Long>{

}
