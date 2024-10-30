package com.example.gmailapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emailAdapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Dữ liệu mẫu
        val emailList = listOf(
            Email("Alice", "Welcome!", "Thanks for joining us!", "A"),
            Email("Bob", "New Update", "Check out our latest updates.", "B"),
            Email("Catherine", "Weekly Summary", "Here’s what happened last week.", "C"),
            Email("David", "Discount Offer!", "Get 20% off on your next purchase.", "D")
        )

        emailAdapter = EmailAdapter(emailList)
        recyclerView.adapter = emailAdapter
    }
}