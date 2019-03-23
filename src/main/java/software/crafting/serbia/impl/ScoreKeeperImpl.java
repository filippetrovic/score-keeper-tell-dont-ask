package software.crafting.serbia.impl;

import software.crafting.serbia.ScoreKeeper;

public class ScoreKeeperImpl implements ScoreKeeper {

  private final FormattedScoreboard formattedScoreboard;

  private final Match ongoingMatch = new Match();

  public ScoreKeeperImpl(FormattedScoreboard formattedScoreboard) {
    this.formattedScoreboard = formattedScoreboard;
  }

  @Override
  public void scoreTeamA1() {
    ongoingMatch.scoreTeamA(1);
    formattedScoreboard.display(ongoingMatch.teamA, ongoingMatch.teamB);
  }

  @Override
  public void scoreTeamB1() {
    ongoingMatch.scoreTeamB(1);
    formattedScoreboard.display(ongoingMatch.teamA, ongoingMatch.teamB);
  }

  @Override
  public void scoreTeamA2() {
    ongoingMatch.scoreTeamA(2);
    formattedScoreboard.display(ongoingMatch.teamA, ongoingMatch.teamB);
  }

  @Override
  public void scoreTeamB2() {
    ongoingMatch.scoreTeamB(2);
    formattedScoreboard.display(ongoingMatch.teamA, ongoingMatch.teamB);
  }

  @Override
  public void scoreTeamA3() {
    ongoingMatch.scoreTeamA(3);
    formattedScoreboard.display(ongoingMatch.teamA, ongoingMatch.teamB);
  }

  @Override
  public void scoreTeamB3() {
    ongoingMatch.scoreTeamB(3);
    formattedScoreboard.display(ongoingMatch.teamA, ongoingMatch.teamB);
  }

}
