package software.crafting.serbia.impl;

import software.crafting.serbia.ScoreKeeper;

public class ScoreKeeperImpl implements ScoreKeeper {

  private final FormattedScoreboard formattedScoreboard;

  private int teamAScore;
  private int teamBScore;

  public ScoreKeeperImpl(FormattedScoreboard formattedScoreboard) {
    this.formattedScoreboard = formattedScoreboard;
  }

  @Override
  public void scoreTeamA1() {
    teamAScores(1);
    formattedScoreboard.display(teamAScore, teamBScore);
  }

  @Override
  public void scoreTeamB1() {
    teamBScores(1);
    formattedScoreboard.display(teamAScore, teamBScore);
  }

  @Override
  public void scoreTeamA2() {
    teamAScores(2);
    formattedScoreboard.display(teamAScore, teamBScore);
  }

  @Override
  public void scoreTeamB2() {
    teamBScores(2);
    formattedScoreboard.display(teamAScore, teamBScore);
  }

  @Override
  public void scoreTeamA3() {
    teamAScores(3);
    formattedScoreboard.display(teamAScore, teamBScore);
  }

  @Override
  public void scoreTeamB3() {
    teamBScores(3);
    formattedScoreboard.display(teamAScore, teamBScore);
  }

  private void teamBScores(int points) {
    teamBScore += points;
  }

  private void teamAScores(int points) {
    teamAScore += points;
  }

}
