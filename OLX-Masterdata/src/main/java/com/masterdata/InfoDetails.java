package com.masterdata;

import java.util.Random;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class InfoDetails implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		Random random = new Random();
		int totaluser = random.nextInt(1000);
		int activeLogin = random.nextInt(100);
		builder.withDetail("total categories", totaluser);
		builder.withDetail("Total status", activeLogin);
		
				
		
	}

}
