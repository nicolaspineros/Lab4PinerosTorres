
package hangman.model;


public class BonusScore implements GameScore{
    /*
    @pre se inicia con 0 puntos
    @pos debe retornar la puntuacion con un valor >= 0 
    @pos return=(correctCount*10)-(incorrectCount*5)
    */
    public int calculateScore(int correctCount,int incorrectCount) throws Exception{
        if (correctCount < 0 | incorrectCount < 0){
            throw new Exception("Parametro negativo");
        }
        int resultado = (correctCount * 10) - (incorrectCount * 5);
        resultado = (resultado<0)?0:resultado;
        return resultado;
    }
    public int reset(){return 0;}
}
