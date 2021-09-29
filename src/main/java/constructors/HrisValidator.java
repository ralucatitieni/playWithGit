package constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HrisValidator {

    @Autowired
    JsonValidator jsonValidator;

    public void addSomeStuffToStringToo() {
        jsonValidator.appendSomeStuffToJson("appending from Hris Validator");
    }


}
