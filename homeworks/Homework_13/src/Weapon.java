public abstract class Weapon {
    private int damage; //повреждение для врага
    private int bonus; //бонус в случае нанесения ущерба врагу
    private UpgradedPlayer owner; //владелец оружия

    public int getBonus() { //бонус при уроне врага
        return bonus;
    }

    public int getDamage() {
        return damage;
    }

    public UpgradedPlayer getOwner() { //получим владельца оружия
        return owner;
    }

    public void setOwner(UpgradedPlayer owner) { //назначим владельца оружия
        this.owner = owner;
    }

    public void bang(Player player){
        return;
    }

}
