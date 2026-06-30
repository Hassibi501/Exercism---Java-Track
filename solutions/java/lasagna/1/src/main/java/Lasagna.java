public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int acualMinutesInOven){
        return expectedMinutesInOven() - acualMinutesInOven;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numbersOfLayersAdded){
        return numbersOfLayersAdded * 2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numbersOfLayersAdded, int numberOfMinutesInOven){
        return preparationTimeInMinutes(numbersOfLayersAdded) + numberOfMinutesInOven;
    }
}
