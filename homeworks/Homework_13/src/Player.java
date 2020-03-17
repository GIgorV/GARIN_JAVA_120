public class Player {
    private static final int DEFAULT_HIT_SCORE_VALUE = 1;
    private static final int INITIAL_SCORE_VALUE = 0;

    private String name;
    private int score;
    private double health;

    public Player (String name, double health){
        this.name = name;
        this.health=health;
        this.score = INITIAL_SCORE_VALUE;
    }

    public void hit(Player player){
        System.out.println("Бью рукой!");
        this.score += DEFAULT_HIT_SCORE_VALUE;
        player.setHealth(player.getHealth()-DEFAULT_HIT_SCORE_VALUE);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
