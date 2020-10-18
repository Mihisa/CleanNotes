package com.mihisa.cleannotes.business.interactors.notedetail

import com.mihisa.cleannotes.business.interactors.common.DeleteNote
import com.mihisa.cleannotes.framework.presentation.notedetail.state.NoteDetailViewState

// Use cases
class NoteDetailInteractors (
    val deleteNote: DeleteNote<NoteDetailViewState>,
    val updateNote: UpdateNote
)














