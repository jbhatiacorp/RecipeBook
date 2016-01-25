package com.recipe.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.recipe.domain.Ingrediants;
import com.recipe.domain.Method;
import com.recipe.domain.Recipe;

public class DBCreatorUtil {
	public static void main(String[] args) {
		Recipe dish = new Recipe();
		Ingrediants ingrediant = new Ingrediants();
		Method method = new Method();
		// Set Ingrediant
		ingrediant.setIngrediantDescription("test");
		ingrediant.setIngrediantImagePath(null);
		// Set Method
		method.setMethodDescription("test");
		method.setMethodImagePath(null);
		// Set Dish
		dish.setRecipeName("Dish1");
		dish.setCuisine("testCuisine");
		dish.setImage("img1");
		dish.setIngrediants(ingrediant);
		dish.setMethod(method);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(dish);
		session.getTransaction().commit();

	}
}
