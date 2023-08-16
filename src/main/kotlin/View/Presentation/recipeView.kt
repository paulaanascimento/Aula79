package View.Presentation

import ViewModel.Application.verificationFun

class recipeView {
    val verification = verificationFun()

    fun receiveInput() {
        println("Digite os ingredientes que você possui (somente letras, separados por vírgula):")
        val result = verification.verification(readln().split(",").map { it.trim() })
        println()
        println(result)
    }
}
