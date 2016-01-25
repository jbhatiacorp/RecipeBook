package com.recipe.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Ingrediants {
	private String ingrediantDescription;
	private String ingrediantImagePath;
	
	public String getIngrediantDescription() {
		return ingrediantDescription;
	}
	public void setIngrediantDescription(String ingrediantDescription) {
		this.ingrediantDescription = ingrediantDescription;
	}
	public String getIngrediantImagePath() {
		return ingrediantImagePath;
	}
	public void setIngrediantImagePath(String ingrediantImagePath) {
		this.ingrediantImagePath = ingrediantImagePath;
	}
}
