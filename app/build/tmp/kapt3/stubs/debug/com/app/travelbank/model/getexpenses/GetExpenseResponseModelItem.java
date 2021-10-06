package com.app.travelbank.model.getexpenses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\bW\b\u0086\b\u0018\u00002\u00020\u0001B\u00c3\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010 \u001a\u00020\f\u0012\u0006\u0010!\u001a\u00020\f\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020\u0001\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\f\u0012\u0006\u0010\'\u001a\u00020\u0001\u0012\u0006\u0010(\u001a\u00020\f\u0012\u0006\u0010)\u001a\u00020\f\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020\f\u00a2\u0006\u0002\u0010-J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\fH\u00c6\u0003J\t\u0010[\u001a\u00020\fH\u00c6\u0003J\t\u0010\\\u001a\u00020\u0013H\u00c6\u0003J\t\u0010]\u001a\u00020\u0013H\u00c6\u0003J\t\u0010^\u001a\u00020\u0013H\u00c6\u0003J\t\u0010_\u001a\u00020\bH\u00c6\u0003J\t\u0010`\u001a\u00020\fH\u00c6\u0003J\t\u0010a\u001a\u00020\u0001H\u00c6\u0003J\t\u0010b\u001a\u00020\fH\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\fH\u00c6\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\fH\u00c6\u0003J\t\u0010k\u001a\u00020\fH\u00c6\u0003J\t\u0010l\u001a\u00020\fH\u00c6\u0003J\t\u0010m\u001a\u00020\fH\u00c6\u0003J\t\u0010n\u001a\u00020\u0001H\u00c6\u0003J\t\u0010o\u001a\u00020\bH\u00c6\u0003J\t\u0010p\u001a\u00020\bH\u00c6\u0003J\t\u0010q\u001a\u00020\fH\u00c6\u0003J\t\u0010r\u001a\u00020\u0001H\u00c6\u0003J\t\u0010s\u001a\u00020\fH\u00c6\u0003J\t\u0010t\u001a\u00020\fH\u00c6\u0003J\t\u0010u\u001a\u00020+H\u00c6\u0003J\t\u0010v\u001a\u00020\fH\u00c6\u0003J\t\u0010w\u001a\u00020\bH\u00c6\u0003J\t\u0010x\u001a\u00020\bH\u00c6\u0003J\t\u0010y\u001a\u00020\fH\u00c6\u0003J\t\u0010z\u001a\u00020\fH\u00c6\u0003J\u000f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\t\u0010|\u001a\u00020\fH\u00c6\u0003J\u008f\u0003\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\f2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\f2\b\b\u0002\u0010\'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\fH\u00c6\u0001J\u0013\u0010~\u001a\u00020\b2\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0013H\u00d6\u0001J\n\u0010\u0081\u0001\u001a\u00020\fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0011\u0010\u0010\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00107R\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00107R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u0016\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0011\u0010\u0017\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00107R\u0011\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0019\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00107R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010/R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0011\u0010\u001c\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00107R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00101R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0011\u0010 \u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00107R\u0011\u0010!\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00107R\u0011\u0010\"\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00107R\u0011\u0010#\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00107R\u0011\u0010$\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010DR\u0011\u0010%\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00103R\u0011\u0010&\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00107R\u0011\u0010\'\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010DR\u0011\u0010(\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00107R\u0011\u0010)\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00107R\u0011\u0010*\u001a\u00020+\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010,\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00107\u00a8\u0006\u0082\u0001"}, d2 = {"Lcom/app/travelbank/model/getexpenses/GetExpenseResponseModelItem;", "", "amount", "", "attachments", "", "Lcom/app/travelbank/model/getexpenses/Attachment;", "autoConverted", "", "billable", "corporateCard", "created", "", "currencyCode", "customFields", "customerName", "date", "description", "distance", "", "distanceRate", "estimatedDistance", "excluded", "expenseCategoryId", "expenseReportId", "expenseVenueTitle", "fxAmount", "fxRate", "id", "lineItems", "logs", "mileageStops", "mileageType", "reportingStatus", "source", "status", "syncedCardId", "syncedCardIsVirtual", "tripBudgetCategory", "tripId", "type", "updated", "user", "Lcom/app/travelbank/model/getexpenses/User;", "userId", "(DLjava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;DDLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/app/travelbank/model/getexpenses/User;Ljava/lang/String;)V", "getAmount", "()D", "getAttachments", "()Ljava/util/List;", "getAutoConverted", "()Z", "getBillable", "getCorporateCard", "getCreated", "()Ljava/lang/String;", "getCurrencyCode", "getCustomFields", "getCustomerName", "getDate", "getDescription", "getDistance", "()I", "getDistanceRate", "getEstimatedDistance", "getExcluded", "getExpenseCategoryId", "getExpenseReportId", "()Ljava/lang/Object;", "getExpenseVenueTitle", "getFxAmount", "getFxRate", "getId", "getLineItems", "getLogs", "getMileageStops", "getMileageType", "getReportingStatus", "getSource", "getStatus", "getSyncedCardId", "getSyncedCardIsVirtual", "getTripBudgetCategory", "getTripId", "getType", "getUpdated", "getUser", "()Lcom/app/travelbank/model/getexpenses/User;", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class GetExpenseResponseModelItem {
    private final double amount = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.app.travelbank.model.getexpenses.Attachment> attachments = null;
    private final boolean autoConverted = false;
    private final boolean billable = false;
    private final boolean corporateCard = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currencyCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> customFields = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customerName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final int distance = 0;
    private final int distanceRate = 0;
    private final int estimatedDistance = 0;
    private final boolean excluded = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String expenseCategoryId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object expenseReportId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String expenseVenueTitle = null;
    private final double fxAmount = 0.0;
    private final double fxRate = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> lineItems = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> logs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> mileageStops = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mileageType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reportingStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object syncedCardId = null;
    private final boolean syncedCardIsVirtual = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tripBudgetCategory = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object tripId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updated = null;
    @org.jetbrains.annotations.NotNull()
    private final com.app.travelbank.model.getexpenses.User user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem copy(double amount, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.travelbank.model.getexpenses.Attachment> attachments, boolean autoConverted, boolean billable, boolean corporateCard, @org.jetbrains.annotations.NotNull()
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> customFields, @org.jetbrains.annotations.NotNull()
    java.lang.String customerName, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int distance, int distanceRate, int estimatedDistance, boolean excluded, @org.jetbrains.annotations.NotNull()
    java.lang.String expenseCategoryId, @org.jetbrains.annotations.NotNull()
    java.lang.Object expenseReportId, @org.jetbrains.annotations.NotNull()
    java.lang.String expenseVenueTitle, double fxAmount, double fxRate, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> logs, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> mileageStops, @org.jetbrains.annotations.NotNull()
    java.lang.String mileageType, @org.jetbrains.annotations.NotNull()
    java.lang.String reportingStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.Object syncedCardId, boolean syncedCardIsVirtual, @org.jetbrains.annotations.NotNull()
    java.lang.String tripBudgetCategory, @org.jetbrains.annotations.NotNull()
    java.lang.Object tripId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated, @org.jetbrains.annotations.NotNull()
    com.app.travelbank.model.getexpenses.User user, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public GetExpenseResponseModelItem(double amount, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.travelbank.model.getexpenses.Attachment> attachments, boolean autoConverted, boolean billable, boolean corporateCard, @org.jetbrains.annotations.NotNull()
    java.lang.String created, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> customFields, @org.jetbrains.annotations.NotNull()
    java.lang.String customerName, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int distance, int distanceRate, int estimatedDistance, boolean excluded, @org.jetbrains.annotations.NotNull()
    java.lang.String expenseCategoryId, @org.jetbrains.annotations.NotNull()
    java.lang.Object expenseReportId, @org.jetbrains.annotations.NotNull()
    java.lang.String expenseVenueTitle, double fxAmount, double fxRate, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> logs, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> mileageStops, @org.jetbrains.annotations.NotNull()
    java.lang.String mileageType, @org.jetbrains.annotations.NotNull()
    java.lang.String reportingStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.Object syncedCardId, boolean syncedCardIsVirtual, @org.jetbrains.annotations.NotNull()
    java.lang.String tripBudgetCategory, @org.jetbrains.annotations.NotNull()
    java.lang.Object tripId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated, @org.jetbrains.annotations.NotNull()
    com.app.travelbank.model.getexpenses.User user, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.travelbank.model.getexpenses.Attachment> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.travelbank.model.getexpenses.Attachment> getAttachments() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getAutoConverted() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getBillable() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getCorporateCard() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getCustomFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getDistance() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getDistanceRate() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getEstimatedDistance() {
        return 0;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getExcluded() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpenseCategoryId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getExpenseReportId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpenseVenueTitle() {
        return null;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double getFxAmount() {
        return 0.0;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double getFxRate() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getLineItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getLogs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getMileageStops() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMileageType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReportingStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSyncedCardId() {
        return null;
    }
    
    public final boolean component30() {
        return false;
    }
    
    public final boolean getSyncedCardIsVirtual() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTripBudgetCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTripId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.travelbank.model.getexpenses.User component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.travelbank.model.getexpenses.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
}