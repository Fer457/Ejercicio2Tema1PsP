import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> listaCharacters = new ArrayList<Object>();

        for (int i = 0; i <= 10; i++) {
            if (i > 5){
                listaCharacters.add(new Friend());
            } else {
                listaCharacters.add(new Enemy());
            }
        }

        Collections.shuffle(listaCharacters);

        for (Object obj : listaCharacters) {
            if (obj.getClass() == Friend.class) {
                Friend friend = (Friend) obj;
                System.out.println("Friend :-)");
            }
            if (obj.getClass() == Enemy.class) {
                Enemy enemy = (Enemy) obj;
                System.out.println("Enemy! kill it!");
                enemy.kill();
            }
        }

    }
}