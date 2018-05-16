import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { AppComponent } from './app.component';
import { InfoComponentComponent } from './info-component/info-component.component';
import {FieldsetModule} from 'primeng/fieldset';
import { ApplicationComponent } from './application/application.component';
import {DataViewModule} from 'primeng/dataview';
import { OfferComponent } from './offer/offer.component';

@NgModule({
  declarations: [
    AppComponent,
    InfoComponentComponent,
    ApplicationComponent,
    OfferComponent

  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FieldsetModule,
    FormsModule,
    DataViewModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
