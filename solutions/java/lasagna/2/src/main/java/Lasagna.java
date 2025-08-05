public class Lasagna {

    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int cookingTime) {
        return EXPECTED_MINUTES_IN_OVEN - cookingTime;
    }
    
    public int preparationTimeInMinutes(int lasagneLayers) {
        return PREPARATION_TIME_PER_LAYER * lasagneLayers;
    }

    
    public int totalTimeInMinutes(int lasagneLayers, int cookingTime) {
        return preparationTimeInMinutes(lasagneLayers) + cookingTime;
    }
}
