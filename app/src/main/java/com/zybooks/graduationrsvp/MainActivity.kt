package com.zybooks.graduationrsvp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.zybooks.graduationrsvp.ui.theme.GraduationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GraduationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GradScreen()
                }
            }
        }
    }
}

@Composable
fun GradScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Graduation Announcement",
        lineHeight = 50.sp,
        fontSize = 50.sp,
        modifier = modifier,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        color = Color.Red
    )
}

@Preview(showBackground = true)
@Composable
fun GradPreview() {
    GraduationTheme {
        GradScreen()
    }
}