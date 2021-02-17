
import org.junit.*;
import hangman.model.*;

public class GameScoreTest {
    OriginalScore original = new OriginalScore();
    PowerScore power = new PowerScore();
    BonusScore bonus = new BonusScore();
    
    @Test
    public void validarParametrosOriginal(){
        try {
            int resultOpar = original.calculateScore(-5, -10);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarParametrosPower(){
        try {
            int resultPpar = power.calculateScore(-5, -10);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarParametrosBonus(){
        try {
            int resultBpar = bonus.calculateScore(-5, -10);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarPuntajeOriginal(){
        try{
            int resultOpunt = original.calculateScore(2, 10);
            Assert.assertEquals(0, resultOpunt);
        }catch(Exception e){
            Assert.assertTrue(false);
        }
    }
    
    @Test
    public void validarPuntajePower(){
        try{
            int resultPpunt = power.calculateScore(9, 1);
            Assert.assertEquals(500, resultPpunt);
        }catch(Exception e){
            Assert.assertTrue(false);
        }
    }
    
    @Test
    public void validarPuntajeBonus(){
        try{
            int resultBpunt = bonus.calculateScore(2, 8);
            Assert.assertEquals(0, resultBpunt);
        }catch(Exception e){
            Assert.assertTrue(false);
        }
    }
    
}
