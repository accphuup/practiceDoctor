
import java.util.ArrayList;

/**
 * Class to add, update, search, delete doctor.
 *
 * @author Admin
 */
public class DoctorManager {

    private ArrayList<Doctor> doctors = new ArrayList<>();

    public boolean checkCode(String code) {
        if (code.isEmpty()) {
            return false;
        }

        for (Doctor doctor : doctors) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSearchCode(String searchCode) {
        if (searchCode.isEmpty()) {
            return true;
        }

        for (Doctor doctor : doctors) {
            if (doctor.getCode().equalsIgnoreCase(searchCode) || doctor.getName().contains(searchCode)) {
                return true;
            }
        }
        return false;
    }

    public boolean addDoctor(Doctor doctor) {
        doctors.add(doctor);
        return true;
    }

    public boolean updateDoctor(Doctor updateDoctor) {
        if (doctors.isEmpty()) {
            return false;
        }
        for (Doctor doctor : doctors) {
            if (doctor.getCode().equalsIgnoreCase(updateDoctor.getCode())) {

                if (!updateDoctor.getName().isEmpty()) {
                    doctor.setName(updateDoctor.getName());

                }

                if (!updateDoctor.getSpecialization().isEmpty()) {
                    doctor.setSpecialization(updateDoctor.getSpecialization());

                }

                if (updateDoctor.getAvailability() != -1) {
                    doctor.setAvailability(updateDoctor.getAvailability());

                }
            }
            return true;
        }

        return false;
    }

    public boolean deleteDoctor(String deleteCode) {
        if (doctors.isEmpty()) {
            return false;
        }

        for (Doctor doctor : doctors) {
            if (doctor.getCode().equalsIgnoreCase(deleteCode)) {
                doctors.remove(doctor);
                return true;
            }
        }
        return false;
    }

    public boolean searchDoctor(String searchCode) {

        if (doctors.isEmpty()) {
            return false;
        }

        ArrayList<Doctor> results = new ArrayList<>();

        if (searchCode.equals("")) {
            results.addAll(doctors);

        } else {
            for (Doctor doctor : doctors) {
                if (doctor.getCode().equalsIgnoreCase(searchCode) || doctor.getName().contains(searchCode)) {
                    results.add(doctor);
                }
            }
        }
        displayResult(results);
        return true;

    }

    public void displayResult(ArrayList<Doctor> results) {
        System.out.printf("%-10s%-25s%-25s%-15s\n", "Code", "Name", "Specialization", "Availability");
        for (Doctor doctor : results) {
            System.out.printf("%-10s%-25s%-25s%-15s\n", doctor.getCode(), doctor.getName(), doctor.getSpecialization(), doctor.getAvailability());
        }

    }

}
