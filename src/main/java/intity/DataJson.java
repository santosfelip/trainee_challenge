package intity;

import org.springframework.web.client.RestTemplate;

public class DataJson {

    RestTemplate restTemplate = new RestTemplate();
    public DataJson()
    {

    }

    public final String getPostsAsObject() {
        String url = "http://dummy.restapiexample.com/api/v1/employees";

        return restTemplate.getForObject(url, String.class);
    }
}
