package pack;

public class App {

    public static void main(String[] args) {

        //pokemondb dump
                                            //name level atk hp move1ID move2ID
        pokemon bulbasaur = new pokemon("bulbasaur",5,4,41,2,1);
        pokemon charmander = new pokemon("charmander",5,7,28,0,2);
        pokemon squirtle = new pokemon("squirtle",5,5,31,1,2);

        battle battle = new battle();

        //(player pokemon,npc pokemon)choose anyone from the list above
        battle.start(squirtle,charmander);
        
    }
}