
package hangman.model;


public interface GameScore {
    /*
    @param correctCount numero de respuestas correctas
    @param incorrectCount numero de respuestas incorrectas
    @throws ExcepcionParametrosInvalidos [valores negativos, magnitudes muy grandes]
    */
    int calculateScore(int correctCount,int incorrectCount) throws Exception;

    int reset();
}
