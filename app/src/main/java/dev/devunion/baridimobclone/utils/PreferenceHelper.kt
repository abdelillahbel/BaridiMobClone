package dev.devunion.baridimobclone.utils

import android.content.Context

class PreferenceHelper(context: Context) {

    private val sharedPreferences =
        context.getSharedPreferences("data_preference", Context.MODE_PRIVATE)

    fun isFirstRun(): Boolean {
        return sharedPreferences.getBoolean("is_first_run", true)
    }

    fun setFirstRun(isFirstRun: Boolean) {
        sharedPreferences.edit().putBoolean("is_first_run", isFirstRun).apply()
    }

    fun isUserSignedIn(): Boolean {
        return sharedPreferences.getBoolean("is_user_signed_in", false)
    }
    fun setUserSignedIn(isUserSignedIn: Boolean) {
        sharedPreferences.edit().putBoolean("is_user_signed_in", isUserSignedIn).apply()
    }

}
