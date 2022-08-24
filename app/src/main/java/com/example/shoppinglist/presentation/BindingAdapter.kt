package com.example.shoppinglist.presentation

import androidx.databinding.BindingAdapter
import com.example.shoppinglist.R
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("errorInputName")
fun bindErrorInputName (textInputLayout: TextInputLayout, isError: Boolean){
    val massage = if (isError) {
        textInputLayout.context.getString(R.string.error_input_name)
    } else {
        null
    }
    textInputLayout.error = massage
}

@BindingAdapter("errorInputCount")
fun bindErrorInputCount (textInputLayout: TextInputLayout, isError: Boolean){
    val massage = if (isError) {
        textInputLayout.context.getString(R.string.error_input_count)
    } else {
        null
    }
    textInputLayout.error = massage
}