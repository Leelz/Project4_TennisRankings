package com.example.user.tennisrankings;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */

public class PlayerTest {

    Player player;
    Player player2;

    @Before
    public void before() {
        player = new Player("Andy Murray", "Muzz", 1);
        player2 = new Player("Djokovic", "Jockey", 2);
    }

    @Test
    public void getNameTest()    {
        assertEquals("Andy Murray", player.getName());
    }

    @Test
    public void setNameTest()    {
        player2.setName("Novak Djokovic");
        assertEquals("Novak Djokovic", player2.getName());
    }

    @Test
    public void getNicknameTest()    {
        assertEquals("Muzz", player.getNickname());
    }

    @Test
    public void setNicknameTest()    {
        player.setNickname("Muzza");
        assertEquals("Muzza", player.getNickname());
    }

    @Test
    public void getRankingTest()    {
        assertEquals(1, player.getRanking());
    }

    @Test
    public void setRankingTest() {
        player.setRanking(3);
        assertEquals(3, player.getRanking());
    }

    @Test
    public void toStringTest()  {
        assertEquals("Name: Andy Murray, Nickname: Muzz, Ranking: 1", player.toString());
    }
}
