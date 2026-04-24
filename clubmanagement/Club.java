package clubmanagement;

public class Club {
    private int clubID;
    private String name;
    private String description;
    private String presidentName;

    // Constructors
    public Club() {}

    public Club(int clubID, String name, String description, String presidentName) {
        this.clubID = clubID;
        this.name = name;
        this.description = description;
        this.presidentName = presidentName;
    }

    // Getters and Setters
    public int getClubID() { return clubID; }
    public void setClubID(int clubID) { this.clubID = clubID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getPresidentName() { return presidentName; }
    public void setPresidentName(String presidentName) { this.presidentName = presidentName; }
}

