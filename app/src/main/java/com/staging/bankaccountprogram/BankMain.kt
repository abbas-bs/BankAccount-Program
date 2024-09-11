package com.staging.bankaccountprogram

fun main() {
    val accountOfAbbas = BankAccount("Abbas", 230.00)
    accountOfAbbas.deposit(254.00)
    accountOfAbbas.withdraw(25.00)

    accountOfAbbas.displayTransactionHistory()
}