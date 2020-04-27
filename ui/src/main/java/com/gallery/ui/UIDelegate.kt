package com.gallery.ui

import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import com.gallery.ui.activity.GalleryActivity
import com.gallery.ui.activity.PreActivity
import com.kotlin.x.drawableExpand
import com.kotlin.x.hasLExpand
import com.kotlin.x.minimumDrawable
import com.kotlin.x.statusBarColor
import kotlinx.android.synthetic.main.gallery_activity_gallery.*
import kotlinx.android.synthetic.main.gallery_activity_preview.*

internal fun GalleryActivity.obtain(galleryUiBundle: GalleryUiBundle) {
    window.statusBarColor(galleryUiBundle.statusBarColor)

    galleryToolbar.title = galleryUiBundle.toolbarText
    galleryToolbar.setTitleTextColor(galleryUiBundle.toolbarTextColor)
    val drawable = drawableExpand(galleryUiBundle.toolbarIcon)
    drawable?.colorFilter = PorterDuffColorFilter(galleryUiBundle.toolbarIconColor, PorterDuff.Mode.SRC_ATOP)
    galleryToolbar.navigationIcon = drawable
    galleryToolbar.setBackgroundColor(galleryUiBundle.toolbarBackground)
    if (hasLExpand()) {
        galleryToolbar.elevation = galleryUiBundle.toolbarElevation
    }

    galleryFinderAll.textSize = galleryUiBundle.bottomFinderTextSize
    galleryFinderAll.setTextColor(galleryUiBundle.bottomFinderTextColor)
    galleryFinderAll.setCompoundDrawables(null, null, minimumDrawable(galleryUiBundle.bottomFinderTextCompoundDrawable, galleryUiBundle.bottomFinderTextDrawableColor), null)

    galleryPre.text = galleryUiBundle.bottomPreViewText
    galleryPre.textSize = galleryUiBundle.bottomPreViewTextSize
    galleryPre.setTextColor(galleryUiBundle.bottomPreViewTextColor)

    gallerySelect.text = galleryUiBundle.bottomSelectText
    gallerySelect.textSize = galleryUiBundle.bottomSelectTextSize
    gallerySelect.setTextColor(galleryUiBundle.bottomSelectTextColor)

    galleryBottomView.setBackgroundColor(galleryUiBundle.bottomViewBackground)
}

internal fun PreActivity.obtain(uiBundle: GalleryUiBundle) {
    window.statusBarColor(uiBundle.statusBarColor)

    preToolbar.setTitleTextColor(uiBundle.toolbarTextColor)
    val drawable = drawableExpand(uiBundle.toolbarIcon)
    drawable?.colorFilter = PorterDuffColorFilter(uiBundle.toolbarIconColor, PorterDuff.Mode.SRC_ATOP)
    preToolbar.navigationIcon = drawable
    preToolbar.setBackgroundColor(uiBundle.toolbarBackground)
    if (hasLExpand()) {
        preToolbar.elevation = uiBundle.toolbarElevation
    }

    preCount.textSize = uiBundle.preBottomCountTextSize
    preCount.setTextColor(uiBundle.preBottomCountTextColor)

    preBottomView.setBackgroundColor(uiBundle.preBottomViewBackground)
    preBottomViewSelect.text = uiBundle.preBottomOkText
    preBottomViewSelect.textSize = uiBundle.preBottomOkTextSize
    preBottomViewSelect.setTextColor(uiBundle.preBottomOkTextColor)
}