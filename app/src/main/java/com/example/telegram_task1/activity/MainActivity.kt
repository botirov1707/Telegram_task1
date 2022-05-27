package com.example.telegram_task1.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_task1.R
import com.example.telegram_task1.model.User
import com.example.telegram_task1.adapter.UserAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val recyclerView             = findViewById<RecyclerView>(R.id.rv_main)
        recyclerView.layoutManager   = GridLayoutManager(this, 1)
        val adapter                  = UserAdapter(prepareUserList())
        recyclerView.adapter         = adapter
    }
    private fun prepareUserList(): List<User> {
        val userList: MutableList<User> = ArrayList<User>()
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))
        userList.add(User(R.drawable.user, "Uchqun Azimboyev", "online"))

        return userList
    }

}