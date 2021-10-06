package com.app.travelbank.main.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.travelbank.databinding.ActivityMainBinding
import com.app.travelbank.main.view.adapter.ExpensesAdapter
import com.app.travelbank.main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpUI()
        setUpObservers()
    }

    private fun setUpUI() {
        binding.countryRecyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = ExpensesAdapter(){ expense ->
                Timber.e("${expense.expenseVenueTitle} clicked")
            }
            addItemDecoration(DividerItemDecoration(this@MainActivity, LinearLayout.VERTICAL))
        }
    }

    @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
    private fun setUpObservers() {
        mainViewModel.getCountry().observe(this, { expensesList ->
            expensesList?.let {
                var total = 0.0
                if (it.size > 0) {
                    for (expense in expensesList){
                        total += expense.amount
                    }
                    binding.tvTotalExpense.text = "Total: $total$"
                    binding.countryRecyclerview.apply {
                        with(adapter as ExpensesAdapter) {
                            expenses = it
                            notifyDataSetChanged()
                        }
                    }
                } else {
                    Timber.e("Data empty")
                }

            }
        })
    }
}
