package com.javatechie.spring.mongo.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
@Id
private Long id;
private String name;
private Integer age;

public User(Long id, String name, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}

}
