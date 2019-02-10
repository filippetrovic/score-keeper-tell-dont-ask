# Score Keeper Kata

Score Keeper Kata in Java with "Tell! Don't ask!" constraint. 
More about [Score Keeper Kata](http://kata-log.rocks/score-keeper-kata) and ["Tell! Don't ask!" principle](http://kata-log.rocks/tell-dont-ask).

## Problem

We need software to deliver the proper data to the scoreboard for a basketball team. Unfortunately the people using our software are not the brightest lights under the sun, so they need six buttons (each team can score either 1, 2 or 3 points with a single shot).

## Your task

Write a class `ScoreKeeper` which offers following methods:

```
void scoreTeamA1()
void scoreTeamA2()
void scoreTeamA3()
void scoreTeamB1()
void scoreTeamB2()
void scoreTeamB3()
```

After every score change scoreboard should be immediately updated. 
Score board is represented with interface `Scoreboard`
which has a method for displaying score:
   
```
interface Scoreboard {
  void display(String score);
}
```

## Rules

Score, shown on scoreboard, should always has seven characters. An example would be `000:000`
