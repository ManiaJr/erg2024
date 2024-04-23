package erg11.Exceptions;

public class Employee{

    private String name;
    private String birthDate;
    private double[] workingHours=new double[12];
    private double[] overtime=new double[12];
    private double hourlyWage;
    private int childNo;


    public Employee() {
    }

    public Employee(String name, String birthDate, double[] workingHours, double[] overtime, double hourlyWage, int childNo) throws IllegalArgumentException, InvalidBirthDateException{
        this.name = name;
        try{
            if(birthDate.length()!=10) throw new InvalidBirthDateException();
            int mera=Integer.parseInt(birthDate.substring(0, 2));
            if(mera<1 || mera>31) throw new InvalidBirthDateException();
            int mhnas=Integer.parseInt(birthDate.substring(3, 5));
            if(mhnas<1 || mhnas>12) throw new InvalidBirthDateException();
            this.birthDate = birthDate;
        }catch(InvalidBirthDateException e){
            System.out.println(name+" birth date is wrong "+birthDate+". You have to set the birth date later");
        }

        this.workingHours = workingHours;
        this.overtime = overtime;
        
        this.hourlyWage = hourlyWage;
        try{
            if(childNo<0)throw new IllegalArgumentException();
            this.childNo = childNo;
        }catch(IllegalArgumentException e){
            System.out.println("Child number cannot be negative "+childNo+". Child number will be set to 0");
            this.childNo=0;
        }
        
        
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        try{
            if(birthDate.length()!=10) throw new InvalidBirthDateException();
            int mera=Integer.parseInt(birthDate.substring(0, 2));
            if(mera<1 || mera>31) throw new InvalidBirthDateException();
            int mhnas=Integer.parseInt(birthDate.substring(3, 5));
            if(mhnas<1 || mhnas>12) throw new InvalidBirthDateException();
            this.birthDate = birthDate;
        }catch(InvalidBirthDateException e){
            System.out.println(name+" birth date is wrong"+birthDate+". You have to set the birth date later");
        }
    }

    public double[] getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(double[] workingHours) throws ArrayIndexOutOfBoundsException {
        try{
            this.workingHours = workingHours;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }

    public void setWorkingHours(double workingHours, int thesi) throws ArrayIndexOutOfBoundsException {
        try{
            this.workingHours[thesi] = workingHours;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }

    public double[] getOvertime() {
        return this.overtime;
    }

    public void setOvertime(double[] overtime) throws ArrayIndexOutOfBoundsException{
        try{
                this.overtime = overtime;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }

    public void setOvertime(double overtime, int thesi) throws InvalidOvertimeException, ArrayIndexOutOfBoundsException{
        try{
            if(overtime<0 || overtime>80)throw new InvalidOvertimeException();
            try{
                this.overtime[thesi] = overtime;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
                
        }catch(InvalidOvertimeException e){
            System.out.println("Overtime cannot be negative or exceed 80 hours. Overtime will be set to 0.");
            this.overtime[thesi]=0;
        }
        
    }

    public double getHourlyWage() {
        return this.hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getChildNo() {
        return this.childNo;
    }

    public void setChildNo(int childNo) {
        try{
            if(childNo<0)throw new IllegalArgumentException();
            this.childNo = childNo;
        }catch(IllegalArgumentException e){
            System.out.println("Child number cannot be negative "+childNo+". Child number will be set to 0");
            this.childNo=0;
        }
    }

    @Override
    public String toString() {
        String s="name= " + getName() +", birthDate= " + getBirthDate()+", WorkingHours= ";
        //+", workingHours= " + getWorkingHours() +", overtime= " + getOvertime() +", hourlyWage= " + getHourlyWage() +", childNum= " + getChildNo() 
        for(int i=0;i<workingHours.length;i++)
        s=s+" "+workingHours[i];

        s=s+", overtime= ";
        for(int i=0;i<overtime.length;i++)
        s=s+" "+overtime[i];

        s=s+", Hourly Wage= "+getHourlyWage()+", Number of Childs= "+getChildNo();
        return s;
    }

    public double childBenefitFactor() throws ArithmeticException{
        try{
            return (double)((100 - (50/getChildNo()))/200);
        }catch(ArithmeticException e){
            return 0;
        }
        
    }

    public double computeMonthlyIncome(int mhnas) throws ArrayIndexOutOfBoundsException{
        try{
            return (workingHours[mhnas-1]+overtime[mhnas-1]) * hourlyWage * (1+childBenefitFactor());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("O mhnas "+mhnas+" prepei na einai metajy twn iriwn 1-12 to mhniaio eisodika exei oristei 0");
            return 0;
        }
        
    }
}