Liquibase Extension: No ChangeLog Table Updates
===========================

This extension suppresses all calls to update the DatabaseChangeLog table as changeSets are ran.
That means no:
* "insert into databasechangelog" calls on update
* "delete from databasechangelog" calls on rollback
* Updating of checksum information

This extension does still create and read from the DatabaseChangeLog table so if there are already changeSets marked as ran they will not be reran.

You can disable the extension logic by setting the system parameter "liquibase.ext.nochangelogupdate.enabled" to "false"

**WARNING: THIS FUNCTIONALITY IS NOT WHAT YOU NORMALLY WANT!**
_It can be helpful in certain circumstance, so use at your own risk_

To use the extension, simply add the liquibase-nochangelogupdate.jar file to your classpath.

Download the liquibase-nochangelogupdate.jar file from:
* Direct: ["release" section on github](https://github.com/liquibase/liquibase-nochangeloginsert/releases)
* Maven: Group org.liquibase.ext, Artifact liquibase-nochangeloginsert
