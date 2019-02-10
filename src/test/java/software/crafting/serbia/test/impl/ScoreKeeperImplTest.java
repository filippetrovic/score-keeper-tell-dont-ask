package software.crafting.serbia.test.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import software.crafting.serbia.Scoreboard;
import software.crafting.serbia.impl.ScoreKeeperImpl;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ScoreKeeperImplTest {

  @Mock
  private Scoreboard scoreboard;

  @InjectMocks
  private ScoreKeeperImpl scoreKeeper;

  @Test
  public void onePointForHomeTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();

    // Then
    verify(scoreboard).display("001:000");
  }

  @Test
  public void twoTimesOnePointForHomeTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();
    scoreKeeper.scoreTeamA1();

    // Then
    InOrder inOrder = inOrder(scoreboard);
    inOrder.verify(scoreboard).display("001:000");
    inOrder.verify(scoreboard).display("002:000");
  }

  @Test
  public void onePointForBothTeams() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();
    scoreKeeper.scoreTeamB1();

    // Then
    InOrder inOrder = inOrder(scoreboard);
    inOrder.verify(scoreboard).display("001:000");
    inOrder.verify(scoreboard).display("001:001");
  }

  @Test
  public void twoPointsForHomeTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamA2();

    // Then
    verify(scoreboard).display("002:000");

  }
}
