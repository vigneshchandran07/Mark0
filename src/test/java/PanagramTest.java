import org.junit.Assert;
import org.junit.Test;

public class PanagramTest {


    @Test
    public void isPanagram() {
        Panagram panagram = new Panagram();
        Assert.assertTrue(panagram.isPanagram("We promptly judged antique ivory buckles for the next prize"));
        Assert.assertFalse(panagram.isPanagram("We promptly judged antique ivory buckles for the prize"));
    }
}