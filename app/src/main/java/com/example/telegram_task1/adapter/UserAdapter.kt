package com.example.telegram_task1.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_task1.R
import com.example.telegram_task1.model.User
import com.google.android.material.imageview.ShapeableImageView

class UserAdapter(private val userList: List<User>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_OPTION_VIEW = 0
    private val TYPE_USER_VIEW = 1

    override fun getItemViewType(position: Int): Int {
        return if (position <= 1) {
            TYPE_OPTION_VIEW
        } else {
            TYPE_USER_VIEW
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_OPTION_VIEW) {
            val view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_option, parent, false)
            return OptionViewHolder(view)
        }
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user: User = userList.get(position)

        if (holder is ContactViewHolder) {
            holder.profile.setImageResource(user.image)
            holder.name.text = user.name
            if (user.last == "online") {
                holder.last_seen.setTextColor(Color.BLUE)
            } else {
                holder.last_seen.setTextColor(Color.parseColor("#90FFFFFF"))
            }
            holder.last_seen.setText(user.last)
        }

        if (holder is OptionViewHolder) {
            if (position == 0) {
                holder.icon.setImageResource(R.drawable.ic_location)
                holder.title.text = "Find People Nearby"
            } else {
                holder.icon.setImageResource(R.drawable.ic_add_person)
                holder.title.text = "Invite Friends"
            }
        }
    }

    override fun getItemCount() = userList.size

    private class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        var name: TextView = view.findViewById(R.id.tv_full_name)
        var last_seen: TextView = view.findViewById(R.id.last_seen)
    }

    private class OptionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var icon: ImageView = view.findViewById(R.id.icon)
        var title: TextView = view.findViewById(R.id.title)
    }
}