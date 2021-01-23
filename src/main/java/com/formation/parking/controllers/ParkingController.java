package com.formation.parking.controllers;

import com.formation.parking.models.Parking;
import com.formation.parking.services.IParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;


@RestController
// ce composant spring sera instancié et les méthodes retournerons des flux Json
public class ParkingController {

    @Autowired
    // le composant IParkingService sera instancié et injecté
    IParkingService parkingService;

    @RequestMapping(path = "/api/parkings", method = GET)
    // mapping entre la requête HTTP et la méthode Java
    public List<Parking> getListeParkings() 
    {
        return parkingService.getListeParking();
    }
}
