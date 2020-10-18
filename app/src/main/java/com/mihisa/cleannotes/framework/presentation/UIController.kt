package com.mihisa.cleannotes.framework.presentation

import com.mihisa.cleannotes.business.domain.state.DialogInputCaptureCallback
import com.mihisa.cleannotes.business.domain.state.Response
import com.mihisa.cleannotes.business.domain.state.StateMessageCallback


interface UIController {

    fun displayProgressBar(isDisplayed: Boolean)

    fun hideSoftKeyboard()

    fun displayInputCaptureDialog(title: String, callback: DialogInputCaptureCallback)

    fun onResponseReceived(
        response: Response,
        stateMessageCallback: StateMessageCallback
    )

}


















