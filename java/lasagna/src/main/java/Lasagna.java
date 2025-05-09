public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int timePassed){
        return expectedMinutesInOven() - timePassed;
    }
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }
    public int totalTimeInMinutes(int layers, int timePassed){
        return preparationTimeInMinutes(layers)+timePassed;
    }
}
