public class Main {
    public static void main(String[] args) {
        GameCharacter general = new GameCharacter("General Character", 100);
        Hero hero = new Hero("Superman", 150);
        Enemy enemy = new Enemy("Viper", 200);

        System.out.println("Initial Status:");
        System.out.println(hero.getName() + "'s health: " + hero.getHealth());
        System.out.println(enemy.getName() + "'s health: " + enemy.getHealth());

        hero.Camouflage("Brimstone");
        hero.attack(enemy);
        hero.attack(enemy);
        enemy.attack(hero);
        enemy.aoeAttack(hero, general);
    }
}