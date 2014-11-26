package liquibase.sqlgenerator.ext.nochangelogupdate;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConfigTest {

    @Test
    public void isEnabled() throws Exception {
        assertTrue(Config.getInstance().isEnabled());
    }
}