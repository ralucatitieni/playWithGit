import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        String credentials = "YWFhOmJiYg==";

        byte[]credeantialsBytes = Base64.getDecoder().decode(credentials);

        String sometjing = new String(credeantialsBytes);


        System.out.println(sometjing);



    }
}
