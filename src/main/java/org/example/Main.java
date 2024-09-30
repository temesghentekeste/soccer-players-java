package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoccerPlayer player1 = new SoccerPlayer("Erling Haaland", 23, "Manchester City", 36);
        SoccerPlayer player2 = new SoccerPlayer("Mohamed Salah", 31, "Liverpool", 25);
        SoccerPlayer player3 = new SoccerPlayer("Harry Kane", 29, "Tottenham Hotspur", 20);
        SoccerPlayer player4 = new SoccerPlayer("Kevin De Bruyne", 32, "Manchester City", 15);
        SoccerPlayer player5 = new SoccerPlayer("Bukayo Saka", 23, "Arsenal", 5);
        SoccerPlayer player6 = new SoccerPlayer("Martin Odegard", 24, "Arsenal", 5);

        // testing
        System.out.println(player1);
        System.out.println(player2);

        // equality
        if(player4.equals(player5)) {
            System.out.println("Equal");
            System.out.println(player4);
            System.out.println(player5);
        } else {
            System.out.println("Not equal");
            System.out.println(player4);
            System.out.println(player5);
        }

        System.out.println();
        // equality
        if(player6.equals(player5)) {
            System.out.println("Equal");
            System.out.println(player6);
            System.out.println(player5);
        } else {
            System.out.println("Not equal");
            System.out.println(player6);
            System.out.println(player5);
        }

    }
}