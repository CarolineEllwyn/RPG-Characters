package com.company;

import com.company.Hero.Mage;
import com.company.Hero.Ranger;

public class Main {

    public static void main(String[] args) {

       Mage mage = new Mage( );
      System.out.println(mage.getHealth());
       mage.getStrength();
       mage.getDexterity();
       mage.getIntelligence();
       mage.getLevel();

       // Ranger ranger = new Ranger(360, 11,60,60,3);
       // ranger.getHealth();
        //ranger.getStrength();
        //ranger.getDexterity();
        //ranger.setIntelligence();
        //ranger.getLevel();

    }
}
