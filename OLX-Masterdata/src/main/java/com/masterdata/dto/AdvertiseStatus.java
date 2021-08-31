package com.masterdata.dto;

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
@ApiModel(value = "Model to get Advertise Status")
public class AdvertiseStatus {
	@ApiModelProperty(value="Id of Advertisestatus")
	private int id;
	
	@ApiModelProperty(value="status of Advertisestatus")
	private String status;

}
