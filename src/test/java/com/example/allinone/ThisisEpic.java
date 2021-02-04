/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.allinone;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Mithilesh
 */
@SpringBootTest
public class ThisisEpic {
    @Test
    public void testThatEqual(){
        System.out.println("mith is epic");
        Assertions.assertThat("mith".equals("mith"));
    }
}
