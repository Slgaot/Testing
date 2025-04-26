package javaTesting;

import javaTesting.Resources.AppParameters;
import org.junit.Assert;
import org.junit.Test;

public class AppParametersTest {

    public static final String DOMAIN_EXPECTED = "127.0.0.1";

    public static final String PORT_EXPECTED = "80";

    public static final String URL_EXPECTED = "https://" + DOMAIN_EXPECTED + ":" + PORT_EXPECTED;;

    @Test
    public void domainURLCorrect() {

        Assert.assertEquals("Retorna la part FDQN", DOMAIN_EXPECTED  , AppParameters.DOMAIN);

    }

    @Test
    public void correctPort() {

        Assert.assertEquals("Retorna el port correctE", PORT_EXPECTED  , AppParameters.PORT);

    }

    @Test
    public void correctURL() {

        Assert.assertEquals("Retorna la URL correctE", URL_EXPECTED  , AppParameters.deployedURL());

    }
}
