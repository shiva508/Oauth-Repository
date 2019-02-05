package com.devglan.config;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class TYest {
public static void main(String[] args) {
	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	System.out.println(passwordEncoder.encode("shiva"));
	System.out.println(System.getProperty("user.name"));
	
	
	System.out.println(System.getenv("USERNAME"));
	System.out.println(System.getProperty("os.name"));
}
}
