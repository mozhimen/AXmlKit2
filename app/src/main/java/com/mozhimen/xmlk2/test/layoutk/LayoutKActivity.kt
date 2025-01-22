package com.mozhimen.uicorekprotest.layoutk

import android.view.View
import com.mozhimen.basick.elemk.activity.bases.BaseActivityVB
import com.mozhimen.basick.utilk.exts.start
import com.mozhimen.uicorekprotest.databinding.ActivityLayoutkBinding

class LayoutKActivity : BaseActivityVB<ActivityLayoutkBinding>() {

    fun goLayoutKGridFill(view: View) {
        start<LayoutKGridFillActivity>()
    }

    fun goLayoutKGridFillMove(view: View) {
        start<LayoutKGridFillMoveActivity>()
    }

    fun goLayoutKTimeLine(view: View) {
        start<LayoutKTimeLineActivity>()
    }
}