package blue.pink.myrecipeapp

sealed class Screen(val route: String) {
    object RecipeScreen:Screen("recipescreen")
    object DetailScreen:Screen("detailscreen")

}