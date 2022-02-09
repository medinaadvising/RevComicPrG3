import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DiscountedOmniyaComponent } from './discounted-omniya.component';

describe('DiscountedOmniyaComponent', () => {
  let component: DiscountedOmniyaComponent;
  let fixture: ComponentFixture<DiscountedOmniyaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DiscountedOmniyaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DiscountedOmniyaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
