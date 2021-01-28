import { Component, OnInit } from '@angular/core';
import { ParkingInfo } from '../parking_info_interface';
import { ActivatedRoute } from '@angular/router';
import { ParkingService } from '../parking.service';

@Component({
  selector: 'app-parking-detail',
  templateUrl: './parking-detail.component.html',
  styleUrls: ['./parking-detail.component.scss']
})
export class ParkingDetailComponent implements OnInit {

  parking: ParkingInfo;
  isLoaded: boolean = false;

  constructor(private route: ActivatedRoute, private parkingService: ParkingService) { }

  ngOnInit(): void {
    
    const parkingId = parseInt(this.route.snapshot.paramMap.get('id'));
    this.parkingService.getParking(parkingId).subscribe(
      reponse => {
        this.parking = reponse;
        this.isLoaded = true;
      }
    );
  }

}
