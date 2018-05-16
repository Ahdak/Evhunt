import { Component, OnInit } from '@angular/core';
import {Offer} from './offer';
import {OfferService} from './offer.service';
import {SelectItem} from 'primeng/api';

@Component({
  selector: 'app-offer',
  templateUrl: './offer.component.html',
  styleUrls: ['./offer.component.css']
})
export class OfferComponent implements OnInit {
  offers: Offer[];
  selectedOffer: Offer;

  displayDialog: boolean;

  sortOptions: SelectItem[];

  sortKey: string;

  sortField: string;

  sortOrder: number;

  constructor(private offerService: OfferService) { }

  ngOnInit() {
    this.offerService.getOfferList().then(offers => this.offers = offers);
    this.sortOptions = [
      {label: 'Newest First', value: '!year'},
      {label: 'Oldest First', value: 'year'},
      {label: 'Brand', value: 'brand'}
    ];
  }

  selectOffer(event: Event, offer: Offer) {
    this.selectedOffer = offer;
    this.displayDialog = true;
    event.preventDefault();
  }

  onSortChange(event) {
    const value = event.value;

    if (value.indexOf('!') === 0) {
      this.sortOrder = -1;
      this.sortField = value.substring(1, value.length);
    } else {
      this.sortOrder = 1;
      this.sortField = value;
    }
  }

  onDialogHide() {
    this.selectedOffer = null;
  }

}
