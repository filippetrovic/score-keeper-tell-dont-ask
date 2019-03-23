package software.crafting.serbia.impl;

import software.crafting.serbia.Scoreboard;

public class FormattedScoreboard implements ScoreVisitor {

  private final Scoreboard scoreboard;

  public FormattedScoreboard(Scoreboard scoreboard) {
    this.scoreboard = scoreboard;
  }

  public void onVisit(int teamAScore, int teamBScore) {
    final String formatted = String.format("%03d:%03d", teamAScore, teamBScore);
    scoreboard.display(formatted);
  }
}
