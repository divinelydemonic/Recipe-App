package kr.android.recipeapppractice

sealed class Screen (
    var route : String
){
    object RecipeScreen : Screen (route = "recipeScreen")
    object DetailScreen : Screen (route = "detailScreen")
}