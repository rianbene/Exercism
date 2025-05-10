public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double sR = 0;
        if (speed >= 1 && speed <= 4){
            sR = 1;
        } else if (speed >= 5 && speed <= 8){
            sR = 0.9; 
        } else if (speed == 9){
            sR = 0.8; 
        } else if (speed == 10){
            sR = 0.77;
        }
        return sR * speed * 221;
    }

     public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }

}
