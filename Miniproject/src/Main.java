import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Appointment newAppointment = new Appointment();
        AppointmentToken newToken = new AppointmentToken();

        newAppointment.Appointments();
        newAppointment.assignDoctor();
        newAppointment.timeOfAppointment();
        newAppointment.dayOfAppointment();
        newToken.appointmentToken();
    }

}