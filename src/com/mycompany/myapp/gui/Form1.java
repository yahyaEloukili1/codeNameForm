/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.gui;

import com.codename1.components.OnOffSwitch;
import com.codename1.ui.Button;
import com.codename1.ui.CheckBox;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.Layout;
import com.codename1.ui.spinner.Picker;

/**
 *
 * @author T440
 */
public class Form1 extends Form {
      private   TextField tfNom = new TextField("","Nom");
      private   TextField tfPrenom = new TextField("","Prenom");
         private TextField tfPassword = new TextField("","Password");
        private  Picker date = new Picker();
          
          
       private  Container container = new Container(BoxLayout.x());
        private  Label label = new Label("Gender :");
        private  OnOffSwitch onOff = new OnOffSwitch();
         
         private CheckBox chFoot = new CheckBox("Foot");
         private CheckBox chTennis = new CheckBox("Tennis");
         private CheckBox chLecture = new CheckBox("Lecture");
         private CheckBox chNatation= new CheckBox("Natation");
         private Button btnValider = new Button("Valider");
   public Form1(String string, Layout layout){
            super(string, layout);
        this.tfPassword.setConstraint(TextField.PASSWORD);
         container.add(label);
          container.add(onOff);
           this.add(tfNom);
          this.add(tfPrenom);
          this.add(tfPassword);
          this.add(date);
          this.add(container);
          this.add(chFoot);
          this.add(chTennis);
          this.add(chLecture);
          this.add(chNatation);
          this.add(btnValider);
          this.show();
    }

   
    public TextField getTfNom() {
        return tfNom;
    }

    public void setTfNom(TextField tfNom) {
        this.tfNom = tfNom;
    }

    public TextField getTfPrenom() {
        return tfPrenom;
    }

    public void setTfPrenom(TextField tfPrenom) {
        this.tfPrenom = tfPrenom;
    }

    public TextField getTfPassword() {
        return tfPassword;
    }

    public void setTfPassword(TextField tfPassword) {
        this.tfPassword = tfPassword;
    }

    public Picker getDate() {
        return date;
    }

    public void setDate(Picker date) {
        this.date = date;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public OnOffSwitch getOnOff() {
        return onOff;
    }

    public void setOnOff(OnOffSwitch onOff) {
        this.onOff = onOff;
    }

    public CheckBox getChFoot() {
        return chFoot;
    }

    public void setChFoot(CheckBox chFoot) {
        this.chFoot = chFoot;
    }

    public CheckBox getChTennis() {
        return chTennis;
    }

    public void setChTennis(CheckBox chTennis) {
        this.chTennis = chTennis;
    }

    public CheckBox getChLecture() {
        return chLecture;
    }

    public void setChLecture(CheckBox chLecture) {
        this.chLecture = chLecture;
    }

    public CheckBox getChNatation() {
        return chNatation;
    }

    public void setChNatation(CheckBox chNatation) {
        this.chNatation = chNatation;
    }

    public Button getBtnValider() {
        return btnValider;
    }

    public void setBtnValider(Button btnValider) {
        this.btnValider = btnValider;
    }
   
}
