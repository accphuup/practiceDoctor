
public class Main {

    public static void main(String[] args) {
        DoctorManager manager = new DoctorManager();
        while (true) {
            displayMenu();
            int choice = Unitity.checkInputChoice("Your choice: ");
            switch (choice) {

                //add doctor.
                case 1:
                    System.out.println("--------Add doctor----------");
                    String code = Unitity.checkInputString("Enter Code: ");
                    boolean checkAdd = manager.checkCode(code);

                    if (!checkAdd) {
                        String name = Unitity.checkInputString("Enter Name: ");
                        String specialization = Unitity.checkInputString("Enter Specialization: ");
                        int availability = Unitity.checkInputInt("Enter Availability: ");

                        Doctor doctor = new Doctor();

                        doctor.setCode(code);
                        doctor.setName(name);
                        doctor.setSpecialization(specialization);
                        doctor.setAvailability(availability);

                        boolean add = manager.addDoctor(doctor);

                        if (add) {
                            System.out.println("Add doctor successful.");
                        } 
                    }else {
                            System.err.println("Doctor code " + code + "is exist.");
                        }
                    break;

                //Update Doctor.
                case 2:
                    System.out.println("--------Update doctor----------");
                    String updateCode = Unitity.checkInputString("Enter Code: ");
                    boolean checkUpdate = manager.checkCode(updateCode);

                    if (checkUpdate) {
                        String name = Unitity.checkInputUpdateString("Enter Name: ");
                        String specialization = Unitity.checkInputUpdateString("Enter Specialization: ");
                        int availability = Unitity.checkInputUpdateInt("Enter Availability: ");

                        Doctor doctor = new Doctor();

                        doctor.setCode(updateCode);
                        doctor.setName(name);
                        doctor.setSpecialization(specialization);
                        doctor.setAvailability(availability);

                        boolean update = manager.updateDoctor(doctor);

                        if (update) {
                            System.out.println("Update doctor successful.");
                        } else {
                            System.err.println("List empty!");
                        }
                    } else {
                        System.err.println("Not found code to update doctor!");
                    }
                    break;

                //Delete Doctor.
                case 3:
                    System.out.println("--------Delete doctor----------");
                    String deleteCode = Unitity.checkInputString("Enter Code: ");
                    boolean checkDelete = manager.checkCode(deleteCode);
                    if (checkDelete) {

                        boolean delete = manager.deleteDoctor(deleteCode);

                        if (delete) {
                            System.out.println("Delete doctor successful.");
                        }
                    } else {
                        System.err.println("Not found code to delete doctor!");
                    }
                    break;

                //Search doctor.
                case 4:
                    System.out.println("--------Search doctor----------");
                    String searchText = Unitity.checkInputUpdateString("Enter text: ");
                    boolean checkSearch = manager.checkSearch(searchText);

                    if (checkSearch) {

                        boolean search = manager.searchDoctor(searchText);

                        if (search) {
                            System.out.println("Doctor found.");
                        }else{
                            System.err.println("List empty!");
                        }
                    }else{
                        System.err.println("Not found Doctor!");
                    }

                    break;

                case 5:
                    System.out.println("Exit program...");
                    return;

            }
        }

    }

    public static void displayMenu() {
        System.out.println("======Doctor Management=========");
        System.out.println("1. Add doctor");
        System.out.println("2. Update doctor");
        System.out.println("3. Delete doctor");
        System.out.println("4. Search doctor");
        System.out.println("5.  Exit");
    }
}
