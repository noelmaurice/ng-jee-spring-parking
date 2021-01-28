import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ParkingsComponent } from './parkings/parkings.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import  { MatButtonModule }  from  '@angular/material/button' ;
import  { MatIconModule }  from  '@angular/material/icon' ; 
import { AppRoutingModule } from './app-rooting.module'
import { ParkingDetailComponent } from './parking-detail/parking-detail.component';


@NgModule({
  declarations: [
    AppComponent,
    ParkingsComponent,
    ParkingDetailComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatCardModule,
    MatProgressSpinnerModule,
    MatButtonModule,
    MatIconModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }