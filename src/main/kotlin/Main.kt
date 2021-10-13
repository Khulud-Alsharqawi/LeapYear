fun main() {
// leap year = 1600 , not leap year =1445
   val year = 1445
    if (year >= 1582) {
        if (year % 400 == 0 ) {  println(" Leap Year")}
        else if (year % 100 == 0) { println(" Not Leap Year")    }
     else if (year % 4 == 0) {  println("  Leap Year")}
        }

    else if ( year <1582  ) {  if (year %4 ==0) {println( " its leap year!") }
        else { println(" Not Leap Year")    }

    }
}



