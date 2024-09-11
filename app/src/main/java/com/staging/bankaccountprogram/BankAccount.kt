package com.staging.bankaccountprogram

import java.time.temporal.TemporalAmount

class BankAccount (val accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("Credited $amount, Balance is $balance")
    }

    fun withdraw(amount: Double){
        if(balance<amount){
            println("You do not have enough balance in account.")
        }else{
            balance -= amount
            transactionHistory.add("Withdrew $amount, Balance is $balance")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction History for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
}