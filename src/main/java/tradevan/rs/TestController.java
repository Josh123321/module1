package tradevan.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tradevan.TestComponent1;



@RestController
public class TestController {
	
	@Autowired
	private TestComponent1 moduleComponent;
	
	@GetMapping("/test")
	public void doTest() {
		moduleComponent.pong();
	}
}
