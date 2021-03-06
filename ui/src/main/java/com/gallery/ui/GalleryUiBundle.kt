package com.gallery.ui

import android.graphics.Color
import android.os.Bundle
import android.os.Parcelable
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GalleryUiBundle(
        /**
         * 预览toolbar返回是否刷新数据
         */
        val preFinishRefresh: Boolean = true,
        /**
         * 预览back返回是否刷新数据
         */
        val preBackRefresh: Boolean = true,
        /**
         * 文件夹样式
         */
        val finderType: FinderType = FinderType.POPUP,
        /**
         * 裁剪
         */
        val cropType: CropType = CropType.CROPPER,
        /**
         * toolbar返回图标
         */
        @DrawableRes
        val toolbarIcon: Int = R.drawable.ic_gallery_ui_toolbar_back,
        /**
         * 状态栏颜色
         */
        @ColorInt
        val statusBarColor: Int = Color.parseColor("#FF02A5D2"),
        /**
         * toolbar背景色
         */
        @ColorInt
        val toolbarBackground: Int = Color.parseColor("#FF04B3E4"),
        /**
         * toolbar返回图片颜色
         */
        @ColorInt
        val toolbarIconColor: Int = Color.WHITE,
        /**
         * toolbar title
         */
        val toolbarText: String = "图片选择",
        /**
         * toolbar title颜色
         */
        @ColorInt
        val toolbarTextColor: Int = Color.WHITE,
        /**
         * toolbar elevation
         */
        val toolbarElevation: Float = 4F,
        /**
         * 文件目录文字大小
         */
        val finderTextSize: Float = 16F,
        /**
         * 文件目录文字颜色
         */
        @ColorInt
        val finderTextColor: Int = Color.WHITE,
        /**
         * 文件目录图标
         */
        @DrawableRes
        val finderTextCompoundDrawable: Int = R.drawable.ic_gallery_ui_finder,
        /**
         * 文件目录图标颜色
         */
        @ColorInt
        val finderTextDrawableColor: Int = Color.WHITE,
        /**
         * 预览文字
         */
        val preViewText: String = "预览",
        /**
         * 预览文字大小
         */
        val preViewTextSize: Float = 16F,
        /**
         * 预览文字颜色
         */
        @ColorInt
        val preViewTextColor: Int = Color.WHITE,
        /**
         * 选择文字
         */
        val selectText: String = "确定",
        /**
         * 选择文字大小
         */
        val selectTextSize: Float = 16F,
        /**
         * 选择文字颜色
         */
        @ColorInt
        val selectTextColor: Int = Color.WHITE,
        /**
         * 底部背景色
         */
        @ColorInt
        val bottomViewBackground: Int = Color.parseColor("#FF02A5D2"),
        /**
         * 目录View宽度
         */
        val listPopupWidth: Int = 600,
        /**
         * 目录View h 偏移量
         */
        val listPopupHorizontalOffset: Int = 0,
        /**
         * 目录View w 偏移量
         */
        val listPopupVerticalOffset: Int = 0,
        /**
         * 目录View背景色
         */
        @ColorInt
        val finderItemBackground: Int = Color.WHITE,
        /**
         * 目录View字体颜色
         */
        @ColorInt
        val finderItemTextColor: Int = Color.parseColor("#FF3D4040"),
        /**
         * 目录View字体个数颜色
         */
        @ColorInt
        val finderItemTextCountColor: Int = Color.parseColor("#FF3D4040"),
        /**
         * 预览页title
         */
        val preTitle: String = "选择",
        /**
         * 预览页底部提示栏背景色
         */
        @ColorInt
        val preBottomViewBackground: Int = Color.parseColor("#FF02A5D2"),
        /**
         * 预览页底部提示栏确认文字
         */
        val preBottomOkText: String = "确定",
        /**
         * 预览页底部提示栏确认文字颜色
         */
        @ColorInt
        val preBottomOkTextColor: Int = Color.WHITE,
        /**
         * 预览页底部提示栏数字文字颜色
         */
        @ColorInt
        val preBottomCountTextColor: Int = Color.WHITE,
        /**
         * 预览页底部提示栏确认文字大小
         */
        val preBottomOkTextSize: Float = 16F,
        /**
         * 预览页底部提示栏数字文字大小
         */
        val preBottomCountTextSize: Float = 16F,
        /**
         * 携带的参数
         */
        val args: Bundle = Bundle.EMPTY
) : Parcelable