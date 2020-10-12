package com.github.dhaval2404.imagepicker


import android.annotation.SuppressLint
import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.File

@SuppressLint("ParcelCreator")
@Parcelize
data class FileDetail(
    val filePath: String? = "",
    val uri: Uri ,
    val file: File
) : Parcelable