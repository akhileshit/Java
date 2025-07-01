
//27/12/24   25,26 No classes
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot15Application { // Started the Project [Sales Savvy]

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot15Application.class, args);
	}

}


// Assignment:
//	- Completely know about BootStrap
//	- Completely know about JWT (JSON Web Tokens) with on executable program!
//	- Choose a project name for your project

// Things to have handy:
//	- Choose color pallet (atleast 4 colors for ui design which the entire front end components should have)
//	- https://coolers.co
//	- Choose and LOCK atleast 4 fonts for the project (Heading, Sub-heading, content, Description)
//	- Maintain the theme signature throughout the project



/* Ans:
 * 
 * Bootstrap: CSS and script made easy
 * 	- Use their <link and <script to make use of their design(ui) in your website
 * 	- Use class attribute defined by them in your elements and ur done
 * 	- It may also be their 12 col layout (col-sm-6 col-lg-12 ...)
 * 	- It may be the components 
 * JWT:
 * 	- They have 'header'(metadata on token), 'payload'(your claims) both in json format and 'signature' part
 * 	- They expire in minute, days or months
 * 	- They are issued by authorization services like OAuth
 * 	- signature = Crypto(secret, base64(header), base64(payload))
 * 	- Instead secret, public-private keypairs can be used, where only the issuer of the token knows the private key for refreshing the token, authorizing, reproducing, or generating new ones.
 * 	- Storing the token itself securely is the topic not yet understood (which is the later part of all these)
 * Project Name:
 * 	- VOICE
 * Color pallet: B4EDD2, A0CFD3, FAE3E3, CFA5B4, C98BB9
 * Fonts: PT-sans choosen
 */
