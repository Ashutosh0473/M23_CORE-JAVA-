package com.cg.lambdaexpression;
import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		//lambda exprn for searching the file in given of particular  exprn
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".pptx");
		File dir=new File("C:\\Users\\Ashu\\Downloads");
		File contents[]=dir.listFiles(filter);
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}
