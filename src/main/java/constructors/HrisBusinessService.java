package constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HrisBusinessService {

    @Autowired
    private HrisService hrisService;

    @Autowired
    private HrisClient hrisClient;


    public void start(){
        hrisClient.checkIfItsValidInJson();
        hrisService.addHereSomeStuffToString();

        System.out.println(JsonValidator.stringBuilder);
    }
}
