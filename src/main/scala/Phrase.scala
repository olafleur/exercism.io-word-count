class Phrase(s: String) {
  def wordCount() =
    s.split(" ")
      .map(_ -> 1)
      .toMap
}
