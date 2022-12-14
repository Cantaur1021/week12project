import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Appointment {
    String specialist1 = "prosthodontist";
    String specialist2 = "orthodontist";
    String specialist3 = "periodontics";
    String specialist4 = "endodontics";

    static String doctor;
    static String userInput;
    static int apptTime;
    static String apptDay;


    Scanner input = new Scanner(System.in);

    public void Appointments(){
        System.out.println("----------------------------------------------------");
        System.out.println("Welcome to Avance Dental Clinic");
        System.out.println("----------------------------------------------------");

        System.out.println("Please select the specialist you want to visit: ");
        System.out.println(specialist1);
        System.out.println(specialist2);
        System.out.println(specialist3);
        System.out.println(specialist4);

        userInput = input.next().toLowerCase();

        while(!(userInput.equals(specialist1)) && (userInput.equals(specialist2)) && (userInput.equals(specialist3)) && (userInput.equals(specialist4)))
        {
            System.out.println("Please enter a value from the given options!");
            userInput = input.next().toLowerCase();
        }
        System.out.println("You have chosen: " + userInput);



    }
    public void assignDoctor(){
        String doctor1 = "Dr. Shibu George";
        String doctor2 = "Dr. Rekha Menon";
        String doctor3 = "Dr. Ryan Hansen";
        String doctor4 = "Dr. Mustafa Abdullah";

        if(userInput.equals(specialist1)){
            System.out.println("The doctor assigned is " + doctor1);
            doctor = doctor1;
        }
        else if(userInput.equals(specialist2)){
            System.out.println("The doctor assigned is " + doctor2);
            doctor = doctor2;
        }
        else if(userInput.equals(specialist3)){
            System.out.println("The doctor assigned is "+ doctor3);
            doctor = doctor3;
        }
        else if(userInput.equals(specialist4)){
            System.out.println("The doctor assigned is "+ doctor4);
            doctor = doctor4;
        }
    }
    public void timeOfAppointment(){
        int doctorReportingTime;
        int doctorDepartingTime;
        double appointmentTimeDouble;
        int appointmentTimeInt;

        if(userInput.equals(specialist1)){
            doctorReportingTime = 13;
            doctorDepartingTime = 20;
            appointmentTimeDouble = Math.random() * (doctorDepartingTime - doctorReportingTime + 1) + doctorReportingTime;
            appointmentTimeInt = (int)appointmentTimeDouble;
            System.out.println("The appointment is at: " + appointmentTimeInt + ":00");
            apptTime = appointmentTimeInt;
        }
        else if(userInput.equals(specialist1)){
            doctorReportingTime = 9;
            doctorDepartingTime = 16;
            appointmentTimeDouble = Math.random() * (doctorDepartingTime - doctorReportingTime + 1) + doctorReportingTime;
            appointmentTimeInt = (int)appointmentTimeDouble;
            System.out.println("The appointment is at: " + appointmentTimeInt + ":00");
            apptTime = appointmentTimeInt;
        }
        else if(userInput.equals(specialist3)){
            doctorReportingTime = 16;
            doctorDepartingTime = 22;
            appointmentTimeDouble = Math.random() * (doctorDepartingTime - doctorReportingTime + 1) + doctorReportingTime;
            appointmentTimeInt = (int)appointmentTimeDouble;
            System.out.println("The appointment is at: " + appointmentTimeInt + ":00");
            apptTime = appointmentTimeInt;
        }
        else if(userInput.equals(specialist4)){
            doctorReportingTime = 14;
            doctorDepartingTime = 21;
            appointmentTimeDouble = Math.random() * (doctorDepartingTime - doctorReportingTime + 1) + doctorReportingTime;
            appointmentTimeInt = (int)appointmentTimeDouble;
            System.out.println("The appointment is at: " + appointmentTimeInt + "0:00");
            apptTime = appointmentTimeInt;
        }
    }

    public void dayOfAppointment(){
        String dayInput;
        String monday = "monday";
        String tuesday = "tuesday";
        String wednesday = "wednesday";
        String thursday = "thursday";
        String friday = "friday";
        System.out.println("Please select a day: ");
        System.out.println(monday);
        System.out.println(tuesday);
        System.out.println(wednesday);
        System.out.println(thursday);
        System.out.println(friday);
        dayInput = input.next().toLowerCase();
        while(!(dayInput.equals(monday)) && (dayInput.equals(tuesday)) && (dayInput.equals(wednesday)) && (dayInput.equals(thursday)) && (dayInput.equals(friday))){
            System.out.println("Please enter a valid day");
            dayInput = input.next().toLowerCase();
        }
        System.out.println("The selected day is: " + dayInput);
        apptDay = dayInput;


    }
//    public Appointment(String doctorName, int appointmentTime, String dayOfAppointment, String problemDescription) {
//        String name = doctorName;
//        int appTime = appointmentTime;
//        String dayAppointment = dayOfAppointment;
//        String description = problemDescription;
//    }
//
//        public void showAppointmentDetails(){
//            System.out.println("Appointment With Doctor" + doctorName + "At" + appointmentTime + ":00" + "on" + dayOfAppointment + "for" + problemDescription);
//    }
}

