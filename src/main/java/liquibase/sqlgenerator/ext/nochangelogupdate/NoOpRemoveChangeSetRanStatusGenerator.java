package liquibase.sqlgenerator.ext.nochangelogupdate;

import liquibase.database.Database;
import liquibase.sql.Sql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.RemoveChangeSetRanStatusGenerator;
import liquibase.statement.core.RemoveChangeSetRanStatusStatement;

public class NoOpRemoveChangeSetRanStatusGenerator extends RemoveChangeSetRanStatusGenerator {
    @Override
    public boolean supports(RemoveChangeSetRanStatusStatement statement, Database database) {
        return Config.getInstance().isEnabled();
    }

    @Override
    public int getPriority() {
        return 1000;
    }

    @Override
    public Sql[] generateSql(RemoveChangeSetRanStatusStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        return null;
    }
}
