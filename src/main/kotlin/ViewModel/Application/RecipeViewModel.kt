package ViewModel.Application
import Model.Domain.RecipeSearchUseCase

class RecipeViewModel(private val recipeSearchUseCase: RecipeSearchUseCase) {
    fun verificationRecipe(ingredients : List<String>): String{
        val listRecipe = recipeSearchUseCase.searchRecipesWithIngredients(ingredients)

        return if (listRecipe.isEmpty()) {
            "Nenhuma receita com esses ingredientes encontrada"
        } else {
            listRecipe.joinToString("\n")
        }
    }
}
