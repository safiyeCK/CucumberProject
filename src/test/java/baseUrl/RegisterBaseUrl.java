package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RegisterBaseUrl {
    public static RequestSpecification spec_1;   //Register ve contact mesaj icin parametresiz bir setup a ihtiyacim vardi o nedenle yeniden duzenledim

    public static void setupRegister(){
        spec_1 = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app/")
                .setContentType(ContentType.JSON)
                .build();
    }
}
