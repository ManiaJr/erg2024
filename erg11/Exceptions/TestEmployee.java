package erg11.Exceptions;

public class TestEmployee {
    public static void main(String[] args) throws IllegalArgumentException, InvalidBirthDateException, ArrayIndexOutOfBoundsException, InvalidOvertimeException{
        //String name, String birthDate, double[] workingHours, double[] overtime, double hourlyWage, int childNo
        double[] testWH=new double[12];
        for(int i=0;i<testWH.length;i++)
            testWH[i]=(Math.random()*24)+1;

            double[] testOT=new double[12];
            for(int i=0;i<testOT.length;i++)
                testOT[i]=(Math.random()*80)+1;

        //Employee ypallhlos=new Employee("Anna", "12/34/56789", testWH, testOT, 45.5, 0);
        Employee ypallhlos=new Employee();
        ypallhlos.setName("Anna");
        ypallhlos.setBirthDate("12/34/5678910");

        ypallhlos.setWorkingHours(testWH);
        ypallhlos.setWorkingHours(24, -1);
        
        ypallhlos.setOvertime(testOT);
        ypallhlos.setOvertime(80, 30);
        ypallhlos.setOvertime(81, 0);
        
        ypallhlos.setHourlyWage(45.5);
        ypallhlos.setChildNo(-1);
        //System.out.println(ypallhlos);
    }
}
