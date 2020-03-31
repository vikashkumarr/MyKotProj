package com.example.mykot

fun main() {

    var nums = intArrayOf(10, 20, 30, 40, 50)       // If you knw the values
    // IntArray(5)                                 // If you don't knw the value of array like dynamic
    println(nums.size)                          // Array Size

    nums.set(1, 100)                             // Setting 100 @ index 1
    println(nums.get(4))                        // get the value from @ index 4
    for (num in nums)
        print("$num \t")
}