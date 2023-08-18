import Model.Domain.Recipes
import Model.Infrastructure.RecipesRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RecipesRepositoryTest {

    private lateinit var repository: RecipesRepository

    @BeforeEach
    fun setUp() {
        repository = RecipesRepository()
        repository.initializeRepository()
    }
    @Test
    fun testFindMatchingRecipes_EmptyIngredients_ReturnsEmptyList() {
        val availableIngredients = emptyList<String>()
        val matchingRecipes = repository.findMatchingRecipes(availableIngredients)
        assertEquals(emptyList<Recipes>(), matchingRecipes)
    }

    @Test
    fun testFindMatchingRecipes_ExactMatch_ReturnsMatchingRecipe() {
        val availableIngredients = listOf("macarrão", "queijo", "leite")
        val matchingRecipes = repository.findMatchingRecipes(availableIngredients)
        assertEquals(1, matchingRecipes.size)
        assertEquals("Macarrão com Queijo", matchingRecipes[0].name)
    }

    @Test
    fun testFindMatchingRecipes_NoMatch_ReturnsEmptyList() {
        val availableIngredients = listOf("banana", "alface")
        val matchingRecipes = repository.findMatchingRecipes(availableIngredients)
        assertEquals(emptyList<Recipes>(), matchingRecipes)
    }
}