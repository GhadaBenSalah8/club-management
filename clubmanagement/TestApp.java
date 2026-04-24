package clubmanagement;

import java.time.LocalDate;
import java.util.*;

public class TestApp {
    static Scanner scanner = new Scanner(System.in);
    static List<Club> clubs = new ArrayList<>();
    static List<Student> students = new ArrayList<>();
    static List<Event> events = new ArrayList<>();
    static List<EventRegistration> registrations = new ArrayList<>();
    static int clubId = 1, studentId = 1, eventId = 1, registrationId = 1;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- UniClub Management ---");
            System.out.println("1. Add clubmanagement.Club");
            System.out.println("2. Add clubmanagement.Student");
            System.out.println("3. Add clubmanagement.Event");
            System.out.println("4. Register clubmanagement.Student to clubmanagement.Event");
            System.out.println("5. Show All Data");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addClub();
                case 2 -> addStudent();
                case 3 -> addEvent();
                case 4 -> registerStudent();
                case 5 -> showData();
                case 6 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 6);
    }

    private static void addClub() {
        scanner.nextLine();
        System.out.print("clubmanagement.Club Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();
        System.out.print("President Name: ");
        String president = scanner.nextLine();

        Club club = new Club(clubId++, name, desc, president);
        clubs.add(club);
        System.out.println(" clubmanagement.Club added!");
    }

    private static void addStudent() {
        scanner.nextLine();
        System.out.print("clubmanagement.Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Major: ");
        String major = scanner.nextLine();

        Student student = new Student(studentId++, name, email, major);
        students.add(student);
        System.out.println(" clubmanagement.Student added!");
    }

    private static void addEvent() {
        if (clubs.isEmpty()) {
            System.out.println("Please add at least one club first.");
            return;
        }

        System.out.println("Available Clubs:");
        clubs.forEach(c -> System.out.println(c.getClubID() + ": " + c.getName()));

        System.out.print("Enter clubmanagement.Club ID: ");
        int clubId = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("clubmanagement.Event Title: ");
        String title = scanner.nextLine();
        System.out.print("Location: ");
        String location = scanner.nextLine();

        Event event = new Event(eventId++, clubId, title, LocalDate.now(), location);
        events.add(event);
        System.out.println(" clubmanagement.Event added!");
    }

    private static void registerStudent() {
        if (students.isEmpty() || events.isEmpty()) {
            System.out.println("Add students and events first.");
            return;
        }

        System.out.println("Students:");
        students.forEach(s -> System.out.println(s.getStudentID() + ": " + s.getFullName()));
        System.out.print("Enter clubmanagement.Student ID: ");
        int sId = scanner.nextInt();

        System.out.println("Events:");
        events.forEach(e -> System.out.println(e.getEventID() + ": " + e.getTitle()));
        System.out.print("Enter clubmanagement.Event ID: ");
        int eId = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Enter Status (Registered/Attended): ");
        String status = scanner.nextLine();

        EventRegistration reg = new EventRegistration(registrationId++, sId, eId, status);
        registrations.add(reg);
        System.out.println(" Registration recorded.");
    }

    private static void showData() {
        System.out.println("\n--- Clubs ---");
        clubs.forEach(c -> System.out.println(c.getClubID() + ": " + c.getName() + " | President: " + c.getPresidentName()));

        System.out.println("\n--- Students ---");
        students.forEach(s -> System.out.println(s.getStudentID() + ": " + s.getFullName() + " | " + s.getEmail()));

        System.out.println("\n--- Events ---");
        events.forEach(e -> System.out.println(e.getEventID() + ": " + e.getTitle() + " | clubmanagement.Club ID: " + e.getClubID()));

        System.out.println("\n--- Registrations ---");
        registrations.forEach(r -> System.out.println("clubmanagement.Student " + r.getStudentID() + " → clubmanagement.Event " + r.getEventID() + " | Status: " + r.getStatus()));
    }
}
