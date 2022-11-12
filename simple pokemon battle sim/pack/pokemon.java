package pack;

public class pokemon {

    String name;
    int level;
    int atk;
    int hp;
    int move1ID;
    int move2ID;

    pokemon(String name,int level,int atk,int hp,int move1ID,int move2ID){
        this.name = name;
        this.level = level;
        this.atk = atk;
        this.hp = hp;
        this.move1ID = move1ID;
        this.move2ID = move2ID;
    }
}
