import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddonsDisplayComponent } from './addons-display.component';

describe('AddonsDisplayComponent', () => {
  let component: AddonsDisplayComponent;
  let fixture: ComponentFixture<AddonsDisplayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddonsDisplayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddonsDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
