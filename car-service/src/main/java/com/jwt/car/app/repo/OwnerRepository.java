package com.jwt.car.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.car.app.domain.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
