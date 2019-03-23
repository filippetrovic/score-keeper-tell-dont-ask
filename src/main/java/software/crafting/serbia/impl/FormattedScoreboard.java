package software.crafting.serbia.impl;

import software.crafting.serbia.Scoreboard;

public class FormattedScoreboard {

  private final Scoreboard scoreboard;

  public FormattedScoreboard(Scoreboard scoreboard) {
    this.scoreboard = scoreboard;
  }

  public void display(int teamAScore, int teamBScore) {
    scoreboard.display("00" + teamAScore + ":00" + teamBScore);
  }
}
