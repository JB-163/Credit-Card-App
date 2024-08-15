package com.example.creditcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.creditcard.ui.theme.CreditCardTheme

@Composable
fun CreditCard(cardInfo: CardInfo) {
    Card(
        modifier = Modifier.height(200.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box() {
            Image(
                painter = painterResource(id = cardInfo.backgroungImage),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )

            Box(modifier = Modifier.padding(15.dp).fillMaxSize()) {
                Image(painter = painterResource(id = cardInfo.providerImage),
                    contentDescription = null,
                    modifier = Modifier
                        .width(80.dp)
                        .align(alignment = Alignment.TopStart))

                Column(modifier = Modifier.align(alignment = Alignment.BottomStart)) {

                    Text(text = cardInfo.cardNumber,
                        fontSize = 18.sp,
                        letterSpacing = 1.1.sp)

                    Text(text = cardInfo.cardHolder,
                        fontSize = 18.sp,
                        letterSpacing = 1.1.sp)
                }
            }
        }


    }

}
