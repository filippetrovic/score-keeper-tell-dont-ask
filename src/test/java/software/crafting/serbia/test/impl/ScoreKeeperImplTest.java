package software.crafting.serbia.test.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import software.crafting.serbia.impl.FormattedScoreboard;
import software.crafting.serbia.impl.ScoreKeeperImpl;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ScoreKeeperImplTest {

  @Mock
  private FormattedScoreboard scoreboard;

  @InjectMocks
  private ScoreKeeperImpl scoreKeeper;

  @Test
  public void onePointForHomeTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();

    // Then
    verify(scoreboard).display(1, 0);
  }

  @Test
  public void twoTimesOnePointForHomeTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();
    scoreKeeper.scoreTeamA1();

    // Then
    InOrder inOrder = inOrder(scoreboard);
    inOrder.verify(scoreboard).display(1, 0);
    inOrder.verify(scoreboard).display(2, 0);
  }

  @Test
  public void onePointForBothTeams() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();
    scoreKeeper.scoreTeamB1();

    // Then
    InOrder inOrder = inOrder(scoreboard);
    inOrder.verify(scoreboard).display(1, 0);
    inOrder.verify(scoreboard).display(1, 1);
  }

  @Test
  public void twoPointsForHomeTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamA2();

    // Then
    verify(scoreboard).display(2, 0);

  }

  @Test
  public void twoPointsForAwayTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamB2();

    // Then
    verify(scoreboard).display(0, 2);

  }

  @Test
  public void threePointsForHomeTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamA3();

    // Then
    verify(scoreboard).display(3, 0);

  }

  @Test
  public void threePointsForAwayTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamB3();

    // Then
    verify(scoreboard).display(0, 3);

  }
}
