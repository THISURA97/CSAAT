package com.CSAAT.greet;
import org.junit.*;

public class GreetTests {
    @Test
    public void helloShouldReturnHelloWithName()
    {
        Greet greet = new Greet();
        Assert.assertEquals("must return hello with intern", "Hello intern", greet.hello("intern"));
    }


}
