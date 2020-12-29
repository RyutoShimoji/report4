package jp.ac.uryukyu.ie.e205755;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkill() {
        int defaultWarriorAttack = 100;
        int wantattackWithWeponSkill= (int)(defaultWarriorAttack * 1.5);
        Warrior demoWarrior = new Warrior("デモ勇者", 10, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 500, 100);

        for (int i=0; i<3; i++){
            int beforeAttackEnemyHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterAttackEnemyHp = slime.getHitPoint();
            assertEquals(wantattackWithWeponSkill, beforeAttackEnemyHp - afterAttackEnemyHp);
        }
    }
}