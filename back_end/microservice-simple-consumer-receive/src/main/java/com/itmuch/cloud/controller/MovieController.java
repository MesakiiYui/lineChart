package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.Data;
import com.itmuch.cloud.entity.info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.itmuch.cloud.entity.User;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${user.userServicePath}")
	private String userServicePath;


	
	@GetMapping("/movie/{id}")
	private User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject(this.userServicePath+id, User.class);
	}


	@PostMapping("/data/{id}")
	private Data finDataById(@PathVariable Long id) {

		User user = restTemplate.getForObject(this.userServicePath+id, User.class);
		info info1 = new info();
		info1.setX(user.getX1());
		info1.setY(user.getY1());

		info info2 = new info();
		info2.setX(user.getX2());
		info2.setY(user.getY2());

		info info3 = new info();
		info3.setX(user.getX3());
		info3.setY(user.getY3());

		info info4 = new info();
		info4.setX(user.getX4());
		info4.setY(user.getY4());

		info info5 = new info();
		info5.setX(user.getX5());
		info5.setY(user.getY5());

		List<info> infoList=new ArrayList<info>();

		infoList.add(info1);
		infoList.add(info2);
		infoList.add(info3);
		infoList.add(info4);
		infoList.add(info5);

		Data data = new Data();
		data.setData(infoList);
		return data;

	}
}
