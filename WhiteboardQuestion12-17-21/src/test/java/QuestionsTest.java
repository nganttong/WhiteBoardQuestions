import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionsTest {

    @Test
    public void testSubArraySumOne() {
        //given
        Questions testQuestion = new Questions();
        int expected = 68;
        int[] testArray = {1,3,5,4};
        //when
        int actual = testQuestion.sumOfSubarrays(testArray);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubArraySumTwo() {
        //given
        Questions testQuestion = new Questions();
        int expected = 50;
        int[] testArray = {1,2,3,4};
        //when
        int actual = testQuestion.sumOfSubarrays(testArray);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubArraySumThree() {
        //given
        Questions testQuestion = new Questions();
        int expected = 98;
        int[] testArray = {1,6,5,7};
        //when
        int actual = testQuestion.sumOfSubarrays(testArray);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubArraySumFour() {
        //given
        Questions testQuestion = new Questions();
        int expected = 116;
        int[] testArray = {5,2,8,9};
        //when
        int actual = testQuestion.sumOfSubarrays(testArray);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubArraySumFive() {
        //given
        Questions testQuestion = new Questions();
        int expected = 20;
        int[] testArray = {1,2,3};
        //when
        int actual = testQuestion.sumOfSubarrays(testArray);
        //then
        Assert.assertEquals(expected, actual);
    }

}