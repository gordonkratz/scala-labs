package org.scalalabs.basic.lab01
import scala.language.implicitConversions
/**
 * The goal of this exercise is to get familiar basic OO constructs in scala
 *
 * Fix the code so that the unit test 'CurrencyExerciseTest' passes.
 *
 * In order for the tests to pass you need to do the following:
 * 
 * Exercise 1:
 * - Create a class Euro
 * - Provide it with two constructor parameters: euro:Int, cents:Int
 * - Provide the cents field with default value: 0
 * - Provide an immutable field named: inCents that converts euro + cents into cents.
 * - Create a method named: + that adds another Euro
 * - Create a method named: * that multiplies an Euro
 * - Create an object Euro with a factory method named: fromCents that creates an Euro based on cents.
 * 
 * Exercise 2:
 * - Create an abstract class Currency
 * - Provide it with one constructor parameter: symbol:String
 * - Extend the previously created Euro class from Currency
 * - Override the toString method of Euro to represent the following String:
 *   -> symbol + ': ' + euro + ',' + cents.  E.g: EUR 200,05
 * - In case the cents are 0 use this representation:
 *   -> symbol + ': ' + euro + ',--. E.g.: EUR 200.--
 *   
 * Exercise 3:
 * - Mix the Ordered trait in Euro
 * - Implement the compare method  
 * 
 * Exercise 4:
 * - Provide an implicit class that adds a *(euro:Euro) method to Euro
 * - Create a new currency Dollar
 * - Provide a conversion method that converts from Euro to Dollar
 */
class Euro {

}