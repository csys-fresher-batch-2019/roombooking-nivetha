package com.onlineroom.util;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {

	public static void WriteToFile(String File,String Content)throws IOException
 
	{
		Path path=Paths.get(File);
		byte[] bytes=Content.getBytes();
		Files.write(path,bytes);
	}

}
