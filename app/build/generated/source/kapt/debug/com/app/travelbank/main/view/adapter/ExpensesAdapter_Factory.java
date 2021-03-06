// Generated by Dagger (https://dagger.dev).
package com.app.travelbank.main.view.adapter;

import com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ExpensesAdapter_Factory implements Factory<ExpensesAdapter> {
  private final Provider<Function1<? super GetExpenseResponseModelItem, Unit>> listenerProvider;

  public ExpensesAdapter_Factory(
      Provider<Function1<? super GetExpenseResponseModelItem, Unit>> listenerProvider) {
    this.listenerProvider = listenerProvider;
  }

  @Override
  public ExpensesAdapter get() {
    return newInstance(listenerProvider.get());
  }

  public static ExpensesAdapter_Factory create(
      Provider<Function1<? super GetExpenseResponseModelItem, Unit>> listenerProvider) {
    return new ExpensesAdapter_Factory(listenerProvider);
  }

  public static ExpensesAdapter newInstance(
      Function1<? super GetExpenseResponseModelItem, Unit> listener) {
    return new ExpensesAdapter(listener);
  }
}
