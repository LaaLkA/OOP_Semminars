package Main.clinic.personal.impl;

import Main.clinic.patients.Animal;
import Main.clinic.personal.Personal;

import java.util.HashMap;
import java.util.Map;

public class Doctor extends Personal {
    private final Map<Integer, String> diagnoses = Map.of(0, "перелом", 1, "лишай", 2, "чумка", 3, "бешенство");
    public String firstName;
    public Nurse nurse;

    public Doctor(String firstName) {
        this.firstName = firstName;
    }
    public Doctor(String firstName, Nurse nurse) {
        this.firstName = firstName;
        this.nurse = nurse;
    }

    public void fireNurse(){
        this.nurse = null;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String doDiagnose(Animal patient) {
        int key = (int)(1 + Math.random() * 3);
        return patient.name + "подхватил болезнь " + diagnoses.get(key);
    }
}
