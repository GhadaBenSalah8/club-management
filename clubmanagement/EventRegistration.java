package clubmanagement;

public class EventRegistration {
    private int registrationID;
    private int studentID;
    private int eventID;
    private String status; // e.g., "Registered", "Attended"

    // Constructors
    public EventRegistration() {}

    public EventRegistration(int registrationID, int studentID, int eventID, String status) {
        this.registrationID = registrationID;
        this.studentID = studentID;
        this.eventID = eventID;
        this.status = status;
    }

    // Getters and Setters
    public int getRegistrationID() { return registrationID; }
    public void setRegistrationID(int registrationID) { this.registrationID = registrationID; }

    public int getStudentID() { return studentID; }
    public void setStudentID(int studentID) { this.studentID = studentID; }

    public int getEventID() { return eventID; }
    public void setEventID(int eventID) { this.eventID = eventID; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
