# 🎓 University Club Management System

A Java console application for managing university club activities, built with **Object-Oriented Programming** principles. The system handles clubs, students, events, and event registrations through an interactive menu-driven interface.

> 👩‍💻 Developed by **Ghada Ben Salah**  
> 🏫 ESB School of Business — Business Computing, May 2025

---

## 📋 About the Project

Managing university clubs manually can be disorganized and time-consuming. This application provides a simple and efficient way to handle all club-related data in one place — from creating clubs and registering students, to organizing events and tracking attendance.

The project was built as part of the **Advanced Object-Oriented Programming (AOOP)** course and demonstrates core OOP concepts including encapsulation, modular class design, and clean separation of responsibilities.

---

## ✨ Features

- 🏛️ **Club Management** — Create clubs with a name, description, and president
- 👤 **Student Management** — Add students with their name, email, and major
- 📅 **Event Management** — Create events linked to specific clubs, with title, date, and location
- 📝 **Event Registration** — Register students to events and track their status (`Registered` / `Attended`)
- 📊 **View All Data** — Display a full summary of clubs, students, events, and registrations
- 🔁 **Interactive Menu** — Loop-based console menu for smooth navigation

---

## 🗂️ Project Structure

```
clubmanagement/
│
├── Club.java               # Club data model (ID, name, description, president)
├── Student.java            # Student data model (ID, name, email, major)
├── Event.java              # Event data model (ID, club, title, date, location)
├── EventRegistration.java  # Registration model linking students to events
└── TestApp.java            # Main application entry point with menu logic
```

---

## 🧱 Class Overview

### `Club.java`
Represents a university club with:
- `clubID` — unique identifier
- `name` — club name
- `description` — what the club is about
- `presidentName` — name of the club president

### `Student.java`
Represents a student with:
- `studentID` — unique identifier
- `fullName` — student's full name
- `email` — contact email
- `major` — field of study

### `Event.java`
Represents a club event with:
- `eventID` — unique identifier
- `clubID` — the club organizing the event
- `title` — event name
- `date` — automatically set to today's date (`LocalDate.now()`)
- `location` — where the event takes place

### `EventRegistration.java`
Links a student to an event:
- `registrationID` — unique identifier
- `studentID` — the registered student
- `eventID` — the target event
- `status` — either `"Registered"` or `"Attended"`

### `TestApp.java`
The main entry point. Runs a loop-based console menu with 6 options and manages all in-memory data using `ArrayList` collections.

---

## 🛠️ Tech Stack

| Component | Technology |
|---|---|
| Language | Java |
| Paradigm | Object-Oriented Programming (OOP) |
| Data Storage | In-memory (`ArrayList`) |
| Date Handling | `java.time.LocalDate` |
| Input | `java.util.Scanner` |
| IDE | IntelliJ IDEA |

---

## 🚀 How to Run

### Prerequisites
- Java JDK **8 or higher** installed
- Any Java IDE (IntelliJ IDEA, Eclipse) or a terminal

### Option 1 — Using an IDE
1. Clone the repository:
   ```bash
   git clone https://github.com/GhadaBenSalah8/club-management.git
   ```
2. Open the project in **IntelliJ IDEA** (or any Java IDE)
3. Navigate to `TestApp.java`
4. Click **Run** ▶️

### Option 2 — Using the Terminal
```bash
# Navigate to the project folder
cd club-management

# Compile all Java files
javac clubmanagement/*.java

# Run the application
java clubmanagement.TestApp
```

---

## 🖥️ App Menu

Once running, you'll see this menu:

```
--- UniClub Management ---
1. Add Club
2. Add Student
3. Add Event
4. Register Student to Event
5. Show All Data
6. Exit
Choice:
```

### Example Usage

```
Choice: 1
Club Name: Tech Club
Description: A club for tech enthusiasts
President Name: Ghada Ben Salah
✅ Club added!

Choice: 2
Student Name: Ines Jemour
Email: ines@esb.tn
Major: Business Computing
✅ Student added!

Choice: 3
Available Clubs:
1: Tech Club
Enter Club ID: 1
Event Title: Hackathon 2025
Location: Room B12
✅ Event added!

Choice: 4
Students:
1: Ines Jemour
Enter Student ID: 1
Events:
1: Hackathon 2025
Enter Event ID: 1
Enter Status (Registered/Attended): Registered
✅ Registration recorded.

---

## 👩‍💻 Author

| Name | GitHub |
|---|---|
| Ghada Ben Salah | [@GhadaBenSalah8](https://github.com/GhadaBenSalah8) |
