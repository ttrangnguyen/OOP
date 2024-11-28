package Adapter;


public class WebAdapter implements WebRequester{
    private WebService service;

    public void connect(WebService currentService){
        service = currentService;
    }

    public int request(Object request){
        Json result = this.toJson(request);
        Json response = service.request(result);
        if(response != null)
            return 200; //OK status code
        return 500; //server error status code
    }

    private Json toJson(Object request) {
        return new Json(request);
    }
}
