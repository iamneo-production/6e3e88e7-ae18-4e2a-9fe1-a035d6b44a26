import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserAddonComponent } from './user-addon.component';

describe('UserAddonComponent', () => {
  let component: UserAddonComponent;
  let fixture: ComponentFixture<UserAddonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserAddonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserAddonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
