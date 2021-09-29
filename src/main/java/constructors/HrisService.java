package constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HrisService {


    @Autowired
    private HrisValidator hrisValidator;

    @Autowired
    private JsonValidator jsonValidator;


    public void addHereSomeStuffToString( ) {
        hrisValidator.addSomeStuffToStringToo();
        jsonValidator.appendSomeStuffToJson(",appended from HrisService");
    }
}
