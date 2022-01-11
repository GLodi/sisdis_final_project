package drones.eventbus;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// Sent when drone has received all greetings
public class GreetingsMessage extends Message {
    public GreetingsMessage() {
        this.kind = "GREETINGS";
        this.timestamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss.SSS").format(Calendar.getInstance().getTime());
    }
}
