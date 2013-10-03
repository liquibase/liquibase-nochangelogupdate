package liquibase.sqlgenerator.ext.nochangelogupdate;

import liquibase.database.Database;
import liquibase.sql.Sql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.GetNextChangeSetSequenceValueGenerator;
import liquibase.statement.core.GetNextChangeSetSequenceValueStatement;

public class NoOpGetNextChangeSetSequenceValueGenerator extends GetNextChangeSetSequenceValueGenerator {
    @Override
    public boolean supports(GetNextChangeSetSequenceValueStatement statement, Database database) {
        return Config.getInstance().isEnabled();
    }

    @Override
    public int getPriority() {
        return 1000;
    }

    @Override
    public Sql[] generateSql(GetNextChangeSetSequenceValueStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
        return null;
    }
}
