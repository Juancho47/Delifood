package dinart.control.delifood.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dinart.control.delifood.entities.Recipes

@Dao
interface RecipeDao {

    @get:Query("Select * From recipes Order by id desc")
    val allRecipes:List<Recipes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipies:Recipes)
}