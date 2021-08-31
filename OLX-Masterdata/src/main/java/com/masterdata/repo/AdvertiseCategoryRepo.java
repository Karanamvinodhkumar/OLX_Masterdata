package com.masterdata.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masterdata.entity.AdvertiseCategoryEntity;
@Repository
public interface AdvertiseCategoryRepo extends JpaRepository<AdvertiseCategoryEntity, Integer> {

}
