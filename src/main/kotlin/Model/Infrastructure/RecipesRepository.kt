package Model.Infrastructure

import Model.Domain.Recipes
import java.text.Normalizer

class RecipesRepository {

    private val listRecipes = ArrayList<Recipes>()

    fun initializeRepository() {
        listRecipes.add(
            Recipes(
                "Macarrão com Queijo",
                listOf("macarrão", "queijo", "leite"),
                "1. Cozinhe o macarrão.\n2. Misture o queijo e o leite.\n3. Misture com o macarrão cozido.",
                Recipes.NutritionFacts(400, 15.0, 20.0, 45.0)

            )
        )

        listRecipes.add(
            Recipes(
                "Salada de Frango",
                listOf("frango", "alface", "tomate"),
                "1. Cozinhe o frango.\n2. Corte a alface e o tomate.\n3. Misture todos os ingredientes.",
                Recipes.NutritionFacts(335, 44.0, 17.0, 12.0)
            )
        )

        listRecipes.add(
            Recipes(
                "Sanduíche de Atum",
                listOf("atum", "pão", "maionese"),
                "1. Misture o atum e a maionese.\n2. Coloque a mistura entre duas fatias de pão.",
                Recipes.NutritionFacts(200, 10.0, 19.0, 45.0)
            )
        )

        listRecipes.add(
            Recipes(
                "Pudim de Chocolate de Caneca",
                listOf("açúcar", "cacau em pó", "leite"),
                "Em uma caneca, misture o açúcar com a água e leve ao micro-ondas por cerca de 1 minuto " +
                        "ou até caramelizar. Em seguida, adicione o cacau em pó e o leite à caneca. Misture bem e " +
                        "leve ao micro-ondas por mais 1-2 minutos, até o pudim firmar.",
                Recipes.NutritionFacts(230, 7.0, 20.0, 30.0)

            )
        )

        listRecipes.add(
            Recipes(
                "Bananinha Caseira",
                listOf("banana", "açúcar"),
                "Corte as bananas em rodelas finas. Em uma panela, misture as rodelas de banana com açúcar e, " +
                        "se quiser, um pouco de suco de limão. Cozinhe em fogo baixo, mexendo ocasionalmente, " +
                        "até que as bananas fiquem macias e caramelizadas. Deixe esfriar antes de servir.",
                Recipes.NutritionFacts(97, 8.0, 10.0, 20.0)

            )
        )
    }

    fun findMatchingRecipes(availableIngredients: List<String>): List<Recipes> {
        return listRecipes.filter { recipe ->
            recipe.ingredients.all { ingredient ->
                val normalizedIngredient = removeAccents(ingredient.toLowerCase())
                availableIngredients.any { availableIngredient ->
                    val normalizedAvailableIngredient = removeAccents(availableIngredient.toLowerCase())
                    normalizedIngredient in normalizedAvailableIngredient
                }
            }
        }
    }
    fun removeAccents(input: String): String {
        val normalized = Normalizer.normalize(input, Normalizer.Form.NFD)
        val pattern = "\\p{InCombiningDiacriticalMarks}+".toRegex()
        return pattern.replace(normalized, "")
    }

}
