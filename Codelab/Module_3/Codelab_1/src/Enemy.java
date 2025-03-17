public class Enemy extends GameCharacter {

    Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void aoeAttack(GameCharacter target, GameCharacter impactedTarget) {
        int damage = 12;

        System.out.printf("%s attacks %s using Poisonous Area and %s impacted for %d HP.%n", this.getName(), target.getName(), impactedTarget.getName(), damage);
        target.setHealth(target.getHealth() - damage);
        System.out.printf("Current %s's health: %d%n", target.getName(), target.getHealth());
        if(target.getHealth() < damage ){
            target.setHealth(0);
            System.out.printf("%s dead.", target.getName());
        }

        impactedTarget.setHealth(impactedTarget.getHealth() - damage);
        System.out.printf("Current %s's health: %d%n", impactedTarget.getName(), impactedTarget.getHealth());;
        if(impactedTarget.getHealth() < damage ){
            impactedTarget.setHealth(0);
            System.out.printf("%s dead.", impactedTarget.getName());
        }
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = 15;

        if(target.getHealth() < damage){
            target.setHealth(0);
            System.out.printf("%s attacks %s using Snake Bite for %d HP.%n", this.getName(), target.getName(), damage);
            System.out.printf("%s dead.", target.getName());
            return;
        }

        System.out.printf("%s attacks %s using Snake Bite for %d HP.%n", this.getName(), target.getName(), damage);
        target.setHealth(target.getHealth() - damage);
        System.out.printf("Current %s's health: %d%n", target.getName(), target.getHealth());
    }
}
