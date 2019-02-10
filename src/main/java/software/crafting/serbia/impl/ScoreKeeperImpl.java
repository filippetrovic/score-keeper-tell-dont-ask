package software.crafting.serbia.impl;

import software.crafting.serbia.ScoreKeeper;
import software.crafting.serbia.Scoreboard;

public class ScoreKeeperImpl implements ScoreKeeper {

  private final Scoreboard scoreboard;
  private int teamAScore;

  public ScoreKeeperImpl(Scoreboard scoreboard) {
    this.scoreboard = scoreboard;
  }

  @Override
  public void scoreTeamA1() {
    teamAScore += 1;
    scoreboard.display("00" + teamAScore + ":000");
  }

  @Override
  public void scoreTeamB1() {
    scoreboard.display("00" + teamAScore + ":001");
  }

  @Override
  public void scoreTeamA2() {

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
}
