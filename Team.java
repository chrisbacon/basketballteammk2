import java.util.*;

class Team {
    private String name;
    private ArrayList<Scoreable> onCourt;

    public Team(String name) {
        this.name = name;
        this.onCourt = new ArrayList<Scoreable>();
    }

    public String getName() {
        return this.name;
    }

    public int playerCount() {
        return onCourt.size();
    }

    public boolean canEnter(Scoreable player) {
        return ((onCourt.size() < 5) && (!onCourt.contains(player)));
    }

    public void subIn(Scoreable player) {
        if (!canEnter(player)) return;

        onCourt.add(player);
    }

    public void subOut(Scoreable player) {
        if (!onCourt.contains(player)) return;

        onCourt.remove(player);
    }

    public void score() {
        for (Scoreable player : onCourt) {
            System.out.println(player.score());
        }
    }
}