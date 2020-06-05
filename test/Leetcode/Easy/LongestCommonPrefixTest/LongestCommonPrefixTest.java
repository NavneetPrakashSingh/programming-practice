package Leetcode.Easy.LongestCommonPrefixTest;

import Leetcode.Easy.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix lcp;
    @Before
    public void setup(){
        lcp = new LongestCommonPrefix();
    }

    @Test
    public void firstTestCase(){
        String[] strs = {"flower","fly","flight"};
        Assert.assertEquals(lcp.longestCommonPrefix((strs)),"fl");
    }

    @Test
    public void secondTestCase(){
        String[] strs = {"dog","hot","bot"};
        Assert.assertEquals(lcp.longestCommonPrefix((strs)),"");
    }
}
