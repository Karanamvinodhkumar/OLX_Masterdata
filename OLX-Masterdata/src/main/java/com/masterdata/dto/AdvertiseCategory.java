package com.masterdata.dto;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@ApiModel(value="Model to get advertisecategory")
public class AdvertiseCategory {
	@ApiModelProperty(value="id of advertisecategory")
	private int id;
	@ApiModelProperty(value="category of advertisecategory")
	private String category;
	
	
	
	
	

}
