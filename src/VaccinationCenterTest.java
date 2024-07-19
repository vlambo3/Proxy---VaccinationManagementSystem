import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class VaccinationCenterTest {
    private Person person;

    @BeforeEach
    void setUp() {
        // Initialize a Person object with a specific assigned date using LocalDate
        LocalDate assignedDate = LocalDate.of(2024, 1, 1); // January 1, 2024
        person = new Person("Nico", "Perez", "123", assignedDate, "AstraZeneca", false);
    }

    @Test
    @DisplayName("Should not throw exception and should vaccinate when date is equal to assigned date")
    void testVaccinationValidDate() {
        LocalDate validDate = LocalDate.of(2024, 1, 1); // January 1, 2024
        assertDoesNotThrow(() -> person.vaccinate(validDate));
        assertTrue(person.isVaccinated(), "Person should be vaccinated");
    }

    @Test
    @DisplayName("Should not throw exception and should vaccinate when date is after the assigned date")
    void testVaccinationValidDateAfterAssigned() {
        LocalDate validDate = LocalDate.of(2024, 1, 2); // January 2, 2024
        assertDoesNotThrow(() -> person.vaccinate(validDate));
        assertTrue(person.isVaccinated(), "Person should be vaccinated");
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when date is before the assigned date")
    void testVaccinationInvalidDateBeforeAssigned() {
        LocalDate invalidDate = LocalDate.of(2023, 12, 31); // December 31, 2023
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> person.vaccinate(invalidDate));
        assertEquals("The vaccination date must be equal to or after the assigned date.", thrown.getMessage());
        assertFalse(person.isVaccinated(), "Person should not be vaccinated");
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when date is exactly one day before the assigned date")
    void testVaccinationDateEdgeCase() {
        LocalDate edgeCaseDate = LocalDate.of(2023, 12, 31); // December 31, 2023
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> person.vaccinate(edgeCaseDate));
        assertEquals("The vaccination date must be equal to or after the assigned date.", thrown.getMessage());
        assertFalse(person.isVaccinated(), "Person should not be vaccinated");
    }

    @Test
    @DisplayName("Should not throw exception for console output and complete vaccination process")
    void testVaccinationOutput() {
        LocalDate validDate = LocalDate.of(2024, 1, 1); // January 1, 2024
        assertDoesNotThrow(() -> {
            person.vaccinate(validDate);
            // The test will pass if no exception is thrown
        });
    }
}
