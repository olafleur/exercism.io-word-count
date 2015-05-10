class Phrase(s: String) {

  def removePunctuation(s: String): String = s.replaceAll("(( )?:|!|&|@|\\Q$\\E|%|\\Q^\\E)","").replaceAll(",", " ")

  def wordCount() = {
    val s2 = removePunctuation(s)

    s2.split(" ")
      .toList
      .groupBy(w => w)
      .mapValues(_.size)
  }

}
