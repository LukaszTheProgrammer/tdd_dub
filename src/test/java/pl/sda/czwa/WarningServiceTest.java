package pl.sda.czwa;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import org.junit.Test;



public class WarningServiceTest {

    @Test
    public void test() {
        WindService windService = mock(WindService.class);
        EmailService emailService = mock(EmailService.class);
        WarningService ws = new WarningService(windService, emailService);
        when(windService.getMessage()).thenReturn(WeatherMessages.TORNADO);

        ws.checkForWarnings();

        verify(emailService, times(1))
            .sendMessage("Warning");
    }
}
