abstract class Notification
case class Email(sourceEmail: String, title: String, body: String) extends Notification
case class SMS(sourceNumber: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification

// do not need new keyword to initilize
val emailFromJohn = Email("john@gmail.com", "Happy New Year", "Content")

// constructor parameters of case classes are treated as public values and can be accessed directly

val title = emailFromJohn.title
println(title)

val edited = emailFromJohn.copy(title = "new title", body = "hehe")
println(edited)
// case class can not mutate fields directly. use a var before a field. copy is allowed
// equals and toString is implemented

// pattern matching

def showNotification(notification: Notification): String = {
  notification match {
    case Email(email, title, _) => 
      "Got an email from " + email + "with title: " + title
    case SMS(number, message) =>
      s"""Got an SMS from $number !Message: $message"""
    case VoiceRecording(name, link) =>
      s"""Got a Voice Recording from $name !Click here: $link"""
  }
}

val someSms = SMS("123456", "Hi, are you there?")
val someVr = VoiceRecording("Tom", "vr/id/1")
println(showNotification(someSms))
println(showNotification(someVr))

// if guards