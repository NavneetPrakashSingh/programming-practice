package Leetcode.Medium.SumRootToLeafNumbersTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumRootToLeafNumbersTest {
    SumRootToLeafNumbers main;
    TreeNode firstExample;
    TreeNode secondExample;
    @Before
    public void setup(){
        firstExample = new TreeNode(1);
        firstExample.left = new TreeNode(2);
        firstExample.right = new TreeNode(3);

        secondExample = new TreeNode(4);
        secondExample.left = new TreeNode(9);
        secondExample.right = new TreeNode(0);
        secondExample.left.left = new TreeNode(5);
        secondExample.left.right = new TreeNode(1);

        main = new SumRootToLeafNumbers();
    }

    @Test
    public void firstTestCase(){
        Assert.assertEquals(main.sumNumbers(firstExample),25);
    }

    @Test
    public void secondTestCase(){
        Assert.assertEquals(main.sumNumbers(secondExample),1026);
    }
}
