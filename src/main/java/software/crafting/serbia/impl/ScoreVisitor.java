package software.crafting.serbia.impl;

public interface ScoreVisitor {

  void onVisit(int teamA, int teamB);
}
