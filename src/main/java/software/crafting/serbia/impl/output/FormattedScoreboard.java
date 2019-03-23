package software.crafting.serbia.impl.output;

import software.crafting.serbia.Scoreboard;
import software.crafting.serbia.impl.score.ScoreListener;

public class FormattedScoreboard implements ScoreListener {

  private final Scoreboard scoreboard;

  public FormattedScoreboard(Scoreboard scoreboard) {
    this.scoreboard = scoreboard;
  }

  public void onScoreChanged(int teamAScore, int teamBScore) {
    final String formatted = String.format("%03d:%03d", teamAScore, teamBScore);
    scoreboard.display(formatted);
  }
}
