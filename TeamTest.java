import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TeamTest{
  Team team;
  Guard player;
  Forward player2;

  @Before 
  public void before() {
    team = new Team("Cleveland Cavaliers");
    player = new Guard("Kyrie Irving");
    player2 = new Forward("LeBron James");
  }

  @Test
  public void hasName(){
    assertEquals("Cleveland Cavaliers", team.getName()); 
  }

  @Test
  public void onCourtStartsEmpty() {
    assertEquals(0, team.playerCount());
  }

  @Test
  public void canSubInPlayer() {
    team.subIn(player);
    assertEquals(1, team.playerCount());
  }

  @Test
  public void canSubOutPlayer() {
    team.subIn(player);
    team.subOut(player);
    assertEquals(0, team.playerCount());
  }

  @Test
  public void cannotSubInPlayerIfSpotIsOccupied() {
    team.subIn(player);
    team.subIn(player);
    assertEquals(1, team.playerCount());
  }

  @Test
  public void cannotSubOutPlayerIfNotOnCourt() {
    team.subIn(player);
    team.subOut(player2);
    assertEquals(1, team.playerCount());
  }
}