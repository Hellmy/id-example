# How to run
1. Have postgres installed
2. Have payara 4 installed
3. Create user `foo`  on postgres
4. Init data-source `foo` on payara
5. Create tables and data with maven `mvn flyway:clean flyway:migrate flyway:info`
6. Start the app

# how to check the error
1. Check `http://localhost:<domain-port>/id-example/resources/person-id-overwritten`
and `http://localhost:<domain-port>/id-example/resources/person`
the id is always 0
2. Remove overwriting the id `ConcreteIdOverwrittenPerson`
3. Recheck output of `http://localhost:<domain-port>/id-example/resources/person-id-overwritten`
and `http://localhost:<domain-port>/id-example/resources/`
the id is set correctly
                     