package dev.kalnik.kotestandroid

import android.graphics.Color
import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent

class MyViewModel(
    private val hsbToColorConverter: (FloatArray) -> Int = Color::HSVToColor
) : ViewModel(), KoinComponent {

}