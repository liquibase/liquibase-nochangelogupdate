package liquibase.sqlgenerator.ext.nochangelogupdate;

import liquibase.database.Database;
import liquibase.sql.Sql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.UnlockDatabaseChangeLogGenerator;
import liquibase.statement.core.UnlockDatabaseChangeLogStatement;

public class NoUnlockDatabaseChangeLogGenerator extends UnlockDatabaseChangeLogGenerator {
	@Override
	public Sql[] generateSql(UnlockDatabaseChangeLogStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
		return null;
	}

	@Override
	public int getPriority() {
		return 1000;
	}

	@Override
	public boolean supports(UnlockDatabaseChangeLogStatement statement, Database database) {
		return Config.getInstance().isEnabled();
	}
}
