package com.example.creditcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.creditcard.ui.theme.CreditCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards() {
    val cards = listOf(
        CardInfo("3684 1789 2654 0989",
            "David Hussey",
            R.drawable.mastercard,
            R.drawable.cardback1
            ),

        CardInfo("6904 2786 4765 1735",
            "John Smith",
            R.drawable.visa,
            R.drawable.cardback2
        ),

        CardInfo("0893 2785 1949 3679",
            "Steve Parker",
            R.drawable.rupay_logo,
            R.drawable.cardback3
        ),

        CardInfo("4829 1006 2267 8404",
            "Philip Bones",
            R.drawable.mastercard,
            R.drawable.cardback4
        ),

        CardInfo("9975 3901 0040 3388",
            "San Michael",
            R.drawable.visa,
            R.drawable.cardback1
        )
    )

    LazyColumn(modifier = Modifier
        .fillMaxHeight()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)){

        items(cards) {
            card -> CreditCard(cardInfo = card)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DisplayCardsPreview() {
    CreditCardTheme {
        DisplayCards()
    }
}