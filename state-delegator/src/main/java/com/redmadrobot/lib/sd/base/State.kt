package com.redmadrobot.lib.sd.base

import android.view.View

data class State<T>(
        val name: T,
        val viewsGroup: List<View>,
        val strategy: StateChangeStrategy<T> = ShowOnEnterGoneOnExitStrategy()
) where T : Enum<T>