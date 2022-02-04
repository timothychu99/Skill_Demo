import static org.junit.Assert.*;
import org.junit.*;

public class SkillTest {
    @Test
    public void testAdd() {
        assertEquals(4, Skill.add(1,1));
    }
}
