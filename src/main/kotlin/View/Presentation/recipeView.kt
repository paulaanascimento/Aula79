package View.Presentation

import ViewModel.Application.verificationFun
import ViewModel.Application.verificationInput.Companion.readStringInput

class recipeView {
    val verification = verificationFun()
    fun reciveInput(){
        println("Digite os ingredientes que você possui (separados por vírgula):")
        println(verification.verification(readStringInput(readln()).split(",").map { it.trim() }))
    }
}