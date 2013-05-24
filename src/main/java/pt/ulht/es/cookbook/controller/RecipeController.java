package pt.ulht.es.cookbook.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pt.ist.fenixframework.pstm.AbstractDomainObject;
import pt.ulht.es.cookbook.domain.CookbookManager;
import pt.ulht.es.cookbook.domain.Recipe;



@Controller
public class RecipeController {

	@RequestMapping(method = RequestMethod.GET, value="/recipes")
    public String listRecipes(Model model) {
	List<Recipe> recipeSortedList = new ArrayList<Recipe>(CookbookManager.getInstance().getRecipeSet());
	Collections.sort(recipeSortedList, new Recipe.RecipeComparator());
    model.addAttribute("recipes", recipeSortedList);
    return "listRecipes";
    }

	@RequestMapping(method = RequestMethod.GET, value = "/recipes/create")
	public String showRecipeCreationForm() {
		return "createRecipe";
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/recipes")
	public String createRecipe(@RequestParam Map<String, String> params) {
		String title = params.get("title");
		String problem = params.get("problem");
		String solution = params.get("solution");
		String author = params.get("author");

		Recipe recipe = new Recipe(title, problem, solution, author);
		return "redirect:/recipes/" + recipe.getExternalId();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/recipes/{id}/delete")
	public String deleteRecipe(@PathVariable("id") String id) {
		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		recipe.delete();
		CookbookManager.getInstance().removeRecipe(recipe);
		return "redirect:/recipes/";
	}
	

	@RequestMapping(method = RequestMethod.GET, value = "/recipes/{id}")
	public String showRecipe(Model model, @PathVariable String id) {
		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		if (recipe == null) {
			return "recipeNotFound";
		} else {
			model.addAttribute("recipe", recipe);
			return "detailedRecipe";
		}
	}

}