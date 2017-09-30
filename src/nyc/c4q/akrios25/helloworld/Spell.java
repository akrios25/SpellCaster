package nyc.c4q.akrios25.helloworld;

import java.util.Random;

public class Spell {
    int dmg;
    int range;
    String incantation;

    public Spell(String incantation){
        Random ranges = new Random();
        dmg = ranges.nextInt(5) + 10;
        range = ranges.nextInt(3) + 4;

    }
    public void fireSpell(){
        Random ranges = new Random();
        this.incantation = "Novice Flames!";
        this.dmg = ranges.nextInt(5) + 10;
        this.range = ranges.nextInt(3) + 10;
        System.out.println("you feel a heat rise within you....from your hands you emit " + incantation + " with a  damage of "
        + dmg + " and a range of " + range + " feet. impressive.");

    }
    public void lightningSpell(){
        Random ranges = new Random();
        this.incantation = "Vorpal Lightning!";
        this.dmg = ranges.nextInt(10) + 34;
        this.range = ranges.nextInt(5) + 5;
        System.out.println("A surge runs through from your gut to your arms... expelling "+incantation+" with " +
                "a damage of "+dmg+" and a range of "+range+" feet. That looked like it hurt");

    }
    public void iceSpell(){
        Random ranges = new Random();
        this.incantation = "Frost Blast!";
        this.dmg = ranges.nextInt(15) + 25;
        this.range = ranges.nextInt(6) + 6;
        System.out.println("Your hands begin to shudder at the crippling effect of.."+incantation+ " It has a damage of "
        +dmg+ " and a range of " +range+ " feet. Cold, isn't it?");
    }
    public void illusionSpell(){
        System.out.println("Σας περιπλέκουμε γύρω μας με μια σύγχυση από εδάφη μακριά, άγνωστα σε εσάς ή τους. " +
                "Έχουμε πέσει θύμα ενός ατέλειωτου εφιάλτη.");
        System.out.println("....everyone returns to their initial state of being..");
        System.out.println("Even I don't know what just happened. Don't ask.");
    }
    public void godTier(){
        Random ranges = new Random();

        this.incantation = "የአማልክቱን መቆጣጠሪያ ቦታ እና ጊዜ መስበር ነው";
        this.dmg = ranges.nextInt(9999)+999;
        this.range = ranges.nextInt(9999)+999;
        System.out.println(incantation+" \nunfathomable " + dmg +" damage!!! \nDecimating all within a range of "
                + range + " feet!");
    }
}
