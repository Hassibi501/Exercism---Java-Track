public class Lasagna {
    public int expectedMinutesInOven(){
        int minutes = 40;
        return minutes;
    }
    
    public int remainingMinutesInOven(int acualMinutesInOven){
        return expectedMinutesInOven() - acualMinutesInOven;
    }
    
    public int preparationTimeInMinutes(int numbersOfLayersAdded){
        return numbersOfLayersAdded * 2;
    }
    
    public int totalTimeInMinutes(int numbersOfLayersAdded, int numberOfMinutesInOven){
        return preparationTimeInMinutes(numbersOfLayersAdded) + numberOfMinutesInOven;
    }
}
