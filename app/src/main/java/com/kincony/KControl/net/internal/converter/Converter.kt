package com.kincony.KControl.net.internal.converter

import com.kincony.KControl.net.internal.interfaces.ResponseBody
import java.net.InetSocketAddress

interface Converter<F, T> {
    fun convert(address: InetSocketAddress?, value: F?): T?

    open abstract class Factory {
        abstract fun requestBodyConverter(): Converter<String, String>

        abstract fun responseBodyConverter(): Converter<String, ResponseBody>
    }
}

