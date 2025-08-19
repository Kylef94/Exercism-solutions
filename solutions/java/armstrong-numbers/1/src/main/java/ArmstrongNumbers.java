import java.util.ArrayList;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int num = numberToCheck;
        ArrayList<Integer> digits = new ArrayList();
        int sum = 0;

        while (num > 0) {
            digits.add(num % 10);
            num = Math.floorDiv(num, 10);
        }
        
        int numDigits = digits.size();
        for (Integer digit: digits) {
            sum = sum + (int) Math.pow(digit, numDigits);
        }

        return sum == numberToCheck;
    }

}
