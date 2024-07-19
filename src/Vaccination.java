public class Vaccination implements IVaccinationCenter {
    @Override
    public String vaccinate(Person person) {
        return "The date was verified. Vaccinated person: " +
                person.getName() + " with Identification: " +
                person.getIdentification() + ", Vaccine: " +
                person.getVaccinationName();
    }
}
