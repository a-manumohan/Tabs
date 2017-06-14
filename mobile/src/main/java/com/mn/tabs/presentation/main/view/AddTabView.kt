package com.mn.tabs.presentation.main.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.mn.tabs.R
import kotlinx.android.synthetic.main.view_add_tab.view.*

class AddTabView : FrameLayout {
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
        View.inflate(context, R.layout.view_add_tab, this)
        if (!isInEditMode) {
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        setupListeners()
    }
    private fun setupListeners() {
        add_tab.setOnClickListener {  }
    }
}