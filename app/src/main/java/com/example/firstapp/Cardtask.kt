package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CardTask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardApp()
        }
    }
}

@Composable
fun CardApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF009688) // background color
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Top bar with app title and profile icon
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Card",
                    color = Color.White,
                    fontSize = 32.sp
                )

                // Profile icon
                Image(
                    painter = painterResource(id = R.drawable.people),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                )
            }


            Text(
                text = "Simple and easy to use app",
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 32.dp)
                    .align(Alignment.Start) // Align to start to match your design
            )

            // First row of cards
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CardItem(
                    title = "Text",
                    iconResId = R.drawable.baseline_menu_book_24,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                CardItem(
                    title = "Address",
                    iconResId = R.drawable.baseline_address_24,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Second row of cards
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CardItem(
                    title = "Character",
                    iconResId = R.drawable.character,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                CardItem(
                    title = "Bank card",
                    iconResId = R.drawable.bankcard,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Third row of cards
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CardItem(
                    title = "Password",
                    iconResId = R.drawable.key,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                CardItem(
                    title = "Logistics",
                    iconResId = R.drawable.logistics,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Settings card (full width)
            CardItem(
                title = "Settings",
                iconResId = R.drawable.settings,
                modifier = Modifier.fillMaxWidth(),
                isFullWidth = true
            )
        }
    }
}

@Composable
fun CardItem(
    title: String,
    iconResId: Int,
    modifier: Modifier = Modifier,
    isFullWidth: Boolean = false
) {
    Card(
        modifier = modifier
            .height(if (isFullWidth) 70.dp else 150.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        if (isFullWidth) {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(id = iconResId),
                    contentDescription = title,
                    modifier = Modifier.size(72.dp)
                )
                Spacer(modifier = Modifier.width(0.dp))
                Text(
                    text = title,
                    fontSize = 23.sp
                )
            }
        } else {
            // Vertical layout for other cards
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = iconResId),
                    contentDescription = title,
                    modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = title,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardAppPreview() {
    CardApp()
}