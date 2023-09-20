package dev.haato.sarah.utils

import java.util.Deque

object DequeExtensions {

    inline fun <reified T>  Deque<T>.tryPeek(): T? {
        return try { peek() } catch(_: Throwable) { null }
    }

}