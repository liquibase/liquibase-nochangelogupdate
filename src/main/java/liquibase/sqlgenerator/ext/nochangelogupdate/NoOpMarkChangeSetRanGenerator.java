package liquibase.sqlgenerator.ext.nochangelogupdate;

import liquibase.database.Database;
import liquibase.sql.Sql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.MarkChangeSetRanGenerator;
import liquibase.statement.core.MarkChangeSetRanStatement;

public class NoOpMarkChangeSetRanGenerator extends MarkChangeSetRanGenerator {
    @Override
    public boolean supports(MarkChangeSetRanStatement statement, Database database) {
        return Config.getInstance().isEnabled();
    }

    @Override
    public int getPriority() {
        return 1000;
    }

    @Override
    public Sql[] generateSql(MarkChangeSetRanStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        return null;
    }
}
