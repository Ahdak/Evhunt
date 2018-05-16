import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Offer} from './offer';

@Injectable()
export class OfferService {

  constructor(private http: Http) {}

  getOfferList() {
    return this.http.get('/showcase/resources/data/cars-large.json')
      .toPromise()
      .then(res => <Offer[]> res.json().data)
      .then(data => { return data; });
  }
}
