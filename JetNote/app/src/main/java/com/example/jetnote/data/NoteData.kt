package com.example.jetnote.data

import com.example.jetnote.model.Note

class NoteDataSource{
    fun loadNote():List<Note>{
        return listOf(
            Note(title = "A good Day" , description = "We went on a vaction by the covaction"),
            Note(title = "A good Day" , description = "We went on a vaction by the covaction"),
            Note(title = "A good Day" , description = "We went on a vaction by the covaction"),







        )
    }
}