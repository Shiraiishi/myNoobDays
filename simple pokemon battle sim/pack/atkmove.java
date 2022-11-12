package pack;

public class atkmove {
        //moveDB dump
      //moveName,movePower

    String[][] moveDB = {
        {"scratch","3"},//0
        {"pound","5"},//1
        {"tackle","4"},//2
        {"quick attack","2"},//3
        {"do nothing","0"},//4
    };

    int movePower(int moveID){
        return Integer.parseInt(moveDB[moveID][1]);
    }
}

