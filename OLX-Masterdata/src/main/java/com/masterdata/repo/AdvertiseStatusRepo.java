package com.masterdata.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masterdata.entity.AdvertiseStatusEntity;
@Repository
public interface AdvertiseStatusRepo extends JpaRepository<AdvertiseStatusEntity, Integer>{

}
