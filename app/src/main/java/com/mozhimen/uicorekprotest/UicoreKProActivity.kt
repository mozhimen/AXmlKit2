package com.mozhimen.uicorekprotest

import android.view.View
import com.mozhimen.basick.elemk.activity.bases.BaseActivityVB
import com.mozhimen.basick.utilk.exts.start
import com.mozhimen.uicorekprotest.databinding.ActivityUicorekProBinding
import com.mozhimen.uicorekprotest.layoutk.LayoutKActivity
import com.mozhimen.uicorekprotest.viewk.ViewKActivity

class UicoreKProActivity : BaseActivityVB<ActivityUicorekProBinding>() {
    fun goLayoutK(view: View) {
        start<LayoutKActivity>()
    }

    fun goViewK(view: View) {
        start<ViewKActivity>()
    }
}