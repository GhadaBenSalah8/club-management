package clubmanagement;

public class Student {
    private int studentID;
    private String fullName;
    private String email;
    private String major;

    // Constructors
    public Student() {}

    public Student(int studentID, String fullName, String email, String major) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.email = email;
        this.major = major;
    }

    // Getters and Setters
    public int getStudentID() { return studentID; }
    public void setStudentID(int studentID) { this.studentID = studentID; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
}
