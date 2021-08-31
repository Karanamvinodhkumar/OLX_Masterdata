package com.masterdata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.masterdata.dto.AdvertiseCategory;
import com.masterdata.dto.AdvertiseStatus;
import com.masterdata.service.MasterDataService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/advertise")
public class AdvertiseStatusCategoryController {
	
	@Autowired
	@Qualifier(value = "RDBMS")
	MasterDataService masterDataService;
	
	@ApiOperation(value="Get all advertises",notes="To get all advertises")
	@GetMapping(value="/category",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AdvertiseCategory>> getAllCategories()
	{
		return new ResponseEntity<>(masterDataService.getAllCategories(),HttpStatus.OK);	
	}
	
	
	@ApiOperation(value = "Get status",notes="To get all status")
	@GetMapping(value="/status",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AdvertiseStatus>> getAllStatus()
	{
		return new ResponseEntity<List<AdvertiseStatus>>(masterDataService.getAllStats(),HttpStatus.OK);

	}
	
	@ApiOperation(value="Get category by id",notes="To get category by id")
	@GetMapping(value="/category/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdvertiseCategory> getCategoryById(@PathVariable int id)
	{

		return new ResponseEntity<>(masterDataService.getCategoryById(id),HttpStatus.OK);
	
	}
	
	@ApiOperation(value="Get status by id",notes="To get status by id")
	@GetMapping(value="/status/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdvertiseStatus> getStatusById(@PathVariable int id)
	{

		return new ResponseEntity<>(masterDataService.getStatusById(id),HttpStatus.OK);

	}
	
	
	
	
}
