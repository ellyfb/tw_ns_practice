package com.thoughtworks.ns.practice;

public class UglyTennisGame implements TennisGame {
    public int P1point = 0;
    public int P2point = 0;

    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public UglyTennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";

        if(P1point == 0)
            P1res = "Love";
        else if(P1point == 1)
            P1res = "Fifteen";
        else if(P1point == 2)
            P1res = "Thirty" ;
        else
            P1res = "Forty" ;
        if(P2point == 0)
            P2res = "Love";
        else if(P2point == 1)
            P2res = "Fifteen";
        else if(P2point == 2)
            P2res = "Thirty" ;
        else
            P2res = "Forty" ;

         if(P1point == P2point)
         {
             if(P1point < 3)
                  score = P1res + "-" + "All";
             else
                  score = "Deuce";
         }
         else if(P1point < 4 && P2point < 4)
             score = P1res + "-" + P2res;

        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage "+player1Name;
        }

        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage "+player2Name;
        }

        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for "+player1Name;
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for "+this.player2Name;
        }
        return score;
    }

    public void SetP1Score(int number){

        for (int i = 0; i < number; i++)
        {
            P1point++;
        }

    }

    public void SetP2Score(int number){

        for (int i = 0; i < number; i++)
        {
            P2point++;
        }

    }
    public void wonPoint(String player) {
        if (player == player1Name)
            P1point++;
        else
            P2point++;
    }
}
