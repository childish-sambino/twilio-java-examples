import com.twilio.rest.api.v2010.account.IncomingPhoneNumber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTester {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiTester.class);

    public static void main(final String[] args) {
        IncomingPhoneNumber.reader().read().forEach(number -> LOGGER.info(number.getSid()));
    }
}
