package software.crafting.serbia.impl;

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


  public void visit(ScoreVisitor scoreVisitor) {
    scoreVisitor.onVisit(this.teamA, this.teamB);
  }
}
