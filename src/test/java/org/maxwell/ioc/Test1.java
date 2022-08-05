package org.maxwell.ioc;

import org.junit.Test;

import java.util.*;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/8/3 23:18
 */
public class Test1 {

    @Test
    public void test01(){
        List<Integer> list = Arrays.asList(1,1,2,2,3,4,4,5);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }

}
