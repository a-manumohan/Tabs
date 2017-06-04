package com.mn.tabs.model

import android.os.Parcel
import android.os.Parcelable
import paperparcel.PaperParcel

@PaperParcel
data class TabItem(
        val amout: Double,
        val timestamp: Long,
        val note: String
) : Parcelable {

    companion object {
        @JvmField val CREATOR = PaperParcelTabItem.CREATOR
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        PaperParcelTabItem.writeToParcel(this, dest, flags)
    }
}
