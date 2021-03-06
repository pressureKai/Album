package com.gallery.ui.wechat.widget

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.kotlin.expand.view.hideExpand
import androidx.kotlin.expand.view.showExpand
import com.gallery.core.delegate.ScanEntity
import com.gallery.ui.wechat.R
import kotlinx.android.synthetic.main.layout_select_wechat_item.view.*

class WeChatSelectItem @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        addView(View.inflate(context, R.layout.layout_select_wechat_item, null))
        setBackgroundColor(Color.BLACK)
    }

    val imageView: ImageView
        get() = selectWeChatImageView

    private val gifView: ImageView
        get() = selectWeChatGif

    private val videoView: ImageView
        get() = selectWeChatVideo

    private val view: View
        get() = selectWeChatView

    fun update(scanEntity: ScanEntity, idList: List<Long>, isPrev: Boolean) {
        gifView.visibility = if (scanEntity.isGif) View.VISIBLE else View.GONE
        videoView.visibility = if (scanEntity.isVideo) View.VISIBLE else View.GONE
        if (!isPrev) {
            view.hideExpand()
            return
        }
        idList.find { it == scanEntity.id }?.let {
            view.showExpand()
        } ?: view.hideExpand()
    }

}