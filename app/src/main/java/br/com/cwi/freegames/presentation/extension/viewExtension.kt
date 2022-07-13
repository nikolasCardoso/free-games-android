package br.com.cwi.freegames.presentation.extension

import android.view.View

fun View.visibleOrGone(isVisible: Boolean) {
    visibility = if(isVisible) View.VISIBLE else View.GONE
}