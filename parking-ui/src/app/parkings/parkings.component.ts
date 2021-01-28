import { Component, OnInit } from '@angular/core';
import { ParkingInfo } from '../parking_info_interface';
import { ParkingService } from '../parking.service';

@Component({
  selector: 'app-parkings',
  templateUrl: './parkings.component.html',
  styleUrls: ['./parkings.component.scss']
})
export class ParkingsComponent implements OnInit {

  parkings: ParkingInfo[];
  isLoaded: Boolean = false;

  constructor(private parkingService : ParkingService) { }

  ngOnInit(): void {
    this.parkingService.getParkings().subscribe(
      reponse => {
        this.parkings = reponse;
        this.isLoaded = true;
      }
    );
  }

  calculStyleStatut(parking: ParkingInfo) {
    if(parking.statut === 'OUVERT') {
      return {color: 'green'};
    } else if (parking.statut === 'ABONNES'){
      return {color: 'orange'};
    } else if (parking.statut === 'FERME'){
      return {color: 'red'};
    } else { 
      return {'font-style': 'italic'};
    }
  }

}
