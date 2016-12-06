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

    public int playerCount() {
        return onCourt.size();
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