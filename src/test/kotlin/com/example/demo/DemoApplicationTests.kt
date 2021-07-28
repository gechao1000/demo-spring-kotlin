package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	lateinit var db : MessageRepository;

	@Test
	fun contextLoads() {
		var res = db.findAll()
		println(res)
		var list = res.toList()
		res.forEach {
			println("${it.id} : ${it.text}")
		}
	}

}
