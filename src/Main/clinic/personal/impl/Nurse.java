package Main.clinic.personal.impl;

import Main.clinic.personal.Personal;

public class Nurse extends Personal {

    public Nurse(String firstName, String lastName){
        super(firstName, lastName);
    }
    public Nurse(){
        super("ИмяМедсестры", "ФамилияМедсестры");
    }
}
