package Model
class recipes(val name: String, val ingredients: ArrayList<String>, val preparation: String) {
    fun displayRecipe() {
        println(name)
        for (i in ingredients) {
            println(i)
        }
        println(preparation)
    }
}