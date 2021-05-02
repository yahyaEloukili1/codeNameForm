/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.gui;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.Layout;
/**
 *
 * @author T440
 */
public class Form2 extends Form {
     private Label lbNom;
          private     Label lbPrenom = new Label() ;
                private Label lbPassword ;
                 private Label lbDate ;
               private Label lGender ;
                private Label lDate ;
                
     public Form2(String string, Layout layout){
            super(string, layout);
        
    }

    public Label getLbNom() {
        return lbNom;
    }

    public void setLbNom(Label lbNom) {
        this.lbNom = lbNom;
    }

    public Label getlDate() {
        return lDate;
    }

    public void setlDate(Label lDate) {
        this.lDate = lDate;
    }

    public Label getLbPrenom() {
        return lbPrenom;
    }

    public void setLbPrenom(Label lbPrenom) {
        this.lbPrenom = lbPrenom;
    }

    public Label getLbPassword() {
        return lbPassword;
    }

    public void setLbPassword(Label lbPassword) {
        this.lbPassword = lbPassword;
    }

    public Label getLbDate() {
        return lbDate;
    }

    public void setLbDate(Label lbDate) {
        this.lbDate = lbDate;
    }

    public Label getlGender() {
        return lGender;
    }

    public void setlGender(Label lGender) {
        this.lGender = lGender;
    }
    
}
