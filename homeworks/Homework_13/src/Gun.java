
public class Gun extends Weapon{
    int damage = 10;
    int bonus = 10;


    public void bang(Player player){
        System.out.println("Бах!");
        player.setHealth(player.getHealth()-damage);
    }

    public int getBonus() {
        return bonus;
    }

//    public int getDAMAGE() {
//        return DAMAGE;
//    }
}
