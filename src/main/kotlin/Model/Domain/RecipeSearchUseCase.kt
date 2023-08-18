package Model.Domain

interface RecipeSearchUseCase {
    fun searchRecipesWithIngredients(availableIngredients: List<String>): List<Recipes>
}