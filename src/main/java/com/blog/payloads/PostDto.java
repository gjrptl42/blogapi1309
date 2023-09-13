
package com.blog.payloads;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter

@Getter

@NoArgsConstructor
public class PostDto {

	private String title;

	private Date addedDate;

	private String imageName="default.png";
	
	private CategoryDto category;
	
	private UserDto user;
}
