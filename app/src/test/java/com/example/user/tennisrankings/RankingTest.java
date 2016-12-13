package com.example.user.tennisrankings;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */

//Test File

public class RankingTest {

    private Ranking rankings;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Player player5;

    @Before
    public void before()    {
        rankings = new Ranking();
        player1 = new Player("Andy Murray", "Muzz", 1);
        player2 = new Player("Novak Djokovic", "Djoko", 2);
        player3 = new Player("Milos Raonic", "Milo", 3);
        player4 = new Player("Stan Wawrinka", "Tubby Hamster", 4);
        player5 = new Player("Kei Nishkori", "Japanese", 5);
    }

    @Test
    public void rankingStartsAtZero() {
        assertEquals(0, rankings.playerCount());
    }

    @Test
    public void canAddPlayer() {
        rankings.add(player1);
        assertEquals(1, rankings.playerCount());
    }

    @Test
    public void canFindPlayer() {
        rankings.add(player1);
        rankings.add(player2);
        rankings.add(player3);
        assertEquals("Novak Djokovic", rankings.findPlayer(2).getName());
    }

    @Test
    public void canReplacePlayer() {
        rankings.add(player1);
        rankings.add(player2);
        rankings.add(player3);
        rankings.replacePlayer(player1);
        assertEquals("Andy Murray", rankings.findPlayer(2).getName());

    }


}


