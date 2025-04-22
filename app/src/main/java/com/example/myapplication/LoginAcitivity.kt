package com.example.myapplication.com.example.myapplication


import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Scaffold { innerPadding ->
                InstaClone(innerPadding)
            }
        }
    }
}

@Composable
fun InstaClone(innerPadding : PaddingValues){
    Column(
        modifier =
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = Color.White)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 20.dp)
        )
        {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null ,
                        modifier = Modifier.height(30.dp).width(30.dp)

            )
            Text(text = "Andrew",
                style = TextStyle(fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline))

            Icon(
                painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                modifier = Modifier.height(39.dp).width(30.dp))




        }
        Row {
            Image(
                painter = painterResource(R.drawable.people),
                contentDescription = null,
                modifier= Modifier.
                height(120.dp).width(120.dp).clip(shape = RoundedCornerShape(180.dp))
            )


            Column {

                Text("17")
                Text("Posts")
            }
            Column {
                Text("174K")
                Text("Followers")
            }
            Column {
                Text("139")
                Text("Following")

            }

        }
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewInsta(){
    InstaClone(innerPadding = PaddingValues(0.dp))
}

