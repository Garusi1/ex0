public class Payroll {

    public static void main(String[]args){
        Employee employeeArr [] = new Employee[3];

        employeeArr[0] = new HourlyEmployee("michael", "garusi", 202020, 140,120);
        employeeArr[1]= new CommissionEmployee("nadav", "cohen", 306622,20000,20);
        employeeArr[2] = new BasePlusCommissionEmployee("yossi", "benabu", 3938,100000,10,10000);

        int weeksalary=0;
        for (int i = 0; i <employeeArr.length ; i++) {
            System.out.println(employeeArr[i].toString()+" week salary= "+(employeeArr[i].earnings()/4));

        }
    }
}
