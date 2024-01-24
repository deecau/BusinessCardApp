package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManager()
                }
            }
        }
    }
}

@Composable
fun TaskManager() {
    // Main column layout for the screen
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFf7e4dc)) // Set the background color for the screen
    ) {
        Spacer(modifier = Modifier.height(160.dp))

        // Middle row with profile information
        Box(
            modifier = Modifier
                .size(width = 150.dp, height = 200.dp) // Set the desired size for the image
                .background(MaterialTheme.colorScheme.secondary), // Set the background color
        ) {
            Image(
                painter = painterResource(id = R.drawable.profilepic),
                contentDescription = null
            )
        }

        Text(
            text = "Joanna Chan",
            fontSize = 40.sp,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
        )

        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFa30000)
        )

        // Bottom row with contact information
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 28.dp, start = 80.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
        ) {
            // Contact item rows
            Row(
                modifier = Modifier
                    .clip(MaterialTheme.shapes.medium)
                    .padding(10.dp)
            ) {
                // Phone Icon
                Icon(
                    painter = painterResource(id = R.drawable.phone), // Replace with your icon resource
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    tint = Color.Unspecified,
                )

                // Phone number Text
                Text(
                    text = "+1 234-456-7890",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }

            Row(
                modifier = Modifier
                    .clip(MaterialTheme.shapes.medium)
                    .padding(10.dp)
            ) {
                // Connection Icon
                Icon(
                    painter = painterResource(id = R.drawable.conection), // Replace with your icon resource
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    tint = Color.Unspecified,
                )

                // Contact information
                Text(
                    text = "@AndroidDev",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }

            Row(
                modifier = Modifier
                    .clip(MaterialTheme.shapes.medium)
                    .padding(10.dp)
            ) {
                // Email Icon
                Icon(
                    painter = painterResource(id = R.drawable.email), // Replace with your icon resource
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    tint = Color.Unspecified,
                )

                // Email Address
                Text(
                    text = "joanna.chan@android.com",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    BusinessCardAppTheme {
        TaskManager()
    }
}