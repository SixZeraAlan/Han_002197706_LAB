/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author alan
 */
public class MedicineCatalog {
    ArrayList<Medicine> medicineList;

    public MedicineCatalog() {
        this.medicineList = new ArrayList<Medicine>();
    }

    

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine(String name, double dosage) {
        Medicine medicine = new Medicine(name, dosage);
        medicineList.add(medicine);
        return medicine;
    }
    
    public Boolean checIfMedicineUnique(String name) {
        for (Medicine med : medicineList) {
            if (med.getMedicineName().equals(name)) {
                return false;
            }
        }
        return true;
    }
    
    // delete a medicine from the catalog
    public Medicine findMedicine(String name){
        for(Medicine med : medicineList){
            if(med.getMedicineName().equals(name)){
                return med;
            }
        }
        return null;
    }
    
    
}
