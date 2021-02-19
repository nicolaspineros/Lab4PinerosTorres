
package hangman.model;

public class PowerScore implements GameScore{
    /*
    @pre se inicia con 0 puntos
    @pos debe retornar la puntuacion con un valor >= 0, valor maximo puntos = 500
    @pos return=(5^correctCount)-(incorrectCount*8)
    */
    public int calculateScore(int correctCount,int incorrectCount)throws Exception{
        if (correctCount < 0 | incorrectCount < 0){
            throw new Exception("Parametro negativo");
        }
        int resultado = (int)Math.pow(5,correctCount) - (incorrectCount * 8);
        resultado = (resultado<0)?0:resultado;
        resultado = (resultado>500)?500:resultado;
        return resultado;
    }
    public int reset(){return 0;}
}
