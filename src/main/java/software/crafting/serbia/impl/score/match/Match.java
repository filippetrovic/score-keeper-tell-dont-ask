package software.crafting.serbia.impl.score.match;

public class Match {

  private int teamA;
  private int teamB;

  public void score(Team team, int points) {
    if (team == Team.HOME) {
      this.teamA += points;
    } else {
      this.teamB += points;
    }
  }


  public void visit(MatchVisitor matchVisitor) {
    matchVisitor.onVisit(this.teamA, this.teamB);
  }

  public interface MatchVisitor {

    void onVisit(int teamAScore, int teamBScore);

  }
}
