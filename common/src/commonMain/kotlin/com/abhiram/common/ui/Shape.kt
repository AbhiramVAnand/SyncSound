package com.abhiram.common.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val IconShapes = Shapes(
    small = RoundedCornerShape(percent = 25),
    medium = RoundedCornerShape(percent = 40),
    large = RoundedCornerShape(percent = 75)
)

val BottomSheetsShapes = Shapes(
    medium = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp, bottomEnd = 0.dp, bottomStart = 0.dp)
)
