package com.masterdata.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "advertisecategory")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AdvertiseCategoryMongoEntity {
	
    @Id
	private int id;
	
	private String category;

}
