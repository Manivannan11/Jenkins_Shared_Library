def call(String filename) {
  def yaml = readYaml file: filename
  return yaml
}
