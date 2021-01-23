package com.formation.parking.services.impl;

import com.formation.parking.dao.IParkingApiDao;


import com.formation.parking.dao.entities.RecordEntity;
import com.formation.parking.dao.entities.ReponseParkingApiEntity;
import com.formation.parking.models.Parking;

import com.formation.parking.services.IParkingService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// composant spring instanciable et injectable
public class ParkingServiceImpl implements IParkingService {
	
	@Autowired
	public IParkingApiDao parkingApiDao;
	
    public ArrayList<Parking> getListeParking() 
    {
    	/*
    	 * code servant de bouchon pour la méthode :
    	 * 
    	 * Parking parkingTest = new Parking();
         * parkingTest.setNom("Parking de test");
         * parkingTest.setNbPlacesTotal(300);
         * parkingTest.setNbPlacesDispo(125);
         * parkingTest.setStatus("OUVERT");
         * parkingTest.setHeureMaj("20h15");
         * 
         * ArrayList<Parking> listeParking = new ArrayList<Parking>();
         * listeParking.add(parkingTest);	
         * 
         */

    	ReponseParkingApiEntity reponse = parkingApiDao.getListeParking();
    	
        return transformeEntityToModel(reponse);
    }

    
	private ArrayList<Parking> transformeEntityToModel(ReponseParkingApiEntity reponse) 
	{
		ArrayList<Parking> listeParking = new ArrayList<Parking>();
		
		for (RecordEntity record : reponse.getRecords()) 
		{
			Parking parking = new Parking();
			
			parking.setNom(record.getFields().getGrpNom());
			parking.setStatut(record.getFields().getLibelleStatut());
			parking.setNbPlacesDispo(record.getFields().getGrpDisponible());
			parking.setNbPlacesTotal(record.getFields().getGrpExploitation());
			parking.setHeureMaj(record.getFields().getHeureFormatee());
			
			listeParking.add(parking);
		}
		
		return listeParking;
	}


	
}
