import java.util.Scanner;

public class CalcFeet2CentJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Feet: ");
        double feet = in.nextDouble();

        System.out.println("Enter Inches: ");
        double inches = in.nextDouble();
        
        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        if(centimeters <0.0){
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(inches);

        in.close();
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet <0) || ((inches <0 ) || (inches >12))){
            System.out.println("Invalid feet or inches.");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}

