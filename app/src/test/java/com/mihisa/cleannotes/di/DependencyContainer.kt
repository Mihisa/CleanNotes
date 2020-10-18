package com.mihisa.cleannotes.di

import com.mihisa.cleannotes.business.data.NoteDataFactory
import com.mihisa.cleannotes.business.data.cache.FakeNoteCacheDataSourceImpl
import com.mihisa.cleannotes.business.data.cache.abstraction.NoteCacheDataSource
import com.mihisa.cleannotes.business.data.network.FakeNoteNetworkDataSourceImpl
import com.mihisa.cleannotes.business.data.network.abstraction.NoteNetworkDataSource
import com.mihisa.cleannotes.business.domain.model.Note
import com.mihisa.cleannotes.business.domain.model.NoteFactory
import com.mihisa.cleannotes.business.domain.util.DateUtil
import com.mihisa.cleannotes.util.isUnitTest
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

class DependencyContainer {

    private val dateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", Locale.ENGLISH)
    val dateUtil =
        DateUtil(dateFormat)
    lateinit var noteNetworkDataSource: NoteNetworkDataSource
    lateinit var noteCacheDataSource: NoteCacheDataSource
    lateinit var noteFactory: NoteFactory
    lateinit var noteDataFactory: NoteDataFactory

    init {
        isUnitTest = true // for Logger.kt
    }

    fun build() {
        this.javaClass.classLoader?.let { classLoader ->
            noteDataFactory = NoteDataFactory(classLoader)
        }
        noteFactory = NoteFactory(dateUtil)
        noteNetworkDataSource = FakeNoteNetworkDataSourceImpl(
            notesData = noteDataFactory.produceHashMapOfNotes(
                noteDataFactory.produceListOfNotes()
            ),
            deletedNotesData = HashMap(),
            dateUtil = dateUtil
        )
        noteCacheDataSource = FakeNoteCacheDataSourceImpl(
            notesData = noteDataFactory.produceHashMapOfNotes(
                noteDataFactory.produceListOfNotes()
            ),
            dateUtil = dateUtil
        )
    }

}

















