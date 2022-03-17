import { Component, NgZone, OnInit } from '@angular/core';
import { MatDialog, MatDialogRef } from '@angular/material/dialog';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-toolbar',
  templateUrl: './toolbar.component.html',
  styleUrls: ['./toolbar.component.css']
})
export class ToolbarComponent {

  constructor(public dialog: MatDialog) { }

  openDialog(): void {
    const dialogRef = this.dialog.open(DialogOverviewExampleDialog, {
      width: '400px',
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    });
  }
}

@Component({
  selector: 'app-toolbar-dialog',
  templateUrl: 'toolbar-dialog.html',
})
export class DialogOverviewExampleDialog implements OnInit {

  user = { "nome":"","email":"","senha":"","celular":"", "adm": false};
  users = [];


  constructor(
    public dialogRef: MatDialogRef<DialogOverviewExampleDialog> , private ngZone : NgZone,
    private userservice : UserServiceService
  ) {}

  ngOnInit(): void {
    
  }

  

  cadastrarConta() {
    this.userservice.cadastrar(this.user)
    .subscribe(() => {
      this.user = {"nome":"","email":"","senha":"","celular":"", "adm": false};
    })
  }

  logarConta(){
    this.userservice.logar(this.user.email, this.user.senha).subscribe(()=>{
      this.user = {"nome":"","email":"","senha":"","celular":"", "adm": false}
    })
  }

  onNoClick(): void {
      this.dialogRef.close(); 
  }
}
