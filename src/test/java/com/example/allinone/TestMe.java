package com.example.allinone;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Mithilesh
 */
@SpringBootTest
public class TestMe {
    @Test
    void smallUnitTest(){
        System.out.println("Unit test");
        Assertions.assertEquals(5, 3 + 2);
    }
    
    @Test
    void anotherSmallUnitTest(){
        System.out.println("Another test");
        Object obj = new Object();
        Assertions.assertNotNull(obj);
    }
    
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All called");
    }
    
    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each called");
    }
    
    @AfterAll
    static void afterAll(){
        System.out.println("After All called - Do cleanup");
    }
    
    @AfterEach
    void afterEach(){
        System.out.println("After Each called - Do cleanup");
    }
}
