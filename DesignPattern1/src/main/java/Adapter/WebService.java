package Adapter;


public class WebService {
    public WebService(String webHost){}



    public Json request(Json result) {
        System.out.println("handling request");
        return new Json();
    }
}
