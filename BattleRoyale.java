import java.io.PrintWriter;
import java.util.ArrayList;

public class BattleRoyale {
    public static void main(String[] args){

        SuperHero heroA = new SuperHero(new String[16]), heroB = new SuperHero(new String[16]);
        int damageA = heroA.attack(heroB);
        int damageB = heroB.attack(heroA);

        ArrayList<SuperHero> heroes;
        for(int i=0; i<heroes.size();i++){
            for(int j=0; j<heroes.size();i++){

            }
        }

        PrintWriter writer;
        try{
            writer = new PrintWriter("results.txt");
            for(int i = 0; i < 100; i++)
                writer.println("line " + i);
            writer.close();
        }
        catch (Exception ex){
            System.out.println("File write error");
        }

    }
}
