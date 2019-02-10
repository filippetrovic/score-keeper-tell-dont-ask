package software.crafting.serbia.test;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import software.crafting.serbia.ScoreKeeper;
import software.crafting.serbia.Scoreboard;
import software.crafting.serbia.impl.ScoreKeeperImpl;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ScoreKeeperAcceptanceTest {

  @Mock
  private Scoreboard scoreboard;

  private ScoreKeeper scoreKeeper = new ScoreKeeperImpl(scoreboard);

  @Test
  @Ignore("In progress")
  public void shouldDisplay001vs000WhenHomeTeamScoresAPoint() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();

    // Then
    verify(scoreboard).display("001:000");
  }

}
