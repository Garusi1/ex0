import java.util.Objects;

public class CommissionEmployee extends Employee {

    private float grossSales;
    private int commision;

    public CommissionEmployee(String first, String last, int id, float grossSales, int commision) {
        super(first, last, id);
        if(grossSales<0 || commision<0 || commision>100) {
            throw new IllegalArgumentException("id needs to be positive");
        }
        this.grossSales = grossSales;
        this.commision = commision;
    }

    public CommissionEmployee() {
        super();
        this.commision=0;
        this.grossSales=0;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstname = " +getFirstName()
                +", lastname=" +getLastName()
                +", id=" +getId()+
                ", grossSales=" + grossSales +
                ", commision=" + commision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commision);
    }

    @Override
    public float earnings() {
        return (grossSales/100)*commision;
    }
}
