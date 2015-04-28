package com.felcx.method;

import java.io.File;

import com.felcx.interfaces.IBaseExcute;

public class ShowFiles implements IBaseExcute{

	/**
	 * 递归遍历所有文件
	 * @param f
	 * @param level
	 */
	private void showAllFiles(File f,int level){
		String preStr = "";    
        for (int i = 0; i < level; i++) {    
            preStr += "-";    
        }    
            
        File[] childs = f.listFiles(); //listFiles()返回目录下的所有文件.   
        for (int i = 0; i < childs.length; i++) {    
            System.out.println(preStr + childs[i].getName());    
            if (childs[i].isDirectory()) { //isDirectory()判断是否为目录   
                showAllFiles(childs[i], level + 1);    
            }    
        }  
	}
	/**
	 * 显示目录下所有文件名
	 * @param path
	 */
	private void showFiles(String path){
		File[] files=new File(path).listFiles();
		String result="";
		for(File cell : files){
			String name=cell.getName().substring(0,cell.getName().indexOf('.'));
			result+=name+",";
			//System.out.println(cell.getName());
		}
		System.out.println(result);
	}
	@Override
	public void excuter() throws Exception {
		showFiles("C:\\Windows\\Fonts");
		//showAllFiles(new File("C:\\Windows"), 1);
	}

}
