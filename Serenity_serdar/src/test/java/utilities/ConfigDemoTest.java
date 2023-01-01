package utilities;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class ConfigDemoTest {

    @Test
    public void test1(){
        System.out.println(ConfigReader.getProperty("serenity.project.name"));
        System.out.println(ConfigReader.getProperty("spartan.editor.username"));
        System.out.println(ConfigReader.getProperty("serenity.test.root"));
        System.out.println(ConfigReader.getProperty("spartan.editor.password"));
    }
}
