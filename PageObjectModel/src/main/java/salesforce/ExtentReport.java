package salesforce;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport extends BaseClass {
	  static BaseClass bm = new BaseClass();
public static ExtentReports reports;
public static ExtentTest logger;
public static   void extentRep() throws IOException {
	//driver=bm.initialisation();
	SimpleDateFormat simpledateformatter = new SimpleDateFormat("'sampledemo_'yyyyMMddHHmm'.html'");
	Date currentDate =new Date();
	String filename = simpledateformatter.format(currentDate);
	String path = prop.getProperty("path")+filename;
	reports = new ExtentReports(path);
	 logger = reports.startTest("SalesForce");
}

}
