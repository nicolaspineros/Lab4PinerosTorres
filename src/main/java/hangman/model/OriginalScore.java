
package hangman.model;


public class OriginalScore implements GameScore{
    /*
    @pre se inicia con 100 puntos
    @pos debe retornar la puntuacion con un valor >= 0
    @pos return=100-incorrectcount * 10
    */
    public int calculateScore(int correctCount,int incorrectCount)throws Exception{       
        if (correctCount < 0 | incorrectCount < 0){
            throw new Exception("Parametro negativo");
        }
        int resultado = 100 - incorrectCount * 10;
        resultado = (resultado<0)?0:resultado;
        return resultado;
    }
}
