package View.Presentation

import ViewModel.Application.RecipeViewModel

class RecipeView(private val recipeViewModel: RecipeViewModel) {

    fun receiveInput() {
        println("\nDigite os ingredientes que você possui (somente letras, separados por vírgula):")
        val result = recipeViewModel.verificationRecipe(readln().split(",").map { it.trim() })
        println("\n$result")
    }
}
