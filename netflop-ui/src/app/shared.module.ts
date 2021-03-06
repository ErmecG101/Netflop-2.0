import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import {BrowserModule} from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatMenuModule } from '@angular/material/menu';
import { MatDialogModule } from '@angular/material/dialog';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatInputModule } from '@angular/material/input';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { ToolbarComponent } from './toolbar/toolbar.component';
import { DialogOverviewExampleDialog } from './toolbar/toolbar.component';

import {MatTabsModule} from '@angular/material/tabs';

import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    ToolbarComponent,
    DialogOverviewExampleDialog,
  ],
  exports:[ToolbarComponent],
  imports: [
    CommonModule,
    BrowserModule,
    BrowserAnimationsModule,
    MatIconModule,
    ReactiveFormsModule,
    MatGridListModule,
    MatToolbarModule,
    MatButtonModule,
    HttpClientModule,
    MatTabsModule,
    MatInputModule,
    MatMenuModule,
    MatDialogModule,
    
    FormsModule,
    
  ],
})
export class SharedModule { AppModule }
