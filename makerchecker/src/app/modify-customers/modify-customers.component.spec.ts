import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifyCustomersComponent } from './modify-customers.component';

describe('ModifyCustomersComponent', () => {
  let component: ModifyCustomersComponent;
  let fixture: ComponentFixture<ModifyCustomersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifyCustomersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifyCustomersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
