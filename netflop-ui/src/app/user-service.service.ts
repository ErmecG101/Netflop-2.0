import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


const httpOptions = {
  headers: ({
    'Content-Type': 'application/xml',
    'Access-Control-Allow-Origin': 'http://localhost:8787'
  })
};

@Injectable({
  providedIn: 'root'
})

export class UserServiceService {

  apiUrl = 'http://localhost:8787/netflop/api/usuarios/';

  constructor(private httpClient: HttpClient) { }

  cadastrar(user:any){
    return this.httpClient.post(this.apiUrl,user, httpOptions)
  }

  logar(email, senha){
    return this.httpClient.get(this.apiUrl+'login/'+email+'/'+senha, httpOptions);
  }
}
