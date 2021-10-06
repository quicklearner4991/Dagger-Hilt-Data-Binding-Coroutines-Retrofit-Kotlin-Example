package com.app.travelbank.main.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/app/travelbank/main/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/app/travelbank/repository/Repository;", "(Lcom/app/travelbank/repository/Repository;)V", "countryLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/app/travelbank/model/getexpenses/GetExpenseResponseModelItem;", "getCountry", "loadCountries", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.app.travelbank.repository.Repository repository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem>> countryLiveData = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.app.travelbank.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem>> getCountry() {
        return null;
    }
    
    private final void loadCountries() {
    }
}