package com.lajeet.beatify.introAndAuth.presentation.composables.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun AuthContainerPreview() {
    AuthContainer()
}

@Composable
fun AuthContainer() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Google")
        Text(text = "Facebook")
    }
}