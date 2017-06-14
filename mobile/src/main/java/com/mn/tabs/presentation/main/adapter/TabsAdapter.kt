package com.mn.tabs.presentation.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.mn.tabs.presentation.main.view.TabView
import com.mn.tabs.presentation.main.viewmodel.PresentationTab

class TabsAdapter(val tabs: List<PresentationTab>) : RecyclerView.Adapter<TabsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val tabView = TabView(parent.context)
        tabView.layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        return ViewHolder(tabView)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(tabs[position])
    }

    override fun getItemCount(): Int {
        return tabs.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(tab: PresentationTab) {
            (itemView as TabView).bind(tab)
        }
    }
}