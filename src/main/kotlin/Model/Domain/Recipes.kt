package Model.Domain
class Recipes(val name: String, val ingredients: List<String>, val preparation: String) {
    fun displayRecipe() {
        println(name)
        for (i in ingredients) {
            println(i)
        }
        println(preparation)
    }
}