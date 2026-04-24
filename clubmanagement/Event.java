package clubmanagement;

import java.time.LocalDate;

public class Event {
    private int eventID;
    private int clubID;
    private String title;
    private LocalDate date;
    private String location;

    // Constructors
    public Event() {}

    public Event(int eventID, int clubID, String title, LocalDate date, String location) {
        this.eventID = eventID;
        this.clubID = clubID;
        this.title = title;
        this.date = date;
        this.location = location;
    }

    // Getters and Setters
    public int getEventID() { return eventID; }
    public void setEventID(int eventID) { this.eventID = eventID; }

    public int getClubID() { return clubID; }
    public void setClubID(int clubID) { this.clubID = clubID; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
