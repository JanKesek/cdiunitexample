package developercoffe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DeveloperTest {
    Developer developer;
    @Test
    void test() {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        try(SeContainer cointainer = initializer.initialize()) {
            Instance<Developer> lazyDeveloper = cointainer.select(Developer.class);
            developer = lazyDeveloper.get();
            assertNotNull(developer);
            assertEquals("coffee driven development", developer.letsGo());

        }
    }

}
