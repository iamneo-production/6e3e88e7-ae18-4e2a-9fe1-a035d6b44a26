import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserAddonsComponent } from './user-addons.component';

describe('UserAddonsComponent', () => {
  let component: UserAddonsComponent;
  let fixture: ComponentFixture<UserAddonsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserAddonsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserAddonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
