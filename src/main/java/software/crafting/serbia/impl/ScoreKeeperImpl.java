package software.crafting.serbia.impl;

import software.crafting.serbia.ScoreKeeper;

public class ScoreKeeperImpl implements ScoreKeeper {

  private final ScoreVisitor formattedScoreboard;

  private final Match ongoingMatch = new Match();

  public ScoreKeeperImpl(ScoreVisitor formattedScoreboard) {
    this.formattedScoreboard = formattedScoreboard;
  }

  @Override
  public void scoreTeamA1() {
    ongoingMatch.score(Team.HOME, 1);
    ongoingMatch.visit(formattedScoreboard);
  }

  @Override
  public void scoreTeamB1() {
    ongoingMatch.score(Team.AWAY, 1);
    ongoingMatch.visit(formattedScoreboard);
  }

  @Override
  public void scoreTeamA2() {
    ongoingMatch.score(Team.HOME, 2);
    ongoingMatch.visit(formattedScoreboard);
  }

  @Override
  public void scoreTeamB2() {
    ongoingMatch.score(Team.AWAY, 2);
    ongoingMatch.visit(formattedScoreboard);
  }

  @Override
  public void scoreTeamA3() {
    ongoingMatch.score(Team.HOME, 3);
    ongoingMatch.visit(formattedScoreboard);
  }

  @Override
  public void scoreTeamB3() {
    ongoingMatch.score(Team.AWAY, 3);
    ongoingMatch.visit(formattedScoreboard);
  }

}
