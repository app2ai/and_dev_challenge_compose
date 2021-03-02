package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Animal
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.coil.CoilImage

class DetailActivity : AppCompatActivity() {
    private var puppy : Animal? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        puppy = intent.getParcelableExtra("PUPPY")
        setContent {
            MyTheme {
                DetailApp()
            }
        }
    }

    @Composable
    fun DetailApp(){
        TopBar()
    }

    @Composable
    fun TopBar(){
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Row {
                            Icon(painter = painterResource(id = R.drawable.dog_icon), contentDescription = null)
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = puppy?.nickName?:"Puppy")
                        }
                    },
                    elevation = 0.dp
                )
            }
        ){
            PuppyDetailCard()
        }
    }

    @Composable
    fun PuppyDetailCard(){
        Surface(
            color = MaterialTheme.colors.primary,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                CoilImage(
                    data = puppy!!.imageUrl,
                    contentDescription = puppy!!.name,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(230.dp)
                        .clip(
                            shape = RoundedCornerShape(
                                corner = CornerSize(8.dp)
                            )
                        )
                        .shadow(elevation = 4.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Name: ${puppy!!.name}",
                    style = typography.h5
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Description:\n${puppy!!.contentDesc}",
                    style = typography.h6
                )
            }
        }
    }

    @Composable
    @Preview
    fun DetailPreview(){
        DetailApp()
    }
}