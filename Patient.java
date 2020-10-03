
import java.util.ArrayList;

// Stores the information for a given patient in the system:
public class Patient {

    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<String> allergies;

    public Patient(int id, String firstName, String lastName) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        allergies = new ArrayList<>();
    }

    // Adds an allergy to the ArrayList of allergies
    public void addAllergy(String allergy) {
        allergies.add(allergy);
    }

    // returns the String representation of the patient
    @Override
    public String toString() {
        String s = "";
        s += String.format("Patient %d: %s %s\n", id + 1, firstName, lastName);

        if (allergies.size() > 0) {
            s += "  Allergies: ";
            for (int i = 0; i < allergies.size(); i++) {
                s += allergies.get(i);
                if (i < allergies.size() - 1) {
                    s += ", ";
                }
            }
        }
        s += "\n";
        return s;
    }
}
