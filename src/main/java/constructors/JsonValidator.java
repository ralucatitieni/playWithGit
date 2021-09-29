package constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsonValidator {


    public static final StringBuilder stringBuilder = new StringBuilder();

    @Autowired
    private SomeClass1 someClass1;

    @Autowired
    private SomeClass2 someClass2;

    public void validateSomeStuff() {
        stringBuilder.append("Validation all good in Json");

    }

    public  void appendSomeStuffToJson(String string){
        stringBuilder.append(",appending  " + string);
    }



    public String getStringBuilder() {
        return stringBuilder.toString();
    }

}
