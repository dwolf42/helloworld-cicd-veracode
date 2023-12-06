import de.ktc.HelloWorld;
import org.junit.jupiter.api.Assertions;

class HelloWorldTest {

    @org.junit.jupiter.api.Test
    void mainUnterTest() {
        Assertions.assertEquals("Hello, ----World!", HelloWorld.sayHello("World"));
        Assertions.assertNotEquals("Hello, Jupiter", HelloWorld.sayHello("Pluto"));
    }
}