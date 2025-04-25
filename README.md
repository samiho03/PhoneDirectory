# 📞 PhoneDirectory – Java Application

**PhoneDirectory** is a user-friendly Java-based desktop application developed with Maven and NetBeans. It allows users to manage contact details efficiently using a clean graphical user interface.

---

## Features

### Add, Update, Delete Contacts
- Add new contacts with **Name**, **Phone Number**, **Address**, **Email**, and **Company**.
- Edit and update contact information with ease.
- Delete existing records with confirmation prompts.

###  View All Contacts
- Displays contact list in a **sortable table**.
- Supports **alphabetical sorting by name** and other fields.

###  Search Functionality
- Filter contacts based on **name, phone number, or company**.
- Real-time search updates the results dynamically.

###  Sorting Capabilities
- Contacts can be **sorted by Name or Company** using dropdown menus or table headers.
- Sorting is implemented using Java’s `Collections.sort()` with custom `Comparator`.

###  User Interface
- Designed with **Java Swing** components and **AbsoluteLayout**.
- Clean, intuitive interface with labeled fields and buttons.
- Responsive to user actions with appropriate error and success dialogs.

---

##  Data Structures Used

- **ArrayList<Contact>**:
  - All contact records are stored in an `ArrayList` called `contactList`.
  - Enables efficient insertion, deletion, and retrieval of records.

- **HashMap for temporary mappings** *(optional in some functions)*:
  - Used internally to handle key-value data temporarily during sorting or searching.

---

##  Logic Highlights

- **Model Class (`Contact.java`)**:
  - Stores contact attributes.
  - Getters and setters manage data encapsulation.

- **Sorting Logic**:
  - `Collections.sort(contactList, Comparator)` sorts by name or company.
  - Sorting triggered through dropdown or UI buttons.

- **Search Logic**:
  - Implements keyword-based search by iterating through the `ArrayList`.

---

##  Tech Stack

- **Language**: Java
- **IDE**: NetBeans
- **Build Tool**: Maven
- **UI Framework**: Swing (with AbsoluteLayout)

---

## 📸 UI Preview

> Beautiful, interactive UI with neatly organized fields and action buttons.

