public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int cookingTime) {
        return expectedMinutesInOven() - cookingTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int lasagneLayers) {
        return 2 * lasagneLayers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int lasagneLayers, int cookingTime) {
        return preparationTimeInMinutes(lasagneLayers) + cookingTime;
    }
}
