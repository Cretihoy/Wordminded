package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.lifecycle.ViewModel
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UsersViewModel
@Inject constructor(
    factory: UserModelFactory
) : ViewModel() {

    val titleModel by lazy { factory.getTitleModel() }
    val userModelList = mutableListOf(listOf<UserModel>())
    val newUserButtonModel by lazy { factory.getNewUserButtonModel() }


//    val db = Room.databaseBuilder(
//        applicationContext,
//        AppDatabase::class.java, "database-name"
//    ).build()
//
//    val userDao = db.userDao()
//    val users: List<User> = userDao.getAll()

}
