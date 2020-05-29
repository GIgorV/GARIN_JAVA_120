public class Medved extends Player implements Observer {

    public Medved(){
        super("Medved", 100);
    }

    public void handleEvent(Player player) {
        if (player.getHealth()<=30){
            player.hit(player);
        }
    }
}