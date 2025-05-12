public class JedliksToyCar {
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        int distance = (100 - battery) * 20;
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        String msg = "";
        if (battery <= 0){
            msg = "Battery empty";
        } else {
            msg = "Battery at " + battery + "%";
        }
        return msg;
    }

    public void drive() {
        if (battery > 0){
            battery--;    
        }
    }
}