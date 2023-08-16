package ViewModel.Application

class verificationInput {
    companion object{
        fun readIntInput(input: String?): Int {
            while (true) {
                try {
                    if (input != null) {
                        return input.toInt()
                    } else {
                        throw NumberFormatException()
                    }
                } catch (e: NumberFormatException) {
                    println("Entrada inválida. Por favor, digite um número inteiro válido.")
                }
            }
        }

        fun readStringInput(input : String?): String {
            while (true) {
                if (!input.isNullOrBlank()) {
                    return input
                } else {
                    println("Entrada inválida. Por favor, digite uma string válida.")
                }
            }
        }
    }

}