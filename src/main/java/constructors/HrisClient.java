package constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HrisClient {

    @Autowired
   private JsonValidator jsonValidator;


    public void checkIfItsValidInJson(){
        jsonValidator.validateSomeStuff();
    }
}
