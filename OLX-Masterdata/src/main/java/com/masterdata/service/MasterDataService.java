package com.masterdata.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.masterdata.dto.AdvertiseCategory;
import com.masterdata.dto.AdvertiseStatus;


public interface MasterDataService {
	
	List<AdvertiseCategory> getAllCategories();
	
	List<AdvertiseStatus> getAllStats();
	
	public AdvertiseCategory getCategoryById(int id);
	
	public AdvertiseStatus getStatusById(int id);
	
	
	

}
