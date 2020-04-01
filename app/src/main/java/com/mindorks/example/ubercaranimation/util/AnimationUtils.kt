package com.mindorks.example.ubercaranimation.util

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

object AnimationUtils {

    fun polylineAnimator(): ValueAnimator {
        val valueAnimator = ValueAnimator.ofInt(0, 100)
        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = 4000
        return valueAnimator
    }

    fun carAnimator(): ValueAnimator {
        val valueAnimator = ValueAnimator.ofFloat(0f, 1f)
        valueAnimator.duration = 3000
        valueAnimator.interpolator = LinearInterpolator()
        return valueAnimator
    }

}