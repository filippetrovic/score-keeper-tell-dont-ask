package software.crafting.serbia.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import software.crafting.serbia.ScoreKeeper;
import software.crafting.serbia.Scoreboard;
import software.crafting.serbia.impl.FormattedScoreboard;
import software.crafting.serbia.impl.ScoreKeeperImpl;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ScoreKeeperAcceptanceTest {

  @Mock
  private Scoreboard scoreboard;

  private ScoreKeeper scoreKeeper;

  @Before
  public void setUp() {
    scoreKeeper = new ScoreKeeperImpl(new FormattedScoreboard(scoreboard));
  }

  @Test
  public void shouldDisplay001vs000WhenHomeTeamScoresAPoint() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();

    // Then
    verify(scoreboard).display("001:000");
  }

  @Test
  public void shouldDisplay002vs003WhenHomeTeamScoresAPoint() {
    // Given

    // When
    scoreKeeper.scoreTeamB1();
    scoreKeeper.scoreTeamA2();
    scoreKeeper.scoreTeamB2();

    // Then
    verify(scoreboard).display("002:003");
  }

}
