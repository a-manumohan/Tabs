package com.mn.tabs.presentation.main.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.mn.tabs.R

class TotalView : FrameLayout {
    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attributes: AttributeSet) : super(context, attributes) {
        init(context)
    }

    constructor(context: Context, attributes: AttributeSet, defStyleAttr: Int) : super(context, attributes, defStyleAttr) {
        init(context)
    }


    private fun init(context: Context) {
        View.inflate(context, R.layout.view_main_total, this)
//        total.setText("manu")
        if (!isInEditMode) {
        }
    }
}
