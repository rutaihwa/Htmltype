package language

/**
  * Exports some language elements
  * */
object Elements {

  /**
    * An html element
    * */
  val html: html = new html
  val br: Elements.br = new br

  class html extends Element{
    override val tag: Tag = Tags.html
  }

  class br extends Element {
    override val tag: Tag = Tags.br
  }

}
