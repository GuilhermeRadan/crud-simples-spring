package com.api.cruddress.repositories;

import com.api.cruddress.models.DressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface DressRepository extends JpaRepository<DressModel, UUID> {
}
