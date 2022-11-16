package com.cretihoy.wordminded.compose.presentation.components.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.cretihoy.wordminded.R

@Composable
fun ImageView(
    model: ImageModel? = null,
    modifier: Modifier = Modifier
) {
    model?.src?.let {
        Image(
            modifier = modifier
                .fillMaxWidth(),
            contentDescription = null,
            painter = painterResource(it)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewImage() {
    val model = ImageModel(
        src = R.drawable.logo
    )
    ImageView(model)
}