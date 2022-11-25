import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ApplicationShould {

    @Test
    void work() {
        Application app = new Application();

        boolean isWorking = app.isWorking();

        assertThat(isWorking).isTrue();
    }
}
