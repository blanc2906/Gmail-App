package com.example.gmailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Email(
    val sender: String,
    val title: String,
    val preview: String,
    val initial: String
)
class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {
    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val letterText: TextView = itemView.findViewById(R.id.letterText)
        val senderTextView: TextView = itemView.findViewById(R.id.senderTextView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val previewTextView: TextView = itemView.findViewById(R.id.previewTextView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.letterText.text = email.initial
        holder.senderTextView.text = email.sender
        holder.titleTextView.text = email.title
        holder.previewTextView.text = email.preview
    }
    override fun getItemCount() = emailList.size
}