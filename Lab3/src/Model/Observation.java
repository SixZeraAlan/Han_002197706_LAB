/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alan
 */
public class Observation {
    int observationId;
    double bloodPressure;
    double temperature;
    Medicine medication;

    public Observation() {
        medication = new Medicine();
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Medicine getMedication() {
        return medication;
    }

    public void setMedication(Medicine medication) {
        this.medication = medication;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.observationId);
    }
}
