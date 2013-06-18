package pt.ulht.es.cookbook.domain;


import java.util.Comparator;

import org.joda.time.DateTime;

import pt.ulht.es.cookbook.domain.Recipe;


public class Recipe extends Recipe_Base {
    
    public Recipe(String title, String problem, String solution, String author) {
    	setTitle(title);
    	setProblem(problem);
    	setSolution(solution);
    	setAuthor(author);
    	setCreationTimestamp(new DateTime());
    	setCookbookManager(CookbookManager.getInstance());
    
    }
 
	public void delete() {
		setCookbookManager(null);
		super.deleteDomainObject();
	}

	public static class RecipeComparator implements Comparator<Recipe> {

		public int compare(Recipe o1, Recipe o2) {
		return o1.getTitle().compareTo(o2.getTitle());
		}
	}



	
}
