package com.baeldung.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.baeldung.lss.spring.LssApp6;

@SpringBootTest(classes = LssApp6.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class Lss6IntegrationTest {

    @Test
    void whenLoadApplication_thenSuccess() {

    }
}
