import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy H:m:s");
        LocalDateTime parsed = LocalDateTime.parse(appointmentDateDescription, formatter);
        return parsed;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        //recebe datetime retorna string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'You have an appointment on 'EEEE, MMMM d, YYYY, 'at' h:mm a.");
        //
        String dateFormatted = appointmentDate.format(formatter);
        return dateFormatted;
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
