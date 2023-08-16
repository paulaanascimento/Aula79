import Model.Domain.Recipes
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RecipesTest {
    @Test
    fun testToString() {
        val recipe = Recipes(
            "Bolo de Chocolate",
            listOf("farinha", "açúcar", "cacau em pó", "ovos", "leite"),
            "1. Misture os ingredientes secos.\n2. Adicione os ovos e o leite e misture bem.\n3. Asse em forno pré-aquecido."
        )

        val expected = "Nome: Bolo de Chocolate\nIngredientes: [farinha, açúcar, cacau em pó, ovos, leite]\nModo de Preparo:\n1. Misture os ingredientes secos.\n2. Adicione os ovos e o leite e misture bem.\n3. Asse em forno pré-aquecido.\n"

        assertEquals(expected, recipe.toString())
    }
}