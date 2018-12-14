import org.junit.Test;

import static org.junit.Assert.*;

public class JenkinsGradleDemoClassTest {
    @Test
    public void op(){
        main.java.JenkinsGradleDemoClass jenkinsGradleDemoClass=new main.java.JenkinsGradleDemoClass();
        assertEquals(jenkinsGradleDemoClass.add(1,2),3);
    }
}