/** An Integer tester created by Flik Enterprises. */
public class Flik {
    public static boolean isSameNumber(Integer a, Integer b) {
        return a.equals(b);
    }
}

/** Auto-boxing (Integer a = (int) 127) uses cached pool between -128 and 127,
 * while Integer b = (int) 128 does NOT use cached pool.
 * let a and b be int - primitive data types,
 * or Integer a, Integer b, return a.equals(b), which is true for 128+ **/