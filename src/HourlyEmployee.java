public class HourlyEmployee extends Employee{

    private int hours;
    private float wage;

    @Override
    public void earnings() {

    }

    public HourlyEmployee(String first, String last, int id, int hours, float wage) {
        super(first, last, id);
        this.hours = hours;
        this.wage = wage;
    }

    public HourlyEmployee() {
        super();
        hours =0;
        wage = 0;
    }
}
