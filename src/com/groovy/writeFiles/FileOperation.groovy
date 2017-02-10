
def file = new File('newFile.txt')

println file.absolutePath
println file.size()

println "File ? ${file.isFile()}"
println "Directory ? ${file.isDirectory()}"

println file.renameTo('renameFile.txt')
println file.renameTo('newFile.txt')
