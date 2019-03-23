package software.crafting.serbia.impl;

import software.crafting.serbia.Scoreboard;

public class FormattedScoreboard {

  private final Scoreboard scoreboard;

  public FormattedScoreboard(Scoreboard scoreboard) {
    this.scoreboard = scoreboard;
  }

  public void display(int teamAScore, int teamBScore) {
    final String formatted = String.format("%03d:%03d", teamAScore, teamBScore);
    scoreboard.display(formatted);
  }
}
