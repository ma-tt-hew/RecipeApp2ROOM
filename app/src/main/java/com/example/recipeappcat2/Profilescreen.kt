package com.example.recipeappcat2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.recipe.R

@Composable
fun ProfileScreen(meal: foodMeals) {
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize()) { BoxWithConstraints {
            Surface {
                Column(modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState),
                ) { ProfileHeader(meal, this@BoxWithConstraints.maxHeight
                    )
                    ProfileContent(meal, this@BoxWithConstraints.maxHeight)
                }
            }
        }
    }
}

@Composable
private fun ProfileHeader(meal: foodMeals, containerHeight: Dp) {

    Image(modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = meal.mealImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null)

}

@Composable
private fun ProfileContent(meal: foodMeals, containerHeight: Dp) {
    Column { Spacer(modifier = Modifier.height(8.dp))

        Title(meal)
        ProfileProperty(stringResource(R.string.type), meal.type)

        ProfileProperty(stringResource(R.string.servings), meal.mealServings.toString())

        ProfileProperty(stringResource(R.string.difficulty), meal.difficulty)

        IngredientProperty(stringResource(R.string.ingredients), meal.ingredients)

        ProfileProperty(stringResource(R.string.steps), meal.recipeGuide)

        Spacer(Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
    }
}

@Composable
private fun Title(meal: foodMeals) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)) {

        Text(text = meal.mealName,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold)
    }
}

@Composable
fun ProfileProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))

        Text(text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Visible)

        Text(text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodySmall,)
    }
}

@Composable
fun IngredientProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))

        Text(text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodySmall,)

        Text(text = value,
            modifier = Modifier.height(56.dp),
            style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Visible)
    }
}