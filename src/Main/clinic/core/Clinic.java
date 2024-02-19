package Main.clinic.core;

import Main.clinic.patients.*;
import Main.clinic.personal.Personal;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    protected List<Personal> personal = new ArrayList<>();
    protected List<Animal> patients = new ArrayList<>();
    public Clinic(){
        this.personal = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addEmployee(Personal employee) {
        personal.add(employee);
    }
    public void addPatient(Animal patient) {
        patients.add(patient);
    }

    public List<Personal> getPatients() {
        return this.personal;
    }

    public List<Animal> getPersonal() {
        return this.patients;
    }

    public List<Animal> getGoables() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : this.patients) {
            if (animal instanceof Goable) result.add(animal);
            }
        return result;
        }

    public List<Animal> getFlyables() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : this.patients) {
            if (animal instanceof Flyable) result.add(animal);
        }
        return result;
    }

    public List<Animal> getSwimables() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : this.patients) {
            if (animal instanceof Swimable) result.add(animal);
        }
        return result;
    }
    public List<Animal> getHuntables() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : this.patients) {
            if (animal instanceof Huntable) result.add(animal);
        }
        return result;
    }
    }

