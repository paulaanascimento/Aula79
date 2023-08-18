import Model.Domain.Recipes
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RecipesTest {
    @Test
    fun testToString() {
        val maxLineLength = 80
        val recipe = Recipes(
            "Bolo de Chocolate",
            listOf("farinha", "açúcar", "cacau em pó", "ovos", "leite"),
            "1. Misture os ingredientes secos.\n2. Adicione os ovos e o leite e misture bem.\n3. Asse em forno pré-aquecido.", Recipes.NutritionFacts(97, 8.0, 10.0, 20.0)

        )

        val receita = "1. Misture os ingredientes secos.\n2. Adicione os ovos e o leite e misture bem.\n3. Asse em forno pré-aquecido."
        val expected = "Nome: Bolo de Chocolate\nIngredientes: [farinha, açúcar, cacau em pó, ovos, leite]\n\nModo de Preparo:\n${wrapText(receita,maxLineLength)}\n\nInformações Nutricionais: \n" +
                "Calorias: 97 kcal\n" +
                "Proteínas: 8.0 g\n" +
                "Gorduras: 10.0 g\n" +
                "Carboidratos: 20.0 g\n"

        assertEquals(expected, recipe.toString())
    }
    private fun wrapText(text: String, lineLength: Int): String {
        val words = text.split(" ")
        val lines = mutableListOf<String>()
        var currentLine = StringBuilder()

        for (word in words) {
            if (currentLine.length + word.length + 1 <= lineLength) {
                if (currentLine.isNotEmpty()) {
                    currentLine.append(" ")
                }
                currentLine.append(word)
            } else {
                lines.add(currentLine.toString())
                currentLine = StringBuilder(word)
            }
        }

        lines.add(currentLine.toString())
        return lines.joinToString("\n")
    }
}