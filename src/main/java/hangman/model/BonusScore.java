
package hangman.model;


public class BonusScore implements GameScore{
    /*
    @pre se inicia con 0 puntos
    @pos debe retornar la puntuacion con un valor >= 0 
    @pos return=(correctCount*10)-(incorrectCount*5)
    */
    public int calculateScore(int correctCount,int incorrectCount){
        return 0;
    }
}
