class Runner {
    public static void main(String[] args) {
        Team team = new Team("Cleveland Cavaliers");
        Guard player = new Guard("Kyrie Irving");
        Forward player2 = new Forward("LeBron James"); 

        team.subIn(player);
        team.subIn(player2);

        team.score();          
    }
}