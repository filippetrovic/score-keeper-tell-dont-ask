package software.crafting.serbia.impl.score;

import software.crafting.serbia.ScoreKeeper;
import software.crafting.serbia.impl.score.match.Match;
import software.crafting.serbia.impl.score.match.Match.MatchVisitor;
import software.crafting.serbia.impl.score.match.Team;

public class ScoreKeeperImpl implements ScoreKeeper {

  private final ScoreListenerMatchVisitor matchVisitor;
  private final Match ongoingMatch = new Match();

  public ScoreKeeperImpl(ScoreListener scoreListener) {
    this.matchVisitor = new ScoreListenerMatchVisitor(scoreListener);
  }

  @Override
  public void scoreTeamA1() {
    ongoingMatch.score(Team.HOME, 1);
    ongoingMatch.visit(matchVisitor);
  }

  @Override
  public void scoreTeamB1() {
    ongoingMatch.score(Team.AWAY, 1);
    ongoingMatch.visit(matchVisitor);
  }

  @Override
  public void scoreTeamA2() {
    ongoingMatch.score(Team.HOME, 2);
    ongoingMatch.visit(matchVisitor);
  }

  @Override
  public void scoreTeamB2() {
    ongoingMatch.score(Team.AWAY, 2);
    ongoingMatch.visit(matchVisitor);
  }

  @Override
  public void scoreTeamA3() {
    ongoingMatch.score(Team.HOME, 3);
    ongoingMatch.visit(matchVisitor);
  }

  @Override
  public void scoreTeamB3() {
    ongoingMatch.score(Team.AWAY, 3);
    ongoingMatch.visit(matchVisitor);
  }

  private static class ScoreListenerMatchVisitor implements MatchVisitor {

    private final ScoreListener scoreListener;

    public ScoreListenerMatchVisitor(ScoreListener scoreListener) {
      this.scoreListener = scoreListener;
    }

    @Override
    public void onVisit(int teamAScore, int teamBScore) {
      this.scoreListener.onScoreChanged(teamAScore, teamBScore);
    }
  }

}
