package dojo

import cats._
import cats.data._
import cats.implicits._

case class Person(firstName: String, lastName: String, age: Int)

case class Form(firstName: String, lastName: String, age: Int)

sealed trait ValidationError
case class AgeGreaterThanHundred(age: Int) extends ValidationError
case class FirstNameLongerThanFiftyChars(name: String) extends ValidationError

object Person {

  def fromForm(form: Form): ValidatedNel[ValidationError, Person] = ???
}
