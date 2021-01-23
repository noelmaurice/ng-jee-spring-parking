package com.formation.parking.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.formation.parking.dao.IParkingApiDao;
import com.formation.parking.dao.entities.ReponseParkingApiEntity;

@Repository
//composant spring instanciable et injectable
public class ParkingApiDaoImpl implements IParkingApiDao {

	private static final String URL_API_OPEN_DATA = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut";
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public ReponseParkingApiEntity getListeParking() {
		// TODO Auto-generated method stub
		return restTemplate.getForEntity(URL_API_OPEN_DATA, ReponseParkingApiEntity.class).getBody();
	}

}
