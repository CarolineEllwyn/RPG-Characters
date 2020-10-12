package com.company.Hero;

import java.util.HashMap;

//This is an interface that this class implements.
    public class Warrior implements IHero{
        private int level;
        private int health;
        private int strength;
        private int dexterity;
        private int intelligence;
        private int experience;

    //This is an constructor that make that startstatus of the object
    public Warrior() {
        this.level = 1;
        this.health = 150;
        this.strength = 10;
        this.dexterity = 3;
        this.intelligence = 1;
        this.experience = 0;
    }

    //This is an method that set the value on the object after its get up in level
    public void onLevelUp() {
        setHealth(this.health = health + 30);
        setStrength(this.strength = strength + 5);
        setDexterity(this.dexterity = dexterity + 2);
        setIntelligence(this.intelligence = intelligence + 1);
    }

    //this is an method that print the status of the object when its level up
    public void printStatusOnLevelUp(){
        System.out.println("Level up!");
        System.out.println("Now level " + getLevel());
        System.out.println(" ");
        System.out.println(getPointsToLevelUp(level)-getExperience() + " needed to level up");
        printDetails();
    }

    //This is an method that prints the value on the object.
    public void printDetails(){
        System.out.println("Warrior details: ");
        System.out.println("HP: " + getHealth());
        System.out.println("Str: " + getStrength());
        System.out.println("Dex: " + getDexterity());
        System.out.println("Lvl: " + getLevel());
        System.out.println(getPointsToLevelUp(level) - getExperience() + " XP to next.");
    }


        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public void setLevel(int level) {
            this.level = level;
        }

        @Override
        public int getHealth() {
            return health;
        }

        @Override
        public void setHealth(int health) {
            this.health = health;
        }
        @Override
        public int getStrength() {
            return strength;
        }

        @Override
        public void setStrength(int strength) {
            this.strength = strength;
        }
        @Override
        public int getDexterity() {
            return dexterity;
        }

        @Override
        public void setDexterity(int dexterity) {
            this.dexterity = dexterity;
        }
        @Override
        public int getIntelligence() {
            return intelligence;
        }

        @Override
        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }

        public int getExperience(){
            return experience;
        }

        public void setExperience(int experience){
            this.experience = experience;
        }

    public HashMap<Integer, Integer> getPointsToNextLevels(int increasedExperience){
        int pointsToNextLevel = 100;
        int newGoal = 1;
        HashMap<Integer, Integer> newGoals = new HashMap<Integer, Integer>();
        for(int i = 0; i < increasedExperience; i++) {
            newGoals.put(newGoal, pointsToNextLevel);
            pointsToNextLevel += pointsToNextLevel * 0.1;
            newGoal++;
        }
        return newGoals;
    }

    public int getPointsToLevelUp(int levelNow){
        int pointsToLevelUp = 100;
        if (levelNow > 1){
            for(int i = 0; i < levelNow; i++) {

                pointsToLevelUp += pointsToLevelUp * 0.1;
            }
        }
        return pointsToLevelUp;
    }

    public int getExperienceLevelGoals(int levelNow){
        HashMap<Integer, Integer> hashLevelExperience = getPointsToNextLevels(levelNow);
        return hashLevelExperience.get(levelNow);
    }

    //The system starts with this method and triggers the others methods.
        public void getExperience(int increasedExperience) {
            HashMap<Integer, Integer> experienceList = new HashMap<Integer, Integer>();
            experienceList = getPointsToNextLevels(increasedExperience);
            int valueToNextLevel = getPointsToLevelUp (this.level + 1);
            experience =  increasedExperience;
            
            System.out.println("Warrior gaining "+ increasedExperience + "xp!");
            System.out.println(" ");

            for (int i = level; i < experienceList.size(); i++) {
                experience = experience - experienceList.get(i);
                level = level + 1;

                System.out.println("Level up!");
                System.out.println("Now level " + level);
                System.out.println(" ");

                if(experience-experienceList.get(i) < 0){
                    System.out.println(experience + " more needed to level up!");
                    break;
                }
            }
            System.out.println("  ");
            printDetails();
        }


    }