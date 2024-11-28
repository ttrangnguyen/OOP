package Adapter;

public class WebClient {
    private WebRequester webRequester;
    public WebClient(WebRequester webRequester){
        this.webRequester = webRequester;
    }
    private Object makeObject(){
        return new Object();
    }

    public void doWork(){
        Object object = makeObject();
        int status = webRequester.request(object);
        if(status == 200){
            System.out.println("OK");
        }else {
            System.out.println("Error");
        }
    }
}
