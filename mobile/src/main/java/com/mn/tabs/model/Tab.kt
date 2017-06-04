package com.mn.tabs.model

import android.os.Parcel
import android.os.Parcelable
import paperparcel.PaperParcel

@PaperParcel
data class Tab(
        val name: String,
        val timestamp: Long,
        val items: List<TabItem>
) : Parcelable {
    companion object {
        @JvmField val CREATOR = PaperParcelTab.CREATOR
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        PaperParcelTab.writeToParcel(this, dest, flags)
    }

    override fun describeContents() = 0
}
