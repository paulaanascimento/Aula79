import Model.Infrastructure.RecipesRepository
import View.Presentation.recipeView

fun main() {
    val repository = RecipesRepository()
    repository.initializeRepository()
    val recipe = recipeView()
    recipe.reciveInput()
}