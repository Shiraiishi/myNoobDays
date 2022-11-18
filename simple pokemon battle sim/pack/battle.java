package pack;

import java.util.Scanner;
import java.util.Random;   

public class battle {

    Scanner scan = new Scanner(System.in);
    Random random = new Random();   

    atkmove atkmove = new atkmove();

    String name1,   name2;
    int level1,     level2;
    int atk1,       atk2;
    int hp1,        hp2;
    int move1ID1,   move1ID2;
    int move2ID1,   move2ID2;  

    void start(pokemon pkmn1,pokemon pkmn2){
        System.out.println("pkmnTrainer Archie sent out "+ pkmn2.name);
        System.out.println("Go! "+pkmn1.name);

        pkmnData(pkmn1,pkmn2);
    }

    void pkmnData(pokemon pkmn1,pokemon pkmn2){
        name1 = pkmn1.name;         name2 = pkmn2.name;
        atk1 = pkmn1.atk;           atk2 = pkmn2.atk;
        level1 = pkmn1.level;       level2 = pkmn2.level;
        hp1 = pkmn1.hp;             hp2 = pkmn2.hp;
        move1ID1 = pkmn1.move1ID;   move1ID2 = pkmn2.move1ID;
        move2ID1 = pkmn1.move2ID;   move2ID2 = pkmn2.move2ID;

        battleComputation();
    }

    void battleComputation(){

        while (hp1>0&&hp2>0){

            System.out.println("\t\t\t"+name2+" hp: "+hp2);
            System.out.println(name1+" hp: "+hp1);

            int movePlayer = playerTurn();
            int moveOpponent = opponentTurn();

            if (hp1>0){
                System.out.println(name1 +" use "+atkmove.moveDB[movePlayer][0]+"!");
                hp2 -= Math.floor(atkmove.movePower(movePlayer)*atk1);
            }

            if (hp2>0){
                System.out.println(name2 +" used "+atkmove.moveDB[moveOpponent][0]);
                hp1 -= Math.floor(atkmove.movePower(moveOpponent)*atk2);
            }
        }
        
        battleConclusion();
    }

    void battleConclusion(){
        if (hp1>hp2){
            System.out.println(name2+ " fainted!");
            System.out.println(name1+ " won the battle");
        }
        else{
            System.out.println(name1+ " fainted!");
            System.out.println(name2+ " won the battle");
        }
    }

    int playerTurn(){

        System.out.println("======================");
        System.out.println("1."+ atkmove.moveDB[move1ID1][0]+"\t2. "+atkmove.moveDB[move2ID1][0]+"\n3. -\t4. -");
        System.out.println("======================");

        while (true){

            System.out.print("input: ");
            int input = scan.nextInt();

            if (input==1){
                return move1ID1;
            }
            if (input==2){
                return move2ID1;
            }

            System.out.println(name1+" did not understand your command...");
        }
    }

    int opponentTurn(){
        int input = random.nextInt(1);
  
        if (input==0){
            return move1ID2;
        }
        if (input==1){
            return move2ID2;
        }
        return 0;
    }


}
