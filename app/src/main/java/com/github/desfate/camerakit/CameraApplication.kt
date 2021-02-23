package com.github.desfate.camerakit

import android.app.Application
import com.elvishew.xlog.LogLevel
import com.elvishew.xlog.XLog

class CameraApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // 日志工具初始化
        XLog.init(LogLevel.ALL)
    }

}