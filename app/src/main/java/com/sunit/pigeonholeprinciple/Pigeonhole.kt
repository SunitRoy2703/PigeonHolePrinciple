package com.sunit.pigeonholeprinciple

 class Pigeonhole {

     fun findPplusOne(n : Int, m : Int): Int{

        var pOne = (n-1).toInt()/m;

        return pOne;

    }



    fun Calculate(pOne_ : Int, n_ : Int, m_ : Int){
        var pOne = pOne_;

        pOne = (n_ - 1)/m_;
        pOne + 1;
    }

}