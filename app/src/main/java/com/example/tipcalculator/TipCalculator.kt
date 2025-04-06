package com.example.tipcalculator

fun main(){
    println("Enter the bill  amount:")
    val billInput = readLine()
    val billAmount = billInput?.toDoubleOrNull()

    // check if the bill amount is valid
    if(billAmount==null|| billAmount<0 ){
        println("Invalid input, try again")
        return
    }

    println("Enter the tip percentage:")
    val tipInput = readLine()
    val tipPercentage = tipInput?.toDoubleOrNull()

    //check if the tip percentage is valid
    if(tipPercentage == null || tipPercentage<0){
        println("Invalid input, try again")
        return
    }
    //Calculate the tip
    var tip  = (billAmount * tipPercentage)/100

    println("Do you want to round the tip?(yes/no):")
    val roundInput = readLine()

   if(roundInput.equals("yes", ignoreCase = true)){
       tip = kotlin.math.ceil(tip)
   }

    var totalAmount = billAmount + tip // calculates the total amount

    //display results
    println("Tip Amount : ${"%.2f".format(tip)}")
    println("Total Amount to pay : ${"%.2f".format(totalAmount)}")
    
}