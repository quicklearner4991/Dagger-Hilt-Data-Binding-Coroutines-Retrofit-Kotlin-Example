package com.app.travelbank.main.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u001b\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00062\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/app/travelbank/main/view/adapter/ExpensesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/app/travelbank/main/view/adapter/ExpensesAdapter$ViewHolder;", "listener", "Lkotlin/Function1;", "Lcom/app/travelbank/model/getexpenses/GetExpenseResponseModelItem;", "", "(Lkotlin/jvm/functions/Function1;)V", "expenses", "", "getExpenses", "()Ljava/util/List;", "setExpenses", "(Ljava/util/List;)V", "getListener", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ExpensesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.app.travelbank.main.view.adapter.ExpensesAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem, kotlin.Unit> listener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem> expenses;
    
    @javax.inject.Inject()
    public ExpensesAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem, kotlin.Unit> listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem, kotlin.Unit> getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem> getExpenses() {
        return null;
    }
    
    public final void setExpenses(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.app.travelbank.main.view.adapter.ExpensesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.app.travelbank.main.view.adapter.ExpensesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/app/travelbank/main/view/adapter/ExpensesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/app/travelbank/databinding/ExpensesItemBinding;", "(Lcom/app/travelbank/main/view/adapter/ExpensesAdapter;Lcom/app/travelbank/databinding/ExpensesItemBinding;)V", "bind", "", "expense", "Lcom/app/travelbank/model/getexpenses/GetExpenseResponseModelItem;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.app.travelbank.databinding.ExpensesItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.app.travelbank.databinding.ExpensesItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem expense) {
        }
    }
}