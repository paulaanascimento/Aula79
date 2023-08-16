package Model

class recipesRepository {
    val listRecipes=ArrayList<recipes>()

    fun addRecipes(newRecipes:recipes){
        listRecipes.add(newRecipes)
    }

}