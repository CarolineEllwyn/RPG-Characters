package com.company;

import com.company.Hero.Mage;
import com.company.Hero.Ranger;
import com.company.Hero.Warrior;

public class Main {

    public static void main(String[] args) {




       // Warrior warrior = new Warrior();
      //  System.out.println("level 1: " +  "Dex: "+ warrior.getDexterity() + " HP: " + warrior.getHealth() + " Level: " + warrior.getLevel() + " Str: " + warrior.getStrength());
       // warrior.onLevelUp();
       // System.out.println("level 2: " +  "Dex: "+ warrior.getDexterity() + " HP: " + warrior.getHealth() + " Level: " + warrior.getLevel() + " Str: " + warrior.getStrength());
      //  warrior.onLevelUp();
      //  System.out.println("level 3: " +  "Dex: "+ warrior.getDexterity() + " HP: " + warrior.getHealth() + " Level: " + warrior.getLevel() + " Str: " + warrior.getStrength());


       // System.out.println(warrior.getLevel());
       // System.out.println(warrior.getPointsToNextLevel(6));
       // feeeeeeel uträkning warrior.gainExperience(100);

        //System.out.println(warrior.getExperienceTargetByLevel(6));

        Warrior myWarrior = new Warrior();
        myWarrior.setLevel(1);
        myWarrior.getExperience(300);

    }
}
