import Model.Infrastructure.RecipesRepository
import View.Presentation.RecipeView

fun main() {

    val repository = RecipesRepository()
    repository.initializeRepository()
    val recipeView = RecipeView()

    println("Bem-vindo ao RecipeRadar!")

    while (true) {
        recipeView.receiveInput()

        var entrada: String
        do {
            println()
            println("Deseja ver outra receita? (S-sim ou N-não)")
            entrada = readln()
        } while (!entrada.equals("S", ignoreCase = true) && !entrada.equals("N", ignoreCase = true))

        if (entrada.equals("N", ignoreCase = true)) {
            break
        }

        println()
    }

    println("Obrigado por usar o RecipeRadar!")
}