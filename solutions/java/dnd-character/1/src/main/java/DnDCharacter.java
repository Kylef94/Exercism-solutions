import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        int min = 10;
        int sum = 0;

        for (int roll: scores) {
            sum = sum + roll;
            if (roll < min) {
                min = roll;
            }
        }

        return sum - min;
    }

    List<Integer> rollDice() {
        Random rand = new Random();
        ArrayList<Integer> rolls = new ArrayList();
        for (int i=0; i < 4; i++) {
            rolls.add(rand.nextInt(5) + 1);
        }
        return rolls;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
