import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FeaturedOmniyaComponent } from './featured-omniya.component';

describe('FeaturedOmniyaComponent', () => {
  let component: FeaturedOmniyaComponent;
  let fixture: ComponentFixture<FeaturedOmniyaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FeaturedOmniyaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FeaturedOmniyaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
