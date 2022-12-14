public class AppointmentToken {
    public void appointmentToken(){
        double tokenNumber = Math.random();
        int token = (int)tokenNumber;
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|                             TOKEN NUMBER"+token+"                         |" );
        System.out.println("|Doctor:"+Appointment.doctor+"                                              |" );
        System.out.println("|Time of Appointment:"+Appointment.apptTime+":00"+"                         |" );
        System.out.println("|Day of Appointment:"+Appointment.apptDay+"                                 |" );
        System.out.println("------------------------------------------------------------------------------");
    }
}
