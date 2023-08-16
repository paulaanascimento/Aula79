import Model.Infrastructure.RecipesRepository
import View.Presentation.recipeView

fun main() {
    val repository = RecipesRepository()
    repository.initializeRepository()
    val recipeView = recipeView()
    recipeView.receiveInput()
}