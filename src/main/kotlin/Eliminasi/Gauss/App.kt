package Eliminasi.Gauss

import java.util.Scanner

fun main() {
    val input=Scanner(System.`in`)

    val a=Array(100,{IntArray(100)})
    val b=IntArray(100)
    val x=IntArray(100)

    print("Masukkan Nilai N = ")
    val n=input.nextInt()

    for (i in 1..n){
        println("Baris ke $i")
        for (j in 1..n){
            print("Masukkan Elemen [$i]][$j] = ")
            a[i][j]=input.nextInt()
        }
        print("Masukkan Nilai Vektor b[$i] = ")
        b[i]=input.nextInt()
    }

    x[n]=b[n]/a[n][n]
    for (k in n-1 downTo 1){
        var sigma=0
        for (j in k+1..n){
            sigma=sigma+a[k][j]*x[j]
        }
        x[k]=(b[k]-sigma)/a[k][k]
    }

    for (i in 1..n){
        println("variabel ke $i "+x[i])
    }

}