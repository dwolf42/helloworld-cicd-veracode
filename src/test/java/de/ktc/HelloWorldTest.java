package de.ktc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void mainUnterTest() {
        Assertions.assertEquals("Hello, ----World!", HelloWorld.sayHello("World"));
        Assertions.assertNotEquals("Hello, Jupiter", HelloWorld.sayHello("Pluto"));
    }
}