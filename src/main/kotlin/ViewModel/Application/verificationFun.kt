package ViewModel.Application

import Model.Infrastructure.RecipesRepository

class verificationFun {
    val recipe = RecipesRepository()
    fun verification(ingredient : List<String>): String{
        val listRecipe = recipe.searchRecipe(ingredient)
        return if (listRecipe.isEmpty()){
            "Nenhuma receita com esses ingredientes encontrada"
        } else{
            listRecipe.joinToString("\n")
        }

    }
}