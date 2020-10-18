package com.mihisa.cleannotes.framework.datasource.preferences

class PreferenceKeys {

    companion object{

        // Shared Preference Files:
        const val NOTE_PREFERENCES: String = "com.mihisa.cleannotes.notes"

        // Shared Preference Keys
        val NOTE_FILTER: String = "${NOTE_PREFERENCES}.NOTE_FILTER"
        val NOTE_ORDER: String = "${NOTE_PREFERENCES}.NOTE_ORDER"

    }
}