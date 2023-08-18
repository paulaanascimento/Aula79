package Model.Domain

class Recipes(val name: String, val ingredients: List<String>, val preparation: String, val nutritionFacts: NutritionFacts) {

    override fun toString(): String {
        val maxLineLength = 80
        return "Nome: $name\nIngredientes: $ingredients\n\nModo de Preparo:\n${wrapText(preparation,maxLineLength)}\n\nInformações Nutricionais: ${nutritionFacts.toString()}\n"
    }
    class NutritionFacts(
        val calories: Int,
        val proteins: Double,
        val fats: Double,
        val carbohydrates: Double
    ) {
        override fun toString(): String {
            return "\nCalorias: $calories kcal\nProteínas: $proteins g\nGorduras: $fats g\nCarboidratos: $carbohydrates g"
        }
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
