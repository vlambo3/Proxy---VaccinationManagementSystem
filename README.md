# Vaccination Management System

## Overview

This project implements a basic vaccination management system. It features a `Person` class representing individuals scheduled for vaccination and provides functionality to record and validate the vaccination process. The system ensures that individuals can only be vaccinated on or after their assigned vaccination date.

## Features

- **Person Class**: Represents a person with details such as name, last name, identification number, assigned vaccination date, and vaccination name.
- **Vaccination Process**: Validates that vaccination occurs only on or after the assigned date. It throws an exception if the vaccination date is invalid.
- **Output**: Confirms successful vaccination with a message that includes the identification number, vaccination date, and vaccination name.

## Proxy Pattern

In this repository, the Proxy pattern is used to control access to the vaccination process, ensuring that the date of vaccination is valid before proceeding. The implementation is located in the `proxy` branch. 

### Proxy Pattern Details

- **Proxy Class**: Acts as an intermediary between the client and the real object, adding additional checks or controls.
- **Real Object**: Handles the actual vaccination process.
- **Control Logic**: Ensures that vaccinations are only processed if the date is equal to or after the assigned date.

## How to Run

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/vlambo3/Proxy---VaccinationManagementSystem
   cd Proxy---VaccinationManagementSystem
   ```

2. **Checkout the Desired Branch**:
    - For the basic implementation without the Proxy pattern:
        ```sh
        git checkout main
        ```
    - For the implementation with the Proxy pattern:
        ```sh
        git checkout proxy
        ```

3. **Build and Run the Project**:
   Ensure you have Java and Maven installed. Navigate to the project directory and execute:
    ```sh
    mvn clean install
    ```

4. **Run Tests**:
   Execute the tests to ensure the correctness of the implementation.
    ```sh
    mvn test
    ```

## Tests

JUnit 5 tests are used to ensure the quality of the `Person` class and its `vaccinate()` method. These tests validate:

- Successful vaccination on or after the assigned date.
- Handling of invalid dates and correct exception throwing.
- Output verification (console printing).

## Conclusion

This project demonstrates both the basic vaccination management system and an enhanced version using the Proxy pattern. By comparing the two branches, developers can understand the application of the Proxy pattern and how it adds an additional layer of control to the system. The use of JUnit 5 tests ensures that the functionality is robust and reliable.

## Contact

If you have any questions or need assistance with the project, feel free to contact me:

- **LinkedIn:** [Vanina Godoy](https://www.linkedin.com/in/vanina-a-godoy/?locale=en_US)

