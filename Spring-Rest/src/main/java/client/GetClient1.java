package client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class GetClient1 {
	public static void main(String[] args){
		RestTemplate template = new RestTemplate();
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080").path("greet/tiger");
		ResponseEntity<String> responseEntity = template.postForEntity(uriBuilder.build().toUri(),null, String.class);
		System.out.println(responseEntity.getBody());
	}

}
