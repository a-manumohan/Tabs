package com.mn.tabs.presentation.main.view

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.mn.tabs.R
import com.mn.tabs.presentation.main.adapter.TabsAdapter
import com.mn.tabs.presentation.main.viewmodel.PresentationTab
import kotlinx.android.synthetic.main.view_tabs_list.view.*

class TabsListView : FrameLayout {
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
        View.inflate(context, R.layout.view_tabs_list, this)
        if (!isInEditMode) {
            tabs_list.layoutManager = LinearLayoutManager(getContext())
        }
    }

    fun bind(tabs: List<PresentationTab>) {
        showTabs(tabs)
    }

    private fun showTabs(tabs: List<PresentationTab>) {
        tabs_list.adapter = TabsAdapter(tabs)
    }
}
