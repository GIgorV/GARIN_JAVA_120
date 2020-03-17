public class Crossbow extends Weapon{ //арбалет
     int damage = 5;
     int bonus = 5;


    public void bang(Player player){
        System.out.println("Лови стрелу!");
        player.setHealth(player.getHealth()-damage);
    }

    public int getBonus() {
        return bonus;
    }
}
