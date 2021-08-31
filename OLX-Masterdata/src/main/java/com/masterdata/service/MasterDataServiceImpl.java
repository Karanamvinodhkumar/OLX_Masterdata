package com.masterdata.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masterdata.dto.AdvertiseCategory;
import com.masterdata.dto.AdvertiseStatus;
import com.masterdata.entity.AdvertiseCategoryEntity;
import com.masterdata.entity.AdvertiseStatusEntity;
import com.masterdata.exception.InvalidIdException;
import com.masterdata.repo.AdvertiseCategoryRepo;
import com.masterdata.repo.AdvertiseStatusRepo;


@Service(value = "RDBMS")
public class MasterDataServiceImpl implements MasterDataService {
    
	@Autowired
	AdvertiseCategoryRepo categoryRepo;
	
	
	@Autowired
	AdvertiseStatusRepo statusrepo;
	
	
	@Override
	public List<AdvertiseCategory> getAllCategories() {
		List<AdvertiseCategoryEntity> categorylist = categoryRepo.findAll();
		List<AdvertiseCategory> list = new ArrayList<>();
		for(AdvertiseCategoryEntity categorydata:categorylist)
		{
			AdvertiseCategory abc = new AdvertiseCategory(categorydata.getId(),categorydata.getCategory());
			list.add(abc);
		}
		return list;
	}

	@Override
	public List<AdvertiseStatus> getAllStats() {
		List<AdvertiseStatusEntity> statusentity = statusrepo.findAll();
		List<AdvertiseStatus> list1 = new ArrayList<>();
		for(AdvertiseStatusEntity statusdata:statusentity)
		{
			AdvertiseStatus ads = new AdvertiseStatus(statusdata.getId(),statusdata.getStatus());
			list1.add(ads);
		}
		return list1;
	}

	@Override
	public AdvertiseCategory getCategoryById(int id) {
		Optional<AdvertiseCategoryEntity> entity = categoryRepo.findById(id);
		if(entity.isPresent())
		{
			AdvertiseCategoryEntity ade = entity.get();
			AdvertiseCategory ad = new AdvertiseCategory(id, ade.getCategory());
			return ad;
		}

        throw new InvalidIdException(""+id);
		
	}

	@Override
	public AdvertiseStatus getStatusById(int id) {
		Optional<AdvertiseStatusEntity> entity = statusrepo.findById(id);
		if(entity.isPresent())
		{
			AdvertiseStatusEntity ade = entity.get();
			AdvertiseStatus ad = new AdvertiseStatus(id, ade.getStatus());
			return ad;
		}

        throw new InvalidIdException(""+id);
	}

}
