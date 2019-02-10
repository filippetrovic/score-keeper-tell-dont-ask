package software.crafting.serbia.impl;

import software.crafting.serbia.ScoreKeeper;
import software.crafting.serbia.Scoreboard;

public class ScoreKeeperImpl implements ScoreKeeper {

  private final Scoreboard scoreboard;
  private int teamAScore;
  private int teamBScore;

  public ScoreKeeperImpl(Scoreboard scoreboard) {
    this.scoreboard = scoreboard;
  }

  @Override
  public void scoreTeamA1() {
    teamAScores(1);
    display();
  }

  @Override
  public void scoreTeamB1() {
    teamBScores(1);
    display();
  }

  @Override
  public void scoreTeamA2() {
    teamAScores(2);
    display();
  }

  @Override
  public void scoreTeamB2() {

  }

  @Override
  public void scoreTeamA3() {

  }

  @Override
  public void scoreTeamB3() {

  }

  private void teamBScores(int points) {
    teamBScore += points;
  }

  private void teamAScores(int points) {
    teamAScore += points;
  }

  private void display() {
    scoreboard.display("00" + teamAScore + ":00" + teamBScore);
  }

}
