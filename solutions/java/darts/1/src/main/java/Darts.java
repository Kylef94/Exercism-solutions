class Darts {
    int score(double xOfDart, double yOfDart) {
        int innerCircleScore = 10;
        int middleCircleScore = 5;
        int outerCircleScore = 1;
        int missedScore = 0;
        double radius = Math.sqrt(((xOfDart * xOfDart) + (yOfDart * yOfDart) ));

        if (radius <= 1) {
            return innerCircleScore;
        }
        else if (radius <= 5) {
            return middleCircleScore;
        }
        else if (radius <= 10) {
            return outerCircleScore;
        }

        return missedScore;
    }
}
