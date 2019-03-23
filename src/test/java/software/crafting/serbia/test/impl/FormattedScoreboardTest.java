package software.crafting.serbia.test.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import software.crafting.serbia.Scoreboard;
import software.crafting.serbia.impl.FormattedScoreboard;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FormattedScoreboardTest {

  @Mock
  private Scoreboard scoreboard;

  @InjectMocks
  private FormattedScoreboard formattedScoreboard;

  @Test
  public void shouldDisplay000vs000() {
    // Given

    // When
    formattedScoreboard.onVisit(0, 0);

    // Then
    verify(scoreboard)
        .display("000:000");

  }

  @Test
  public void shouldDisplay001vs002() {
    // Given

    // When
    formattedScoreboard.onVisit(1, 2);

    // Then
    verify(scoreboard)
        .display("001:002");

  }

  @Test
  public void shouldDisplay010vs012() {
    // Given

    // When
    formattedScoreboard.onVisit(10, 12);

    // Then
    verify(scoreboard)
        .display("010:012");

  }

  @Test
  public void shouldDisplay101vs112() {
    // Given

    // When
    formattedScoreboard.onVisit(101, 112);

    // Then
    verify(scoreboard)
        .display("101:112");

  }

}
