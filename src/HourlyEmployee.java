import java.util.Objects;

public class HourlyEmployee extends Employee{

    private int hours;
    private float wage;


    public HourlyEmployee(String first, String last, int id, int hours, float wage) {
        super(first, last, id);
        if(hours<0 || wage<0 ) {
            throw new IllegalArgumentException("it needs to be positive");
        }
            this.hours = hours;
            this.wage = wage;

    }
    public HourlyEmployee() {
        super();
        hours =0;
        wage = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return hours == that.hours && Float.compare(that.wage, wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }

    @Override
    public float earnings() {
        return this.hours*this.wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstname = " +getFirstName()
                +", lastname=" +getLastName()
                +", id=" +getId()
                +", hours=" + hours +
                ", wage=" + wage +
                '}';
    }
}
