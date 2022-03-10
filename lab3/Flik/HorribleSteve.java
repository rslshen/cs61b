import static org.junit.Assert.*;

public class HorribleSteve {

    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; i < 500; ++i, ++j) {
            assertTrue("Number " + i + " is NOT equal to " + j , Flik.isSameNumber(i, j));
        }
    }
}
