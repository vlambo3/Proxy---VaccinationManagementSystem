import java.time.LocalDate;

public class Person {
    private String name;
    private String lastname;
    private String identification;
    private LocalDate assignedDate;
    private String vaccinationName;
    private boolean vaccinated;

    public Person(String name, String lastname, String identification, LocalDate assignedDate, String vaccinationName, boolean vaccinated) {
        this.name = name;
        this.lastname = lastname;
        this.identification = identification;
        this.assignedDate = assignedDate;
        this.vaccinationName = vaccinationName;
        this.vaccinated = false;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    /*
    This method performs the vaccination and checks if the date is valid; otherwise, it throws an exception.
     */
    public void vaccinate(LocalDate actualDate) {
        if (actualDate.isBefore(assignedDate)) {
            throw new IllegalArgumentException("The vaccination date must be equal to or after the assigned date.");
        }
        this.vaccinated = true;
        System.out.println("Vaccination confirmed: DNI: " + identification + ", Date: " + actualDate + ", Vaccine: " + vaccinationName);
    }
}
