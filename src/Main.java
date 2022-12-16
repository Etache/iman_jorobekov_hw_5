public class Main {
    public static void main(String[] args) {

        Boss boss1 = new Boss();
        boss1.setBossHealth(500);
        boss1.setBossDamage(40);
        boss1.setBossDefType("Earth dome");
        System.out.println("Boss health: " + boss1.getBossHealth() + ".  Damage: " + boss1.getBossDamage() + ".  Defence type: " + boss1.getBossDefType());

        Hero[] heroes = createHeroes();
//        for (Hero heroInfoOut : heroes){
//            System.out.println();
//        }

        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Здоровье героя " + (i+1) + ": " + heroes[i].getHeroHealth() + ". Урон: " + heroes[i].getHeroDamage() + ". Суперспособность: " + heroes[i].getHeroSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(180, 20, "Necromancy");
        heroes[1] = new Hero(200, 15, "Star Platinum");
        heroes[2] = new Hero(120, 5);
        return heroes;
    }
}