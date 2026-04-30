# JavaFX Bookstore Application

A Java-based desktop application featuring a **JavaFX GUI** and an **object-oriented** user management system. The project is designed to handle different user roles and book inventory management.

---

## **Key Features**

*   **Role-Based User System**: Utilizes an abstract `User` class to manage credentials and points, with specialized implementations for `Owner` and `Customer` roles.
*   **Inventory Tracking**: A dedicated `Book` class to manage titles and pricing.
*   **GUI Interface**: Built with **JavaFX** to provide a graphical stage for user interaction.

---

## **Project Structure**

### **Core Logic**
*   **`User.java`**: An abstract base class containing common fields for `username`, `password`, and `points`, along with credential verification methods.
*   **`Owner.java`**: Inherits from `User` to represent administrative or store-owner accounts.
*   **`Customer.java`**: Inherits from `User` to represent shopper accounts with point-tracking capabilities.
*   **`Book.java`**: A standard entity class representing a book with attributes for `name` and `price`, including full getter and setter support.

### **Application Entry Point**
*   **`BookStore.java`**: The main class that extends the JavaFX `Application`. It handles the primary stage setup and launches the U.

---

## **Technical Details**

*   **Language**: Java.
*   **GUI Framework**: JavaFX.
*   **Project Structure**: Designed within a package named `bookstore`.

---

## **Getting Started**

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/your-username/bookstore.git](https://github.com/your-username/bookstore.git)
    ```
2.  **JavaFX Setup**: Ensure your development environment has the JavaFX SDK configured, as the project relies on the `javafx.application` and `javafx.scene` libraries[cite: 5].
3.  **Launch**: Run the `main` method in `BookStore.java` to open the graphical window.
