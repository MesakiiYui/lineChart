package com.itmuch.cloud.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private int x1; private  int y1;
	private int x2; private  int y2;
	private int x3; private  int y3;
	private int x4; private  int y4;
	private int x5; private  int y5;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	public int getX4() {
		return x4;
	}

	public void setX4(int x4) {
		this.x4 = x4;
	}

	public int getY4() {
		return y4;
	}

	public void setY4(int y4) {
		this.y4 = y4;
	}

	public int getX5() {
		return x5;
	}

	public void setX5(int x5) {
		this.x5 = x5;
	}

	public int getY5() {
		return y5;
	}

	public void setY5(int y5) {
		this.y5 = y5;
	}
	//	private String username;
//
//	private String name;
//
//	private Short age;
//
//	private BigDecimal balance;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Short getAge() {
//		return age;
//	}
//
//	public void setAge(Short age) {
//		this.age = age;
//	}
//
//	public BigDecimal getBalance() {
//		return balance;
//	}
//
//	public void setBalance(BigDecimal balance) {
//		this.balance = balance;
//	}
}
