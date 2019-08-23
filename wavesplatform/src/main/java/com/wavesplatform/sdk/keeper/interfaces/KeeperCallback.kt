/*
 * Created by Eduard Zaydel on 23/8/2019
 * Copyright © 2019 Waves Platform. All rights reserved.
 */

package com.wavesplatform.sdk.keeper.interfaces

interface KeeperCallback {
    fun onSuccess(data: String?)
    fun onFailed(errorCode: Int)

    companion object {
        const val CANCELED = 1
        const val UNKNOWN_ERROR = 2
    }
}