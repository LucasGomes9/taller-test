package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.ViewAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.model.ListItem

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var recylcerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recylcerView = binding.recyclerView
        recylcerView.layoutManager = LinearLayoutManager(this)


        val items = listOf(
            ListItem("Item 1", "First Item"),
            ListItem("Item 2", "Second Item"),
            ListItem("Item 3", "Third Item"),
            ListItem("Item 45152352", "Fourth Item"),
            ListItem("Item 41312", "Fourth Item"),
            ListItem("Item 45135235", "Fourth Item"),
            ListItem("Item 4654645", "Fourth Item"),
            ListItem("Item 41414", "Fourth Item"),
            ListItem("Item 45432534", "Fourth Item"),
            ListItem("Item 41431241", "Fourth Item"),
            ListItem("Item 43245234513", "Fourth Item"),
            ListItem("Item 44235321452", "Fourth Item"),
            ListItem("Item 464356534", "Fourth Item"),
            ListItem("Item 3424234", "Fourth Item"),
            ListItem("Item 46565", "Fourth Item"),
            ListItem("Item 412412412", "Fourth Item"),
            ListItem("Item 4235235", "Fourth Item"),
            ListItem("Item 4521352352", "Fourth Item"),
            ListItem("Item 45465656", "Fourth Item"),
            ListItem("Item 451251251", "Fourth Item"),
            ListItem("Item 443124124", "Fourth Item"),
            ListItem("Item 45125125", "Fourth Item"),
            ListItem("Item 413412312", "Fourth Item"),
            ListItem("Item 45436534634", "Fourth Item"),
            ListItem("Item 4343423", "Fourth Item"),
            ListItem("Item 46565", "Fourth Item"),
            ListItem("Item 44151521", "Fourth Item"),
            ListItem("Item 412312", "Fourth Item"),
            ListItem("Item 434", "Fourth Item"),
        )

        recylcerView.adapter = ViewAdapter(this, items)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}