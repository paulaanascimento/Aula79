import Model.Domain.RecipeSearchUseCaseImpl
import Model.Infrastructure.RecipesRepository
import View.Presentation.RecipeView
import ViewModel.Application.RecipeViewModel

fun main() {

    val repository = RecipesRepository()
    repository.initializeRepository()

    val recipeSearchUseCase = RecipeSearchUseCaseImpl(repository)
    val recipeView = RecipeView(RecipeViewModel(recipeSearchUseCase))

    println("\n=====Bem-vindo ao RecipeRadar!=====\n")

    while (true) {
        recipeView.receiveInput()

        var entrada: String
        do {
            println("\nDeseja ver outra receita? (S-sim ou N-não)")
            entrada = readln()
        } while (!entrada.equals("S", ignoreCase = true) && !entrada.equals("N", ignoreCase = true))

        if (entrada.equals("N", ignoreCase = true)) {
            break
        }
    }

    println("Obrigado por usar o RecipeRadar!")
}
