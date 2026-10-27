
public class Main {

    public static void main(String[] args) {
        DoctorManager manager = new DoctorManager();
        while (true) {            
            displayMenu();
            int choice = Unitity.checkInputChoice("Your choice: ");
            switch (choice) {
                case 1:
                    System.out.println("------Add Doctor--------");
                    String code = Unitity.checkInputString("Enter Code: ");
                    boolean checkAdd = manager.checkCode(code);
                    
                    if (!checkAdd) {
                        String name =  Unitity.checkInputString("Enter Name: ");
                         String specialization =  Unitity.checkInputString("Enter Specialization: ");
                         int availability = Unitity.checkInputInt("Enter Availability: ");
                         
                         Doctor doctor = new Doctor();
                         
                         doctor.setCode(code);
                         doctor.setName(name);
                         doctor.setSpecialization(specialization);
                         doctor.setAvailability(availability);
                         
                         boolean add = manager.addDoctor(doctor);
                         
                         if (add) {
                             System.out.println("Add successful.");
                        }
                    }
                    else{
                             System.err.println("Doctor code "+ code +" is duplicate");
                         }
                    break;
                    
                    
                     case 2:
                     System.out.println("------Update Doctor--------");
                      String updateCode = Unitity.checkInputString("Enter Code: ");
                    boolean checkUpdateCode = manager.checkCode(updateCode);
                    
                    if (checkUpdateCode) {
                        String updateName =  Unitity.checkInputUpdateString("Enter Name: ");
                         String specialization =  Unitity.checkInputUpdateString("Enter Specialization: ");
                         int availability = Unitity.checkInputUpdateInt("Enter Availability: ");
                         
                         Doctor updateDoctor = new Doctor();
                         
                         updateDoctor.setCode(updateCode);
                         updateDoctor.setName(updateName);
                         updateDoctor.setSpecialization(specialization);
                         updateDoctor.setAvailability(availability);
                         
                         boolean update = manager.updateDoctor(updateDoctor);
                         
                         if (update) {
                             System.out.println("Update successful.");
                        }
                    }
                    else{
                             System.err.println("Not found code to update doctor");
                         }
                    break;
             
                     case 3:
                     System.out.println("------Delete Doctor--------");
                     String deleteCode = Unitity.checkInputString("Enter code: ");
                     boolean checkDeleteCode = manager.checkCode(deleteCode);
                     
                         if (checkDeleteCode) {
                         boolean delete =  manager.deleteDoctor(deleteCode);
                         
                             if (delete) {
                                 System.out.println("Delete successful.");
                             }else{
                                 System.err.println("List empty!");
                             }
                         }else{
                             System.err.println("Not found code to delete doctor");
                         }
                    break;
             
                     case 4:
                     System.out.println("------Search Doctor--------");
                      String searchCode = Unitity.checkInputUpdateString("Enter text: ");
                     boolean checkSearchCode = manager.checkSearchCode(searchCode);
                     
                         if (checkSearchCode) {
                         boolean search =  manager.searchDoctor(searchCode);
                             if (search) {
                                 System.out.println("Found the list above.");
                             }else{
                                 System.err.println("List empty!");
                             }
                         }else{
                             System.err.println("Not found code to search doctor");
                         }
                    break;
             
                     case 5:
                         System.out.println("Exit program...");
                         return;
                 
             
                    
             
             
            }
        }
    }

    public static void displayMenu() {
        System.out.println("========Doctor Management========");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
    }
}
