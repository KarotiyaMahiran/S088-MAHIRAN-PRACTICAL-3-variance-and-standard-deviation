import scala.util.Random
import math.sqrt

object VarianceStdDev {
  def main(args: Array[String]): Unit = {

    // Generate 5 random numbers between 01 and 12
    val numbers = List.fill(5)(Random.nextInt(12) + 1)

    // Calculate Mean
    val mean = numbers.sum.toDouble / numbers.length

    // Calculate Variance
    val variance = numbers.map(x => math.pow(x - mean, 2)).sum / numbers.length

    // Calculate Standard Deviation
    val stdDev = sqrt(variance)

    // Display Results
    println("Random Numbers: " + numbers)
    println("Mean = " + mean)
    println("Variance = " + variance)
    println("Standard Deviation = " + stdDev)
  }
}





