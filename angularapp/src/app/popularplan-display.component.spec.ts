import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PopularplanDisplayComponent } from './popularplan-display.component';

describe('PopularplanDisplayComponent', () => {
  let component: PopularplanDisplayComponent;
  let fixture: ComponentFixture<PopularplanDisplayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PopularplanDisplayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PopularplanDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
