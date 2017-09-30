package nyc.c4q.akrios25.helloworld;

import java.util.*;
public class Main {

    public static void main(String[] args) {
         final int GOD_TIER = 0;
         final int FIRE = 1;
         final int ICE = 2;
         final int LIGHTNING = 3;
         final int ILLUSION = 4;
         final int OTHER1 = 5;
         final int INITIATE = 6;
         final int FIN = 7;
        Scanner scan = new Scanner(System.in);
        String choice;
        int spell = INITIATE;
        while(spell != FIN) {
            switch (spell) {


                case INITIATE:
                    System.out.println("Welcome to...");
                    System.out.println(".▄▄ ·      ▄▄▄·    ▄▄▄ .    ▄▄▌      ▄▄▌              ▄▄·      ▄▄▄·     .▄▄ ·     ▄▄▄▄▄    ▄▄▄ .    ▄▄▄  \n" +
                            "▐█ ▀.     ▐█ ▄█    ▀▄.▀·    ██•      ██•             ▐█ ▌▪    ▐█ ▀█     ▐█ ▀.     •██      ▀▄.▀·    ▀▄ █·\n" +
                            "▄▀▀▀█▄     ██▀·    ▐▀▀▪▄    ██▪      ██▪             ██ ▄▄    ▄█▀▀█     ▄▀▀▀█▄     ▐█.▪    ▐▀▀▪▄    ▐▀▀▄ \n" +
                            "▐█▄▪▐█    ▐█▪·•    ▐█▄▄▌    ▐█▌▐▌    ▐█▌▐▌           ▐███▌    ▐█ ▪▐▌    ▐█▄▪▐█     ▐█▌·    ▐█▄▄▌    ▐█•█▌\n" +
                            " ▀▀▀▀     .▀        ▀▀▀     .▀▀▀     .▀▀▀            ·▀▀▀      ▀  ▀      ▀▀▀▀      ▀▀▀      ▀▀▀     .▀  ▀\n");
                    System.out.println("\nyou have the ability to cast spells");
                    System.out.println("here's a list of what you can cast");
                    System.out.println("Fire/Ice/Lightning/Illusion");

                    choice = scan.nextLine();
                    if(choice.toLowerCase().equals("fire")){
                        spell = FIRE;
                        break;
                    } else if (choice.toLowerCase().equals("ice")) {
                        spell = ICE;
                    } else if(choice.toLowerCase().equals("lightning")){
                        spell = LIGHTNING;
                    } else if(choice.toLowerCase().equals("illusion")){
                        spell = ILLUSION;
                    } else if (choice.toLowerCase().equals("")){
                        spell = GOD_TIER;
                    }
                    break;

                    case FIRE:
                    System.out.println("you have chosen a fire spell....");
                    Spell FIRSpell = new Spell("Fire");
                    FIRSpell.fireSpell();
                        System.out.println(" You are learning how to cast well... next spell? ");
                    choice = scan.nextLine();
                    if(choice.toLowerCase().equals("yes")){
                        spell = OTHER1;
                    } else if(choice.toLowerCase().equals("no")) {
                        spell = FIN;
                    }


                    break;

                    case LIGHTNING:
                    System.out.println("you have chosen a lightning spell...");
                    Spell LTNSpell = new Spell("Lightning");
                    LTNSpell.lightningSpell();
                        System.out.println("Interesting...would you like to go again?");
                        choice = scan.nextLine();
                        if(choice.toLowerCase().equals("yes")){
                            spell = OTHER1;
                        } else if(choice.toLowerCase().equals("no")) {
                            spell = FIN;
                        } else {
                            spell = GOD_TIER;
                        }

                    break;


                    case ICE:
                    System.out.println("you have gone with Ice...");
                    Spell ICESpell = new Spell("Frost");
                    ICESpell.iceSpell();
                        System.out.println("will you cast another spell?");
                        choice = scan.nextLine();
                        if(choice.toLowerCase().equals("yes")){
                            spell = OTHER1;
                        } else if(choice.toLowerCase().equals("no")) {
                            spell = FIN;
                        } else {
                            spell = GOD_TIER;
                        }
                    break;


                    case ILLUSION:
                    System.out.println("you have chosen an Illusion.....oh dear");
                    Spell ILUSpell = new Spell("illusion");
                    ILUSpell.illusionSpell();
                        System.out.println("glad that's over. Next spell maybe?");
                        choice = scan.nextLine();
                        if(choice.toLowerCase().equals("yes")){
                            spell = OTHER1;
                        } else if(choice.toLowerCase().equals("no")) {
                            spell = FIN;
                        } else {
                            spell = GOD_TIER;
                        }
                    break;



                    case OTHER1:
                        System.out.println("You have chosen to cast again..");
                        System.out.println("your choices are");
                        System.out.println("Fire/Lightning/Ice/Illusion");
                        choice =scan.nextLine();
                        if(choice.toLowerCase().equals("fire")){
                            spell = FIRE;
                            break;
                        } else if (choice.toLowerCase().equals("ice")) {
                            spell = ICE;
                        } else if(choice.toLowerCase().equals("lightning")){
                            spell = LIGHTNING;
                        } else if(choice.toLowerCase().equals("illusion")){
                            spell = ILLUSION;
                        } else{
                            spell = GOD_TIER;
                        }

                    break;
                case FIN:
                    System.out.println("You have cast many a spell. Now go home and leave me alone.");
                    choice = scan.nextLine();
                    if(choice.charAt(0) == ' '){
                        spell = INITIATE;
                    }
                    break;
                default:
                    System.out.println(" Tearing this space asunder, rendering all life and existence futile");
                        System.out.println("You ascend death, Eternal");
                        Spell finalSpell = new Spell("FURIA");
                        finalSpell.godTier();
                    for (int i = 0; i < 4; i++) {
                        System.out.println("S P A R E \nU S \nO F \nO U R \nS I N S");
                    }

                    choice = scan.nextLine();
                    spell = FIN;
                        break;
            }
        }


    }
}
