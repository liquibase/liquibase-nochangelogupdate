package liquibase.sqlgenerator.ext.nochangelogupdate;

import liquibase.database.Database;
import liquibase.sql.Sql;
import liquibase.sqlgenerator.SqlGeneratorChain;
import liquibase.sqlgenerator.core.LockDatabaseChangeLogGenerator;
import liquibase.statement.core.LockDatabaseChangeLogStatement;

public class NoLockDatabaseChangeLogGenerator extends LockDatabaseChangeLogGenerator {
	@Override
	public boolean supports(LockDatabaseChangeLogStatement statement, Database database) {
		return Config.getInstance().isEnabled();
	}

	@Override
	public int getPriority() {
		return 1000;
	}

	@Override
	public Sql[] generateSql(LockDatabaseChangeLogStatement statement, Database database, SqlGeneratorChain sqlGeneratorChain) {
		return null;
	}
}
