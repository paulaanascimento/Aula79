package ViewModel.Application
import Model.Infrastructure.RecipesRepository
import Model.Infrastructure.RecipesRepository.Companion.listRecipes

class RecipeViewModel {
    var recipe = RecipesRepository()
    fun verificationRecipe(ingredients : List<String>): String{
        val listRecipe = recipe.findMatchingRecipes(listRecipes,ingredients)
        return if (listRecipe.isEmpty()) {
            "Nenhuma receita com esses ingredientes encontrada"
        } else {
            listRecipe.joinToString("\n")
        }
    }
}
