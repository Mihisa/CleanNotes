package com.mihisa.cleannotes

import com.mihisa.cleannotes.framework.datasource.cache.NoteDaoServiceTests
import com.mihisa.cleannotes.framework.datasource.network.NoteFirestoreServiceTests
import com.mihisa.cleannotes.framework.presentation.end_to_end.NotesFeatureTest
import com.mihisa.cleannotes.framework.presentation.notedetail.NoteDetailFragmentTests
import com.mihisa.cleannotes.framework.presentation.notelist.NoteListFragmentTests
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.InternalCoroutinesApi
import org.junit.runner.RunWith
import org.junit.runners.Suite


@FlowPreview
@ExperimentalCoroutinesApi
@InternalCoroutinesApi
@RunWith(Suite::class)
@Suite.SuiteClasses(
    NoteDaoServiceTests::class,
    NoteFirestoreServiceTests::class,
    NoteDetailFragmentTests::class,
    NoteListFragmentTests::class,
    NotesFeatureTest::class
)
class InstrumentationTestSuite

























