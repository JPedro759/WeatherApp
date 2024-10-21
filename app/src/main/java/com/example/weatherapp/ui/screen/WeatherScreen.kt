package com.example.weatherapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherapp.ui.screen.components.ActionBar
import com.example.weatherapp.ui.screen.components.AirQuality
import com.example.weatherapp.ui.screen.components.DailyForecast
import com.example.weatherapp.ui.theme.ColorBackground

@Preview(showBackground = true)
@Composable
fun WeatherScreen(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = ColorBackground
    ) { paddings ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddings)
                .padding(horizontal = 24.dp, vertical = 10.dp)
        ) {
            ActionBar()
            Spacer(modifier = Modifier.height(12.dp))
            DailyForecast()
            Spacer(modifier = Modifier.height(16.dp))
            AirQuality()
        }
    }
}