package software.crafting.serbia.test.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import software.crafting.serbia.Scoreboard;
import software.crafting.serbia.impl.ScoreKeeperImpl;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ScoreKeeperImplTest {

  @Mock
  private Scoreboard scoreboard;

  @InjectMocks
  private ScoreKeeperImpl scoreKeeper;

  @Test
  public void printScoreAfterAddingOnePointForHomeTeam() {
    // Given

    // When
    scoreKeeper.scoreTeamA1();

    // Then
    verify(scoreboard).display("001:000");

  }

}
