import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    // methode
    @Test
    public void duplicateTest(){
        // GIVEN
        int inputVal = 2;

        // WHEN
        int actual = Main.duplicate(inputVal);

        // THEN
        assertEquals(4, actual);
       // für boolean
        // assertTrue();
    }

}
