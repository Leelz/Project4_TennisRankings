package com.example.user.tennisrankings;
import java.lang.reflect.Array;
import java.util.Arrays.*;

/**
 * Created by user on 12/12/2016.
 */

// Class Rankings

public class Ranking {

    private Player[] rankings;

    //Constructor 1
    public Ranking() {
        this.rankings = new Player[10];
    }

    //Get player rankings
    public Player[] getRankings() {
        return this.rankings;
    }

    //Count Players in Array
    public int playerCount() {
        int count = 0;
        for (Player player : rankings) {
            if (player != null) {
                count++;
            }
        }
        return count;
    }

    // Add Player
    public void add(Player player) {
        int playerCount = playerCount();
        rankings[playerCount] = player; //whatever is at position 0
    }

    //Find Plyer
    public Player findPlayer(int rank){
        return rankings[rank-1];
    }

    public void replacePlayer(Player newPlayer) {
        int playerCount = (playerCount() - 1);
        ???
        add(newPlayer);
    }

    public String findByName(String name){
        for (Player player : rankings) {
            if (player.getName().equals (name)){
                return player.toString();
            }
        }
        return "Athlete not found.";
    }
}
