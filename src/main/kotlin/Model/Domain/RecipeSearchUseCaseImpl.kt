package Model.Domain

import Model.Infrastructure.RecipesRepository

class RecipeSearchUseCaseImpl(private val recipesRepository: RecipesRepository) : RecipeSearchUseCase {
    override fun searchRecipesWithIngredients(availableIngredients: List<String>): List<Recipes> {
        return recipesRepository.findMatchingRecipes(availableIngredients)
    }
}