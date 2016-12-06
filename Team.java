import java.util.*;

class Team {
    private String name;
    private ArrayList<Player> onCourt;

    public Team(String name) {
        this.name = name;
        this.onCourt = new ArrayList<Player>();
    }

    public String getName() {
        return this.name;
    }

    public String getPlayersOnCourt() {
        String players = new String("The following players are on court: ");

        for (Player player : onCourt) {
            if (player != null) {
                players = players + player.getName();
            }
        }

        return (players + ".");
    }

    public int playerCount() {
        int count = 0;
        for (Player player : this.onCourt) {
            if (player != null) {
                count++;
            }
        }
        return count;
    }

    public boolean canEnter(Player player) {
        return ((onCourt.size() < 5) && (!onCourt.contains(player)));
    }

    public void subIn(Player player) {
        if (!canEnter(player)) return;

        onCourt.add(player);
    }

    public void subOut(Player player) {
        if (!onCourt.contains(player)) return;

        onCourt.remove(player);
    }

}