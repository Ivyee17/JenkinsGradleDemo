package main.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class JenkinsGradleDemoClassTest {
    @Test
    public void op(){
        JenkinsGradleDemoClass jenkinsGradleDemoClass=new JenkinsGradleDemoClass();
        assertEquals(jenkinsGradleDemoClass.add(1,2),3);
    }
}