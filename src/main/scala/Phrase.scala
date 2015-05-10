class Phrase(s: String) {
  def wordCount() =
    s.split(" ")
      .toList
      .groupBy(w => w)
      .mapValues(_.size)
}
