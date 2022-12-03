package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UsersViewModel
@Inject constructor(
    factory: UserModelFactory
) : ViewModel() {

    val titleModel by lazy { factory.getTitleModel() }
    val userModelList by lazy { factory.getUserModelList() }
    val newUserButtonModel by lazy { factory.getNewUserButtonModel() }

//    val db = Room.databaseBuilder(
//        applicationContext,
//        AppDatabase::class.java, "database-name"
//    ).build()
//
//    val userDao = db.userDao()
//    val users: List<User> = userDao.getAll()

}
