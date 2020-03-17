public class Ax extends Weapon{
    int damage = 15;
    int bonus = 15;


    public void bang(Player player){
        System.out.println("Ух!");
        player.setHealth(player.getHealth()-damage);
    }

    public int getBonus() {
        return bonus;
    }
}
