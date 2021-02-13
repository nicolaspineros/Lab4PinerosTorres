
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
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarParametrosPower(){
        try {
            int resultPpar = power.calculateScore(-5, -10);
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarParametrosBonus(){
        try {
            int resultBpar = bonus.calculateScore(-5, -10);
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarPuntajeOriginal(){
        int resultOpunt = original.calculateScore(2, 10);
        Assert.assertEquals(0, resultOpunt);
    }
    
    @Test
    public void validarPuntajePower(){
        int resultPpunt = original.calculateScore(9, 1);
        Assert.assertEquals(500, resultPpunt);
    }
    
    @Test
    public void validarPuntajeBonus(){
        int resultBpunt = original.calculateScore(2, 8);
        Assert.assertEquals(0, resultBpunt);
    }
    
}
