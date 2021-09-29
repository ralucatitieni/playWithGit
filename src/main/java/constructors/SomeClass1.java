package constructors;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SomeClass1 {

    public boolean isDateInThePast(LocalDate localDate) {
        if (localDate.isBefore(LocalDate.now())) {
            return true;
        }
        return false;
    }
}
