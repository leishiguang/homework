package demo.homework;

public class Test19 {
    //某公司的雇员分为以下若干类：
    //	Employee：这是所有员工总的父类，
    //		属性：
    //			员工的姓名,员工的生日月份。
    //		方法：getSalary(intmonth)
    //			根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
    //
    //	SalariedEmployee：
    //		Employee 的子类，拿固定工资的员工。
    //		属性：月薪
    //
    //	HourlyEmployee：
    //		Employee 的子类， 按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
    //		属性：每小时的工资、每月工作的小时数
    //
    //	SalesEmployee：
    //		Employee 的子类，销售人员，工资由月销售额和提成率决定。
    //		属性：月销售额、提成率
    //
    //	BasePlusSalesEmployee：
    //		SalesEmployee 的子类，有固定底薪的销售人员，工资 由底薪加上销售提成部分。
    //		属性：底薪。
    //
    //	根据要求创建 SalariedEmployee 、 HourlyEmployees 、SaleEmployee 和 BasePlusSalesEmployee四个类的对象各一个，
    //	并计算某个月这四个对象的工资。
    //
    //	注意：要求把每个类都做成完全封装，不允许非私有化属性。
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三", 5, 2000.0);
        HourlyEmployee hourlyEmployees = new HourlyEmployee("李四", 6, 180.5, 20.0);
        SalesEmployee salesEmployee = new SalesEmployee("王五", 7, 2000.0, 0.5);
        BasePlusSalesEmployee basePlusSalesEmployee = new BasePlusSalesEmployee("小明", 8, 1500.0, 0.3, 1000.0);


    }

}

class Employee {
    private String name;
    private int birthmonth;

    public Employee() {
    }

    public Employee(String name, int birthmonth) {
        this.name = name;
        this.birthmonth = birthmonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(int birthmonth) {
        this.birthmonth = birthmonth;
    }

    public void getSalary(int month) {
        if (month == birthmonth) {

        }

    }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int birthmonth, double monthlySalary) {
        super(name, birthmonth);
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int birthmonth) {
        super(name, birthmonth);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}

class HourlyEmployee extends Employee {
    private double workingHours;
    private double hourlyWage;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double workingHours, double hourlyWage) {
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(String name, int birthmonth, double workingHours, double hourlyWage) {
        super(name, birthmonth);
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(String name, int birthmonth) {
        super(name, birthmonth);
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}


class SalesEmployee extends Employee {
    private double sales;
    private double commission;

    public SalesEmployee() {
    }

    public SalesEmployee(String name, int birthmonth) {
        super(name, birthmonth);
    }

    public SalesEmployee(double sales, double commission) {
        this.sales = sales;
        this.commission = commission;
    }

    public SalesEmployee(String name, int birthmonth, double sales, double commission) {
        super(name, birthmonth);
        this.sales = sales;
        this.commission = commission;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}

class BasePlusSalesEmployee extends SalesEmployee {
    private double baseSalary;

    public BasePlusSalesEmployee() {
    }

    public BasePlusSalesEmployee(String name, int birthmonth) {
        super(name, birthmonth);
    }

    public BasePlusSalesEmployee(double sales, double commission) {
        super(sales, commission);
    }

    public BasePlusSalesEmployee(String name, int birthmonth, double sales, double commission) {
        super(name, birthmonth, sales, commission);
    }

    public BasePlusSalesEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusSalesEmployee(String name, int birthmonth, double baseSalary) {
        super(name, birthmonth);
        this.baseSalary = baseSalary;
    }

    public BasePlusSalesEmployee(double sales, double commission, double baseSalary) {
        super(sales, commission);
        this.baseSalary = baseSalary;
    }

    public BasePlusSalesEmployee(String name, int birthmonth, double sales, double commission, double baseSalary) {
        super(name, birthmonth, sales, commission);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}