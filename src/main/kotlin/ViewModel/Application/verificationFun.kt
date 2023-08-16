package ViewModel.Application
import Model.Infrastructure.RecipesRepository
import Model.Infrastructure.RecipesRepository.Companion.listRecipes

class verificationFun {
    val recipe = RecipesRepository()
    fun verification(ingredients : List<String>): String{
        val listRecipe = recipe.findMatchingRecipes(listRecipes,ingredients)
        return if (listRecipe.isEmpty()) {
            "Nenhuma receita com esses ingredientes encontrada"
        } else {
            listRecipe.joinToString("\n")
        }
    }
}
