package com.example.weatherapp.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import com.example.weatherapp.ui.screen.util.AirQualityData
import com.example.weatherapp.ui.screen.util.AirQualityItem
import com.example.weatherapp.ui.theme.ColorAirQualityIconTitle
import com.example.weatherapp.ui.theme.ColorSurface

@Composable
fun AirQuality(modifier: Modifier = Modifier, data: List<AirQualityItem> = AirQualityData){
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(32.dp),
        color = ColorSurface
    ) {
        Column(modifier = Modifier
            .padding(vertical = 18.dp, horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AirQualityHeader()
        }
    }
}

@Composable
private fun AirQualityHeader(modifier: Modifier = Modifier){
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_air_quality_header),
                contentDescription = null,
                tint = ColorAirQualityIconTitle,
                modifier = modifier.size(32.dp)
            )
            Text(
                text = "Air Quality",
                style = MaterialTheme.typography.titleMedium.copy(fontSize = 18.sp)
            )
        }
        RefreshButton()
    }
}

@Composable
private fun RefreshButton(modifier: Modifier = Modifier){
    Surface(
        color = ColorSurface, shape = CircleShape,
        modifier = modifier
            .size(32.dp)
            .customShadow(
                color = Color.Black,
                alpha = 0.15f,
                shadowRadius = 16.dp,
                borderRadius = 32.dp,
                offsetY = 4.dp
            )
    ) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(R.drawable.ic_refresh),
                contentDescription = "Refresh",
                modifier = modifier.size(18.dp)
            )
        }
    }
}