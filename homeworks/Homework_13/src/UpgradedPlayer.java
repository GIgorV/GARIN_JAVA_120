public class UpgradedPlayer extends Player {
    private static final int INITIAL_BULLETS_AMOUNT = 10;
    private static final int MAX_WEAPON_COUNT = 5;
    private Weapon weapons[];
    private Weapon currentWeapon;
    //private int bulletsAmount;
    private int weaponCount;

    public UpgradedPlayer(String name, double health) {
        super(name, health);
        weapons = new Weapon[MAX_WEAPON_COUNT];
        weaponCount = 0;
    }

    public void addWeapon(Weapon weapon) {
        if (weaponCount < MAX_WEAPON_COUNT) {
            weapons[weaponCount] = weapon;
            weapon.setOwner(this);
            currentWeapon = weapons[weaponCount];
            weaponCount++;
        }
    }

    public void hit(Player player) {
        currentWeapon.bang(player);
        //this.bulletsAmount--;
        this.setScore(this.getScore() + currentWeapon.getBonus());
        //player.setHealth(player.getHealth()-gun.getDAMAGE());
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

//    public void chooseWeapon(Player player) {
//        for (int i = 0; i < weaponCount; i++) {
//            if (weapons[i].getCarNumber() == carNumber) {
//                this.currentWeapon = weapons[i];
//                return;
//            }
//        }
//    }
}
//    public void setBulletsAmount(int bulletsAmount) {
//        this.bulletsAmount = bulletsAmount;
//    }
//
//    public int getBulletsAmount() {
//        return bulletsAmount;
//    }

