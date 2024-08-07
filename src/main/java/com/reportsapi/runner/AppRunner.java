package com.reportsapi.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.reportsapi.entity.EligibilityDetails;
import com.reportsapi.entity.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner{
    
	@Autowired
	private EligibilityDetailsRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	EligibilityDetails entity1 = new EligibilityDetails();
	entity1.setEligId(1);
	entity1.setName("Harshal");
	entity1.setMobile(123456789l);
	entity1.setGender('M');
	entity1.setSsn(123456789l);
	entity1.setPlanName("SNAP");
	entity1.setPlanStatus("Approved");
	repo.save(entity1);
	
	EligibilityDetails entity2 = new EligibilityDetails();
	entity2.setEligId(2);
	entity2.setName("Swapnil");
	entity2.setMobile(1235481l);
	entity2.setGender('M');
	entity2.setSsn(12345515l);
	entity2.setPlanName("SNAP");
	entity2.setPlanStatus("Approved");
	repo.save(entity2);
	
	EligibilityDetails entity3 = new EligibilityDetails();
	entity3.setEligId(3);
	entity3.setName("Swapnil");
	entity3.setMobile(1235481l);
	entity3.setGender('M');
	entity3.setSsn(12345515l);
	entity3.setPlanName("SNAP");
	entity3.setPlanStatus("Approved");
	repo.save(entity3);
	}
    
}
