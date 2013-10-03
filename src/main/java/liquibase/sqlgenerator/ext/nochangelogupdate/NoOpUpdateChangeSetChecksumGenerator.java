package liquibase.sqlgenerator.ext.nochangelogupdate;

import liquibase.database.Database;
import liquibase.sql.Sql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.UpdateChangeSetChecksumGenerator;
import liquibase.statement.core.UpdateChangeSetChecksumStatement;

public class NoOpUpdateChangeSetChecksumGenerator extends UpdateChangeSetChecksumGenerator {
    @Override
    public boolean supports(UpdateChangeSetChecksumStatement statement, Database database) {
        return Config.getInstance().isEnabled();
    }

    @Override
    public int getPriority() {
        return 1000;
    }

    @Override
    public Sql[] generateSql(UpdateChangeSetChecksumStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        return null;
    }
}
