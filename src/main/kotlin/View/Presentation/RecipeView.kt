package View.Presentation

import ViewModel.Application.RecipeViewModel

class RecipeView {
    val verification = RecipeViewModel()

    fun receiveInput() {
        println("Digite os ingredientes que você possui (somente letras, separados por vírgula):")
        val result = verification.verificationRecipe(readln().split(",").map { it.trim() })
        println()
        println(result)
    }
}
