
/**
 * Class declare object.
 * @author Admin
 */
public class Doctor {

    /**
     * Attribute Code.
     */
    private String Code;
    
    /**
     * Attribute Name.
     */
    private String Name;
    
    /**
     * Attribute Specialization.
     */
    private String Specialization;
    
    /**
     * Attribute Availability.
     */
    private int Availability;

   //Default contructor.
    public Doctor() {
    }

    /**
     * Contructor with all attribute.
     * @param Code
     * @param Name
     * @param Specialization
     * @param Availability 
     */
    public Doctor(String Code, String Name, String Specialization, int Availability) {
        this.Code = Code;
        this.Name = Name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }
            
            
            
}
