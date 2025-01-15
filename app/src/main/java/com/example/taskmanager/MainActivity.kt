package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TaskComplete(
                        modifier = Modifier.padding(innerPadding),
                        firstText = "Task Completed",
                        secondText = "Congratulations on completing your task!",
                        image = painterResource(R.drawable.ic_task_completed)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskComplete(
    modifier: Modifier = Modifier,
    firstText: String,
    secondText: String,
    image: Painter
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null
            )
            Text(
                text = firstText,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 24.dp)
                    .padding(bottom = 8.dp)
            )

            Text(
                text = secondText,
                modifier = Modifier,
                fontStyle = FontStyle.Italic,
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true, name = "Task Complete Preview")
@Composable
fun TaskCompletePreview() {
    val image = painterResource(R.drawable.ic_task_completed)
    TaskComplete(
        modifier = Modifier.padding(16.dp),
        firstText = "Task Completed",
        secondText = "Congratulations on completing your task!",
        image = image
    )
}
