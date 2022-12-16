public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSuperpower;

    public Hero(int heroHealth, int heroDamage, String heroSuperpower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperpower = heroSuperpower;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return this.heroHealth;
    }

    public int getHeroDamage() {
        return this.heroDamage;
    }

    public String getHeroSuperpower() {
        return this.heroSuperpower;
    }

//    public static Hero createHeroes(){
//        Hero hero1 = new Hero(190, 20, "Necromancy");
//        Hero hero2 = new Hero(150, 15, "Stand");
//        Hero hero3 = new Hero(180, 10);
//    }

}
