package com.app.travelbank.main.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.travelbank.databinding.ExpensesItemBinding
import com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem
import javax.inject.Inject

class ExpensesAdapter @Inject constructor(val listener: (GetExpenseResponseModelItem) -> Unit) : RecyclerView.Adapter<ExpensesAdapter.ViewHolder>() {
    var expenses: List<GetExpenseResponseModelItem> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            ExpensesItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(expenses[position])
        holder.itemView.setOnClickListener {
            listener(expenses[position])
        }
    }


    override fun getItemCount(): Int = expenses.size

    inner class ViewHolder(private val binding: ExpensesItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(expense: GetExpenseResponseModelItem) {
            binding.apply {
                nameTextview.text = expense.expenseVenueTitle
                capitalTextview.text = expense.created
            }
        }
    }
}