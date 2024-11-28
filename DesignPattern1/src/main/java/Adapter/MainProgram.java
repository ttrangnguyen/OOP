package Adapter;

public class MainProgram {
    public static void main(String[] args){
        String webHost = "Host:https://...";
        WebService service = new WebService(webHost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();
    }
}

