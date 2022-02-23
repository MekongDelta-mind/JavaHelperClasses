
# How to extract a zip file in Java programmatically

This is the simplest implemetation I got on net to unzip a file.

[Source LInk](https://www.codejava.net/java-se/file-io/programmatically-extract-a-zip-file-using-java)

The `java.util.zip` package provides the following classes for extracting files and directories from a ZIP archive:

* `ZipInputStream`: this is the main class which can be used for reading zip file and extracting files and directories (entries) within the archive. Here are some important usages of this class:
	* read a zip via its constructor `ZipInputStream(FileInputStream)`
	* read entries of files and directories via method `getNextEntry()`
	* read binary data of current entry via method `read(byte)`
	* close current entry via method `closeEntry()`
	* close the zip file via method `close()`
 

* `ZipEntry`: this class represents an entry in the zip file. Each file or directory is represented as a ZipEntry object. Its method `getName()` returns a String which represents path of the file/directory. The path is in the following form:
	* folder_1/subfolder_1/subfolder_2/…/subfolder_n/file.ext
         

Based on the path of a ZipEntry, we re-create directory structure when extracting the zip file.

In addition, the BufferedOutputStream class is used to write content of the current ZipEntry to a file on disk, via its method write(byte[] bytes, int offset, int length).
