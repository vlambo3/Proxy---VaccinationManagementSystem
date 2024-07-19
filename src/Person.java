import java.time.LocalDate;

public class Person {
    private String name;
    private String lastname;
    private String identification;
    private LocalDate assignedDate;
    private String vaccinationName;

    public Person(String name, String lastname, String identification, LocalDate assignedDate, String vaccinationName) {
        this.name = name;
        this.lastname = lastname;
        this.identification = identification;
        this.assignedDate = assignedDate;
        this.vaccinationName = vaccinationName;
    }

    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }

    public String getVaccinationName() {
        return vaccinationName;
    }

    public LocalDate getAssignedDate() {
        return assignedDate;
    }

}
