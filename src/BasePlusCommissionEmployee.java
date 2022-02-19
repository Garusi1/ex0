import java.util.Objects;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private float baseSalary;

    public BasePlusCommissionEmployee(String first, String last, int id, float grossSales, int commision, float baseSalary) {
        super(first, last, id, grossSales, commision);
        if(baseSalary<=0) {
            throw new IllegalArgumentException("it needs to be positive");
        }
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary=0;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(that.baseSalary, baseSalary) == 0;
    }
    @Override
    public float earnings(){
        int salary = (int) (super.earnings() +this.baseSalary);
        return salary;
   }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstname = " +getFirstName()
                +", lastname=" +getLastName()
                +", id=" +getId()+
                ", grossSales=" + getGrossSales() +
                ", commision=" + getCommision() +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
