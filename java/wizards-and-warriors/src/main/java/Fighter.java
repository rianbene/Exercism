class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damage;
        if (fighter.isVulnerable()) {
            damage = 10;
        } else {
            damage = 6;
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}


class Wizard extends Fighter {
    private boolean spellPrepared = false;

    void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return (!spellPrepared);
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damage;
        if (spellPrepared) {
            damage = 12;
        } else {
            damage = 3;
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}