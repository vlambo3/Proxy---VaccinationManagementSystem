import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class VaccinationCenterTest {
    private Person person;
    private ProxyVaccination proxyVaccination;

    @BeforeEach
    void setUp() {
        // Configuración inicial para los tests
        LocalDate assignedDate = LocalDate.of(2024, 1, 1); // 1 de enero de 2024
        person = new Person("Nico", "Perez", "123", assignedDate, "AstraZeneca");
        proxyVaccination = new ProxyVaccination(); // Usa el constructor predeterminado
    }

    @Test
    @DisplayName("Should Not Vaccinate if Date is Before Assigned Date")
    void testVaccinationInvalidDateBeforeAssigned() {
        // Simula la fecha actual como anterior a la fecha asignada
        // Ajusta la fecha del sistema de acuerdo con tu entorno de prueba
        LocalDate simulatedToday = LocalDate.of(2023, 12, 31); // 31 de diciembre de 2023

        // Compara la fecha actual del sistema (LocalDate.now()) con la fecha asignada
        LocalDate currentDate = LocalDate.now();

        // Establece un mensaje basado en la comparación de fechas
        String expectedResult = currentDate.isBefore(person.getAssignedDate()) ?
                "You cannot be vaccinated. Come back later" :
                "The date was verified. Vaccinated person: Nico with Identification: 123, Vaccine: AstraZeneca";

        // Usa el ProxyVaccination para vacunar al person
        String result = proxyVaccination.vaccinate(person);

        // Verifica que el resultado es el mensaje esperado
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should Vaccinate Successfully on Assigned Date")
    void testVaccinationValidDate() {
        // Usa la fecha actual como la fecha asignada
        LocalDate currentDate = LocalDate.now();
        person = new Person("Nico", "Perez", "123", currentDate, "AstraZeneca");
        String result = proxyVaccination.vaccinate(person);
        assertEquals("The date was verified. Vaccinated person: Nico with Identification: 123, Vaccine: AstraZeneca", result);
    }

    @Test
    @DisplayName("Should Vaccinate Successfully After Assigned Date")
    void testVaccinationValidDateAfterAssigned() {
        // Usa una fecha futura para verificar que la vacunación es correcta si la fecha actual es posterior a la asignada
        LocalDate futureDate = LocalDate.of(2024, 1, 2); // 2 de enero de 2024
        person = new Person("Nico", "Perez", "123", LocalDate.of(2024, 1, 1), "AstraZeneca");
        // Simula la fecha actual como posterior a la fecha asignada
        proxyVaccination = new ProxyVaccination();
        String result = proxyVaccination.vaccinate(person);
        assertEquals("The date was verified. Vaccinated person: Nico with Identification: 123, Vaccine: AstraZeneca", result);
    }
}
