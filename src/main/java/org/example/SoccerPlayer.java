package org.example;

public class SoccerPlayer {
    /*
       Task:
            a. Create SoccerPlayers class which will have name, age, team, scoredGoals.
            b. Create 3 Constructor (name, age, team, scoredGoals) (name, age, scoredGoals) (name, age, team)
            c. Create getter and setter for all variables.
            d. Override toString function
            e. Override equals function to compare scoredGoals and team (just two of them)
            f. Create main function and in the main function create 5-6 players. Then Test all of them.
            g. Create github repo for this project from your github and publish your codes in your github, then send the link to me.
     */

    private String name;
    private int age;
    private String team;
    private int scoredGoals;

    public SoccerPlayer(String name, int age, String team, int scoredGoals) {
        this.name = name;
        this.age =age;
        this.team = team;
        this.scoredGoals = scoredGoals;
    }

    public SoccerPlayer(String name, int age, int scoredGoals) {
        this.name = name;
        this.age = age;
        this.scoredGoals =scoredGoals;
    }

    public SoccerPlayer(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                ", scoredGoals=" + scoredGoals +
                '}';
    }


}
