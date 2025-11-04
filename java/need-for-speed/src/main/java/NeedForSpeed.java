class NeedForSpeed {
    private int battery;
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.battery = 100;
        this.distanceDriven = 0;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (battery < batteryDrain);
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (battery >= batteryDrain){
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }

    public int getSpeed(){
        return speed;
    }

    public int getBatteryDrain(){
        return batteryDrain;
    }    
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((double)distance/car.getSpeed() * car.getBatteryDrain()) <= 100;
    }
}
