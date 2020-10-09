package com.company.Hero;

public class Warrior implements IHero{


        //Fields(attributes)
        public int health;
        public int strength;
        public int dexterity;
        public int intelligence;
        public int level;


        //Constructor
        public Warrior( int health, int strength, int dexterity, int intelligence, int level) {
            this.health = health;
            this.strength = strength;
            this.dexterity = dexterity;
            this.intelligence = intelligence;
            this.level = level;
        }

        @Override
        public int getLevel() {
            System.out.println("Lvl: " + level);
            return level;
        }

        @Override
        public void setLevel() {

        }

        @Override
        public int getStrength() {
            System.out.println("Str: " + strength);
            return strength;
        }

        @Override
        public void setStrength() {

        }

        @Override
        public int getHealth() {
            System.out.println("HP: " + health);
            return health;
        }

        @Override
        public void setHealth() {

        }

        @Override
        public int getDexterity() {
            System.out.println("Dex: " + dexterity);
            return dexterity;
        }

    @Override
    public void setDexterity() {

    }

    @Override
    public int getIntelligence() {
        return 0;
    }

    @Override
        public void setIntelligence() {

        }
    }


