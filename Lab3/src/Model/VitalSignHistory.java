/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import Model.*;

/**
 *
 * @author alan
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHistory;

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public Observation findObservation(int id) {
        for(Observation o: this.vitalSignHistory) {
            if(o.getObservationId() == id) {
                return o;
            }
        }
        
        return null;
    }
    
    public Observation createObservation(int observationId, double bloodPressure, double temperature) {
        Observation observation = new Observation();
        observation.setObservationId(observationId);
        observation.setTemperature(temperature);
        observation.setBloodPressure(bloodPressure);
        
        this.vitalSignHistory.add(observation);
        
        return observation;
    }
    
    public Boolean checkObservationIDUnique(int id) {
        for (Observation o : this.vitalSignHistory) {
            if (o.getObservationId() == id) {
                return false;
            }
        }
        return true;
    }
}
