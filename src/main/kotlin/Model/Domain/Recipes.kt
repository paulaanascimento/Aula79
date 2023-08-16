package Model.Domain

class Recipes(val name: String, val ingredients: List<String>, val preparation: String) {

    override fun toString(): String {
        return "Nome: $name\nIngredientes: $ingredients\nModo de Preparo:$preparation"
    }
}