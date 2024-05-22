public class Champion {
    private String name;
    private int life;
    private int atack;
    private int armor;

    public Champion() {
    }

    public Champion(String name, int life, int atack, int armor) {
        this.name = name;
        this.life = life;
        this.atack = atack;
        this.armor = armor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getAtack() {
        return atack;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void takeDamage(Champion other) {
        int damageEnemy = other.atack - this.armor;
        this.life = this.life - damageEnemy;
    }

    public String status() {
        return "Champion" +
                "\nname: " + name  +
                "\nlife: " + life;
    }
}