public class Enemy implements Character{

    public Enemy() {
    }

    public void kill(){
        System.out.println("Ahhhggg, you killed me, bastard!");
    }

    @Override
    public boolean isEnemy() {
        return true;
    }
}
