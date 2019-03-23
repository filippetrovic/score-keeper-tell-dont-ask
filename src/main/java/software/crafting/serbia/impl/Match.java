package software.crafting.serbia.impl;

public class Match {

  public int teamA;
  public int teamB;

  public void scoreTeamA(int points) {
    this.teamA += points;
  }

  public void scoreTeamB(int points) {
    this.teamB += points;
  }
}
