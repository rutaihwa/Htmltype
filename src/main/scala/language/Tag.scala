package language

/**
  * Tag models an Html tag.
  **/
abstract trait Tag {

  /**
    * name - name of a html tag
    * */
  val name: String

  /**
    * is the tag self enclosing
    * */
  val selfClosing: Boolean = false

}
