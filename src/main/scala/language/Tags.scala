package language

private [language] object Tags {

  val html: html = new html
  val br: br = new br

  /**
    * Tags traits
    * */

  /**
    * `html`
    * */
  class html extends Tag {
    override val name: String = "html"
  }

  /**
    * `br`
    * */
  class br extends Tag {

    override val name: String = "br"
    override val selfClosing: Boolean = true
  }

}