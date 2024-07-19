# Vaccination Management System

## Proxy Pattern Implementation

This project demonstrates the application of the Proxy Design Pattern in a Vaccination Management System. The Proxy Pattern is used to control access to an object and provide additional functionality, such as validation, before delegating the actual work to the real object.

### How the Proxy Pattern is Applied

In this system, the Proxy Pattern is implemented to manage access to the `Vaccination` class. Here's how it's used:

- **Proxy Class (`ProxyVaccination`)**: Acts as an intermediary between the client and the `Vaccination` class. It ensures that only valid requests (i.e., requests with dates that are equal to or after the assigned date) are forwarded to the `Vaccination` class.
  
- **Real Object (`Vaccination`)**: Contains the actual logic for performing the vaccination. The `Vaccination` class is only accessed through the `ProxyVaccination`, which handles the validation of the request.

The Proxy Pattern is particularly suited for this scenario because it allows for the implementation of additional validation (i.e., checking if the current date is valid for vaccination) without modifying the core functionality of the `Vaccination` class. This separation of concerns ensures that the validation logic is centralized and easily manageable.

### Classes Overview

1. **`Person`**:
   - Represents an individual who is to be vaccinated.
   - Contains attributes such as `name`, `lastname`, `identification`, `assignedDate`, and `vaccinationName`.

2. **`IVaccinationCenter`**:
   - An interface that defines the contract for the vaccination process.
   - Includes the method `vaccinate(Person person)` which is implemented by both `ProxyVaccination` and `Vaccination` classes.

3. **`ProxyVaccination`**:
   - Implements the `IVaccinationCenter` interface.
   - Contains a `Vaccination` instance to which it delegates the vaccination process.
   - Validates that the current date is on or after the assigned date before allowing the vaccination process to proceed.

4. **`Vaccination`**:
   - Implements the `IVaccinationCenter` interface.
   - Contains the actual logic for vaccinating a person and returning a confirmation message.

### Unit Testing with JUnit 5

Unit tests are used to verify the functionality and correctness of the `ProxyVaccination` class and its interaction with the `Vaccination` class. The tests are written using JUnit 5 and cover various scenarios:

1. **`testVaccinationValidDate`**:
   - Verifies that a person can be vaccinated on the assigned date.

2. **`testVaccinationValidDateAfterAssigned`**:
   - Verifies that a person can be vaccinated after the assigned date.

3. **`testVaccinationInvalidDateBeforeAssigned`**:
   - Ensures that a person cannot be vaccinated before the assigned date.

### How to Run Tests

1. **Clone the repository**:
    ```sh
    git https://github.com/vlambo3/Proxy---VaccinationManagementSystem
    cd Proxy-Vaccination-Management-System
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Run tests**:
    ```sh
    mvn test
    ```
### UML Diagram

![uml](https://raw.githubusercontent.com/vlambo3/Proxy---VaccinationManagementSystem/proxy/images/uml.png)

### Conclusion

The Proxy Pattern provides an elegant solution for managing access and adding validation logic to the `Vaccination` process. By using a proxy, we maintain separation of concerns and ensure that the real `Vaccination` class focuses solely on the vaccination logic. JUnit 5 tests are used to ensure the correctness of the implementation and validate that the system behaves as expected under various scenarios.


### Contact

If you have any questions or need assistance with the project, feel free to contact me:

- **LinkedIn:** [Vanina Godoy](https://www.linkedin.com/in/vanina-a-godoy/?locale=en_US)

