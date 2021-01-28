import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router'
import { ParkingsComponent } from './parkings/parkings.component';
import { ParkingDetailComponent } from './parking-detail/parking-detail.component';

const appRoutes: Routes = [
  { path: 'parkings', component: ParkingsComponent },
  { path: 'parking/:id', component: ParkingDetailComponent },
  { path: '**', redirectTo: '/parkings'}
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }