package com.recipe.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Method {
	private String methodDescription;
	private String methodImagePath;
	
	public String getMethodDescription() {
		return methodDescription;
	}
	public void setMethodDescription(String methodDescription) {
		this.methodDescription = methodDescription;
	}
	public String getMethodImagePath() {
		return methodImagePath;
	}
	public void setMethodImagePath(String methodImagePath) {
		this.methodImagePath = methodImagePath;
	}
}
