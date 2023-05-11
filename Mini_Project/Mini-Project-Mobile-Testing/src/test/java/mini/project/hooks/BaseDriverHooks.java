package mini.project.hooks;

import minpro.driver.DriverPool;
import org.junit.After;

import java.util.Optional;

public class BaseDriverHooks {
    public DriverPool driverPool = new DriverPool();

    @After
    public void afterTest() {
        quitAndroidDrivers(driverPool);
    }

    public void quitAndroidDrivers(DriverPool drivers) {
        Optional.ofNullable(drivers.getAndroidDriver()).ifPresent(
                driver -> {
                    driver.quit();
                    drivers.setAndroidDriver(null);
                }
        );
    }
}
