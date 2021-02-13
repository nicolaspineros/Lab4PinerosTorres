
package hangman.model;

public class PowerScore implements GameScore{
    /*
    @pre se inicia con 0 puntos
    @pos debe retornar la puntuacion con un valor >= 0, valor maximo puntos = 500
    @pos return=(5^correctCount)-(incorrectCount*8)
    */
    public int calculateScore(int correctCount,int incorrectCount){
        return 0;
    }
}
