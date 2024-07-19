import java.time.LocalDate;

// ProxyVaccination acts as a proxy for the actual Vaccination class, controlling access to it.
public class ProxyVaccination implements IVaccinationCenter {

    // Instance of the real Vaccination class that the proxy will delegate calls to.
    private Vaccination vaccination;

    // Constructor for ProxyVaccination. Initializes the Vaccination instance.
    public ProxyVaccination() {
        this.vaccination = new Vaccination();
    }

    @Override
    // Method to vaccinate a person. This method is called through the proxy to control access.
    public String vaccinate(Person person) {
        // Verificar si la fecha de vacunación es igual o posterior a la fecha asignada

        LocalDate today = LocalDate.now();
        if (!today.isBefore(person.getAssignedDate())) {
            // Si la fecha es válida, delegar la llamada a la clase de vacunación real
            return vaccination.vaccinate(person);
        }
        // Si la fecha no es válida (anterior a la fecha asignada), devolver un mensaje indicando que no se puede vacunar
        return "You cannot be vaccinated. Come back later.";
    }
}
