package com.mihisa.cleannotes.di

import com.mihisa.cleannotes.framework.presentation.BaseApplication
import com.mihisa.cleannotes.framework.presentation.MainActivity
import com.mihisa.cleannotes.framework.presentation.splash.NoteNetworkSyncManager
import com.mihisa.cleannotes.framework.presentation.notedetail.NoteDetailFragment
import com.mihisa.cleannotes.framework.presentation.notelist.NoteListFragment
import com.mihisa.cleannotes.framework.presentation.splash.SplashFragment
import com.mihisa.cleannotes.notes.di.NoteViewModelModule
import dagger.BindsInstance
import dagger.Component
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@FlowPreview
@Singleton
@Component(
    modules = [
        ProductionModule::class,
        AppModule::class,
        NoteViewModelModule::class,
        NoteFragmentFactoryModule::class
    ]
)
interface AppComponent {

    val noteNetworkSync: NoteNetworkSyncManager

    @Component.Factory
    interface Factory{

        fun create(@BindsInstance app: BaseApplication): AppComponent
    }

    fun inject(mainActivity: MainActivity)

    fun inject(splashFragment: SplashFragment)

    fun inject(noteListFragment: NoteListFragment)

    fun inject(noteDetailFragment: NoteDetailFragment)
}












