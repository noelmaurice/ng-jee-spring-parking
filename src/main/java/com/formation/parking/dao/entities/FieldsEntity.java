package com.formation.parking.dao.entities;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {
	
	@JsonProperty(value="idObject")
	private int idObject;
	
	@JsonProperty(value="grp_identifiant")
	private int grpIdentifiant;
	
	@JsonProperty(value="grp_nom")
	private String grpNom;
	
	@JsonProperty(value="grp_exploitation")
	private int grpExploitation;
	
	@JsonProperty(value="grp_disponible")
	private int grpDisponible;
	
	@JsonProperty(value="grp_statut")
	private int grpStatut;
	
	@JsonProperty(value="grp_horodatage")
	private String grpHorodatage;
	
	
	public String getHeureFormatee() 
	{
		OffsetDateTime date = OffsetDateTime.parse(this.getGrpHorodatage());
		date = date.withOffsetSameInstant(ZoneOffset.UTC);
		
		return date.getHour() + "h" + date.getMinute() + " UTC";
	}


	public String getLibelleStatut() {
		
		switch (this.getGrpStatut()) 
		{
			case 1: {
				
				return "FERME";
			}
			case 2: {
				
				return "ABONNES";
			}
			case 5: {
				
				return "OUVERT";
			}
			default:
				
				return "Données non disponibles";
		}
	}

	
	public int getGrpIdentifiant() {
		return grpIdentifiant;
	}


	public void setGrpIdentifiant(int grpIdentifiant) {
		this.grpIdentifiant = grpIdentifiant;
	}

	
	public int getIdObject() {
		return idObject;
	}

	public void setIdObject(int idObject) {
		this.idObject = idObject;
	}

	public String getGrpNom() {
		return grpNom;
	}

	public void setGrpNom(String grpNom) {
		this.grpNom = grpNom;
	}

	public int getGrpExploitation() {
		return grpExploitation;
	}

	public void setGrpExploitation(int grpExploitation) {
		this.grpExploitation = grpExploitation;
	}

	public int getGrpDisponible() {
		return grpDisponible;
	}

	public void setGrpDisponible(int grpDisponible) {
		this.grpDisponible = grpDisponible;
	}

	public int getGrpStatut() {
		return grpStatut;
	}

	public void setGrpStatut(int grpStatut) {
		this.grpStatut = grpStatut;
	}

	public String getGrpHorodatage() {
		return grpHorodatage;
	}

	public void setGrpHorodatage(String grpHorodatage) {
		this.grpHorodatage = grpHorodatage;
	}

	
	

}
