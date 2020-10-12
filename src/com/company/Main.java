package com.company;

import com.company.Hero.Mage;
import com.company.Hero.Ranger;
import com.company.Hero.Warrior;

public class Main {

    public static void main(String[] args) {

        
        //System.out.println(warrior.getExperienceTargetByLevel(6));

        Warrior myWarrior = new Warrior();

        myWarrior.getPointsToLevelUp(5);

        myWarrior.setLevel(1);
        myWarrior.getExperience(300);

    }
}
