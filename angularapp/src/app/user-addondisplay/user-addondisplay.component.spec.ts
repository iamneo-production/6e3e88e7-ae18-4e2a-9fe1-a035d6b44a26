import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserAddondisplayComponent } from './user-addondisplay.component';

describe('UserAddondisplayComponent', () => {
  let component: UserAddondisplayComponent;
  let fixture: ComponentFixture<UserAddondisplayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserAddondisplayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserAddondisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
