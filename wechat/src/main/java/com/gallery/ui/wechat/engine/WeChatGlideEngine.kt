package com.gallery.ui.wechat.engine

import android.graphics.Color
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gallery.core.ui.widget.GalleryImageView
import com.gallery.scan.args.ScanMinimumEntity
import com.gallery.scan.types.externalUriExpand
import com.gallery.ui.R
import com.gallery.ui.wechat.widget.WeChatGalleryItem
import com.gallery.ui.wechat.widget.WeChatPrevItem
import com.gallery.ui.wechat.widget.WeChatSelectItem

internal fun FrameLayout.displayGalleryWeChat(width: Int, height: Int, selectAll: ArrayList<ScanMinimumEntity>, galleryEntity: ScanMinimumEntity, selectView: TextView) {
    removeAllViews()
    val weChatGalleryItem = WeChatGalleryItem(context)
    weChatGalleryItem.update(galleryEntity)
    selectView.gravity = Gravity.CENTER
    selectView.setTextColor(Color.WHITE)
    if (galleryEntity.isSelected) {
        selectView.text = (selectAll.indexOf(galleryEntity) + 1).toString()
    } else {
        selectView.text = ""
    }
    Glide.with(context).load(galleryEntity.externalUriExpand).apply(RequestOptions().placeholder(R.drawable.ic_gallery_default_loading).error(R.drawable.ic_gallery_default_loading).centerCrop().override(width, height)).into(weChatGalleryItem.imageView)
    addView(weChatGalleryItem, FrameLayout.LayoutParams(width, height))
}

internal fun FrameLayout.displayGalleryThumbnails(finderEntity: ScanMinimumEntity) {
    removeAllViews()
    val imageView = GalleryImageView(context)
    Glide.with(context).load(finderEntity.externalUriExpand).apply(RequestOptions().placeholder(R.drawable.ic_gallery_default_loading).error(R.drawable.ic_gallery_default_loading).centerCrop()).into(imageView)
    addView(imageView)
}

internal fun FrameLayout.displayGalleryPrev(scanEntity: ScanMinimumEntity) {
    removeAllViews()
    val weChatPrevItem = WeChatPrevItem(context)
    weChatPrevItem.update(scanEntity)
    Glide.with(context).load(scanEntity.externalUriExpand).into(weChatPrevItem.imageView)
    addView(weChatPrevItem)
}

internal fun FrameLayout.displayGalleryPrevSelect(scanEntity: ScanMinimumEntity, idList: List<Long>, isPrev: Boolean) {
    removeAllViews()
    val weChatSelectItem = WeChatSelectItem(context)
    weChatSelectItem.update(scanEntity, idList, isPrev)
    Glide.with(context).asBitmap().load(scanEntity.externalUriExpand).apply(RequestOptions().placeholder(R.drawable.ic_gallery_default_loading).error(R.drawable.ic_gallery_default_loading).fitCenter()).into(weChatSelectItem.imageView)
    addView(weChatSelectItem)
}