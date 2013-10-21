package sk.flyway.test;

import com.googlecode.flyway.core.Flyway;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:h2:file:target/sk.flyway.test", "sa", null);

        // Start the migration
        flyway.migrate();
        //flyway.clean();
        //flyway.repair();
    }
}
