import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParkingDetailComponent } from './parking-detail.component';

describe('ParkingDetailComponent', () => {
  let component: ParkingDetailComponent;
  let fixture: ComponentFixture<ParkingDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParkingDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParkingDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
