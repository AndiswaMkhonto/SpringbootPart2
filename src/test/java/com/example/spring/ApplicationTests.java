package com.example.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
abstract
class ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private TestRestTemplate template;

	ResponseEntity<String> response = template.withBasicAuth(?).

	abstract getForEntity(?);


}
