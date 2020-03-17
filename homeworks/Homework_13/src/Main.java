public class Main {
    public static void main(String[] args) {
        Player igor = new Player("Игорь", 100);
        Player oleg = new Player("Олег", 1000);
        UpgradedPlayer nadir = new UpgradedPlayer("Надир", 100);
        //UpgradedPlayer medved=new UpgradedPlayer("медведь", Double.POSITIVE_INFINITY);
        nadir.addWeapon(new Gun());
        nadir.hit(igor);
        //nadir.hit(medved);
        oleg.hit(igor);
        System.out.println(nadir.getScore());
        System.out.println(oleg.getScore());
        System.out.println(igor.getHealth());
        //System.out.println(medved.getHealth());
    }
}