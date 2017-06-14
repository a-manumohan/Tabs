package com.mn.tabs.presentation.main.dialog

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mn.tabs.R
import com.mn.tabs.presentation.main.view.AddTabView
import kotlinx.android.synthetic.main.dialog_add_tab.*

class AddTabDialog : DialogFragment() {
    lateinit var addViewListener: (name: String) -> Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.dialog_add_tab, container, false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        addTabView.onAddClicked({ name -> addViewListener.invoke(name) })
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState)
    }

    fun onTabAdded(listener: (name: String) -> (Unit)) {
        this.addViewListener = listener
    }
}
