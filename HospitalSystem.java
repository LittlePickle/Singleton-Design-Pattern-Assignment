
import java.util.ArrayList;

/**
 * This is a singleton,make one HospitalSystem
 */
public class HospitalSystem {

    private ArrayList<Patient> patients;
    private static HospitalSystem hospitalSystem = null;

    // a private constructor
    private HospitalSystem() {
        patients = new ArrayList<>();
    }

    // returns an instance of the class
    public static HospitalSystem getInstance() {
        if (hospitalSystem == null) {
            hospitalSystem = new HospitalSystem();
        }
        return hospitalSystem;
    }

    // create a new patient with the given first and last name
    // returns the id of the patient, which is it's numerical place in the ArrayList
    public int addPatient(String firstName, String LastName) {
        int id = patients.size();
        Patient patient = new Patient(id, firstName, LastName);
        patients.add(patient);
        return id;
    }

    // Will return the patient which corresponds with the given id
    public Patient getRecord(int id) {

        return this.patients.get(id);
    }

    // Will add the allergy to the patient specified by the id
    public void addAllergy(int id, String allergy) {
        getRecord(id).addAllergy(allergy);
    }

    // Returns a string representation of all the patients data
    public String getAllPatientsData() {
        String s = "";
        for (Patient patient : patients) {
            s += patient.toString() + "\n";
        }
        return s;
    }

}
