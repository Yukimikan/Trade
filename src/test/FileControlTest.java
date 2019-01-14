package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.FileControl;

class FileControlTest extends TestCase {

	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	void testReadCSVdata() {

//		String infilepath = null;
//		int startline = 0;
//		int maxrow = 0;
//		int count=0;
//
//		//正常系
//		try {
//			//1
//			count = 1;
//			startline = 0;
//			maxrow = 1;
//			infilepath= common.StockTradeAnalysisSystem.Workpath;
//			ArrayList<String> list = new ArrayList<String>();
//			list = FileControl.readCSVdata(infilepath ,startline, maxrow);
//			assertEquals(count, list.size());
//		}catch(IOException e) {
//			//スルーして続行する
//		}

		//異常系
	//	fail("まだ実装されていません");
	}

	@Test
	void testfilereader() {
		String workpath = "C:\\pleiades\\workspace\\MyWebApp\\src\\test\\";
		String infile01_path = workpath + "testfile\\count0.csv";
		String infile02_path = workpath + "testfile\\count1.csv";
		String infile03_path = workpath + "testfile\\count2.csv";

		int startline = 0;
		int maxrow = 0;
		int count=0;
		ArrayList<Testparam> testCaselist = new ArrayList<>();
		ArrayList<String> list = new ArrayList<String>();

		//正常系
		try {
			//1 書き換え予定
			Testparam t= new Testparam();
			t.setInparam(1, 0, 1, 0);
			t.setF(infile01_path);
			count = 0; startline = 0; maxrow = 1;
			File file = new File(infile01_path);

			list = FileControl.filereader(t.getF(), t.getStartline(), t.getMaxrow());
			assertEquals(t.getRowcount(), list.size());

		}catch(Exception e) {
			fail("1 :例外発生");
		}

		try {
			//2
			count = 1; startline = 0; maxrow = 1;
			File file = new File(infile02_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertEquals(count, list.size());

		}catch(Exception e) {
			fail("2: 例外発生");
		}

		try {
			//3
			count = 2; startline = 0; maxrow = 2;
			File file = new File(infile03_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertEquals(count, list.size());

		}catch(Exception e) {
			fail("3 :例外発生");
		}

		//異常系
		try {
			//4
			count = 0; startline = 0; maxrow = 1;
			File file = null;

			list = FileControl.filereader(file ,startline, maxrow);
			fail("4 :例外未処理");
		}catch(NullPointerException e) {
			//スルー
		}catch(Exception e) {
			fail("4 :例外発生");
		}

		try {
			//5
			count = 1; startline = 0; maxrow = 1;
			File file = null;

			list = FileControl.filereader(file ,startline, maxrow);
			fail("5 :例外未処理");

		}catch(NullPointerException e) {
			//スルー
		}catch(Exception e) {
			fail("5: 例外発生");
		}

		try {
			//6
			count = 2; startline = 0; maxrow = 2;
			File file = null;

			list = FileControl.filereader(file ,startline, maxrow);
			fail("6 :例外未処理");
		}catch(NullPointerException e) {
			//スルー
		}catch(Exception e) {
			fail("6 :例外発生");
		}

		try {
			//7
			startline = -1; maxrow = 1;
			File file = new File(infile01_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertNull(list);

		}catch(Exception e) {
			fail("7 :例外発生");
		}

		try {
			//8
			startline = -1; maxrow = 1;
			File file = new File(infile02_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertNull(list);

		}catch(Exception e) {
			fail("8 :例外発生");
		}

		try {
			//9
			startline = -1; maxrow = 1;
			File file = new File(infile03_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertNull(list);

		}catch(Exception e) {
			fail("9 :例外発生");
		}


		try {
			//10
			startline = 0; maxrow = -1;
			File file = new File(infile01_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertNull(list);

		}catch(Exception e) {
			fail("10 :例外発生");
		}

		try {
			//11
			startline = 0; maxrow = -1;
			File file = new File(infile02_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertNull(list);

		}catch(Exception e) {
			fail("11 :例外発生");
		}

		try {
			//12
			startline = 0; maxrow = -1;
			File file = new File(infile03_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertNull(list);

		}catch(Exception e) {
			fail("12 :例外発生");
		}

		try {
			//13
			count = 1; startline = 2; maxrow = 1;
			File file = new File(infile02_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertNull(list);

		}catch(Exception e) {
			fail("13: 例外発生");
		}

		try {
			//14
			count = 1; startline = 0; maxrow = 0;
			File file = new File(infile02_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertNull(list);

		}catch(Exception e) {
			fail("14: 例外発生");
		}

		try {
			//15
			count = 2; startline = 0; maxrow = 1;
			File file = new File(infile03_path);

			list = FileControl.filereader(file ,startline, maxrow);
			assertEquals(count, list.size());

		}catch(Exception e) {
			fail("15: 例外発生");
		}

		try {
			//16
			//デバッグ実行で、実行中に操作対象ファイルを削除or リネームする
			count = 2; startline = 0; maxrow = 2;
			File file = new File(infile03_path);

			list = FileControl.filereader(file ,startline, maxrow);
//			実行時に使用
//			fail("16 :例外未処理");

		}catch(IOException e) {
			//スルー
		}catch(Exception e) {
			fail("16: 例外発生");
		}
	}

}

class Testparam{
	private static int caseNo;
	private int startline;
	private int maxrow;
	private int rowcount;
	private File f;

	public Testparam() {
		this.caseNo = 0;
		this.startline = 0;
		this.maxrow = 0;
		this.f = null;
	}

	public void setInparam(int caseNo, int startline, int maxrow, int rowcount) {
		this.caseNo = caseNo;
		this.startline = startline;
		this.maxrow = maxrow;
		this.rowcount = rowcount;
	}

	public int getStartline() {
		return startline;
	}
	public void setStartline(int startline) {
		this.startline = startline;
	}
	public int getMaxrow() {
		return maxrow;
	}
	public static int getCaseNo() {
		return caseNo;
	}

	public static void setCaseNo(int caseNo) {
		Testparam.caseNo = caseNo;
	}

	public int getRowcount() {
		return rowcount;
	}

	public void setRowcount(int rowcount) {
		this.rowcount = rowcount;
	}

	public void setMaxrow(int maxrow) {
		this.maxrow = maxrow;
	}
	public File getF() {
		return f;
	}
	public void setF(File f) {
		this.f = f;
	}
	public void setF(String infilepath) {
		this.f = new File(infilepath);
	}

}

