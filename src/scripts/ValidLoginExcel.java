package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pom.EnterTimeTrack;
import pom.LoginPage;

public class ValidLoginExcel extends BaseTest
{
	@Test
	public void testValidLogin1()
	{
	String xlpath="./testdata/TDR.xlsx";
	//DOT->current path of Java Project
	String sheet="ValidLogin";
	String un=Excel.getCellData(xlpath, sheet, 1, 0);
	String pw=Excel.getCellData(xlpath, sheet, 1, 1);
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	l.setPassword(pw);
	l.clickLoginButton();
	EnterTimeTrack e=new EnterTimeTrack(driver);
	e.clickLogoutLink();
	}
	}


