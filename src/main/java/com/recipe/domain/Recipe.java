package com.recipe.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RECIPES")
public class Recipe {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int recipeId;
	private String recipeName;
	@Embedded
	private Ingrediants ingrediants;
	@Embedded
	private Method method;
	private String image;
	private String cuisine;
	
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String RecipeName) {
		this.recipeName = RecipeName;
	}
	public Ingrediants getIngrediants() {
		return ingrediants;
	}
	public void setIngrediants(Ingrediants ingrediants) {
		this.ingrediants = ingrediants;
	}
	public Method getMethod() {
		return method;
	}
	public void setMethod(Method method) {
		this.method = method;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
}
