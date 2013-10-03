package liquibase.sqlgenerator.ext.nochangelogupdate;

public class Config {
    private static Config instance = new Config();

    public static Config getInstance() {
        return instance;
    }

    private Config() {
    }

    public boolean isEnabled() {
        return Boolean.getBoolean("liquibase.ext.nochangelogupdate.enabled");
    }
}
