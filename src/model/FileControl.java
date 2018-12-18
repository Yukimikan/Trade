package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileControl {

	public static ArrayList<String> readCSVdata(String infilepath, int startline , int maxrow)
			throws IOException{

		ArrayList<String> list = new ArrayList<>();
		File f = new File(infilepath);

		try {
			list = filereader(f, startline, maxrow);
		}catch(IOException e) {
			throw e;
		}
		return list;
	}

	public static ArrayList<String> filereader(File f, int startline, int maxline)
			throws IOException{

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		ArrayList<String> list = new ArrayList<>();
		int line_cnt;
		String line;
		String l;

		for (line_cnt = 0; line_cnt <= maxline ;line_cnt++) {

			line = br.readLine();

			//読み取り不可ならループ抜ける
			if(line == null){
				break;
			}

			if(line_cnt >= startline) {

				//文字化け防止のReadロジック
				byte[] b= line.getBytes();
				l = new String(b,"UTF-8");
				list.add(l);

			}

		}
		fr.close();
		br.close();

		return list;
	}

}
