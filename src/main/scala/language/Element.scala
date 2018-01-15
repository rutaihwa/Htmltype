package language

import scala.collection.mutable.ListBuffer

trait Element {

  /**
    * Element tag
    **/
  val tag: Tag

  /**
    * name of the Element
    **/
  final lazy val name: String = tag.name

  /**
    * Content in an element
    **/
  private val content: ListBuffer[Element] = ListBuffer()

  /**
    * `+=` Appends an element to to the content of the left element
    * @param that: Element - and element to be added to the left side element.
    *            eg foo += bar => bar will be included into foo content
    * */
   def += (that: Element): Unit = {
     // An element can not add recursively add it self.
     if (that == this) throw new UnsupportedOperationException
     else
       this.content += that
   }

  /**
    * toSting - converting an Element to a string
    * */
  override def toString: String = {
    if (tag.selfClosing) "<" + name + ">"
    else if (content.isEmpty) {
      "<" + name + "></" + name + ">"
    } else {
      val contentSting = content mkString ""
      "<" + name + ">" +
        contentSting +
        "</" + name + ">"
    }

  }
}
