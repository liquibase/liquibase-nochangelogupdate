package liquibase.sqlgenerator.ext.nochangelogupdate;

public class Config {
    private static Config instance = new Config();

    public static Config getInstance() {
        return instance;
    }

    private Config() {
    }

    public boolean isEnabled() {
        String enabledProperty = System.getProperty("liquibase.ext.nochangelogupdate.enabled");
        if (enabledProperty == null) {
            return true;
        }
        return Boolean.valueOf(enabledProperty);
    }
}
