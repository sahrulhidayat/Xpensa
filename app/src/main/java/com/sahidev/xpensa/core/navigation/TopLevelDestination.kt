package com.sahidev.xpensa.core.navigation

import androidx.annotation.DrawableRes
import com.sahidev.xpensa.R

enum class TopLevelDestination(
    @DrawableRes val iconId: Int,
    val title: String
) {
    HOME(
        iconId = R.drawable.ic_home_outline,
        title = "Home"
    ),
    HISTORY(
    iconId = R.drawable.ic_swap,
    title = "History"
    ),
    BLANK(
    iconId = R.drawable.ic_blank,
    title = "Blank"
    ),
    RECURRING(
    iconId = R.drawable.ic_credit_card_outline,
    title = "Recurring"
    ),
    PROFILE(
    iconId = R.drawable.ic_person_outline,
    title = "Profile"
    )
}