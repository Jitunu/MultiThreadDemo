//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//
//
//public class TestFISTest {
//
//    @Test
//    public void testReverse() {
//        TestFIS testFIS = new TestFIS();
//        String result = testFIS.reverse("1 ++");
//        Assertions.assertEquals("(1++)", result);
//    }
//
//    @Test
//    public void testReverseWithBinaryOperator() {
//        TestFIS testFIS = new TestFIS();
//        String result = testFIS.reverse("1 2 +");
//        Assertions.assertEquals("(1+2)", result);
//    }
//
//    @Test
//    public void testReverseWithUnaryAndBinaryOperator() {
//        TestFIS testFIS = new TestFIS();
//        String result = testFIS.reverse("1 2 ++ +");
//        Assertions.assertEquals("(1+(2++))", result);
//    }
//
//    @Test
//    public void testReverseWithBinaryOperatorCombined() {
//        TestFIS testFIS = new TestFIS();
//        String result = testFIS.reverse("1 3 2 + -");
//        Assertions.assertEquals("(1-(3+2))", result);
//    }
//
//    @Test
//    public void testReverseWithCombinationOfRPN() {
//        TestFIS testFIS = new TestFIS();
//        String result = testFIS.reverse("5 ++ 1 2 + +");
//        Assertions.assertEquals("((5++)+(1+2))", result);
//    }
//
//    @Test
//    public void testReverseBlankString() {
//        TestFIS testFIS = new TestFIS();
//        String result = testFIS.reverse("");
//        Assertions.assertEquals("", result);
//    }
//
//    @Test
//    public void testReverseOnlyOperator() {
//        TestFIS testFIS = new TestFIS();
//        String result = testFIS.reverse("++");
//        Assertions.assertEquals("", result);
//    }
//}
