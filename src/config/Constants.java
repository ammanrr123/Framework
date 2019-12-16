package config;



public class Constants {

	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    // 'String' & 'int' are the data type for storing a type of value	
	public static final String URL = "http://ushoucwsys01vt/logon";
	public static final String Path_TestData = "C://Users//ammanrr//Test2.xlsx";
	public static final String Path_OR="C://Users//ammanrr//eclipse-workspace//Framework//src//config//OR.txt";
	public static final String File_TestData = "Test2.xlsx";
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";

	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =4 ;
	public static final int Col_ActionKeyword =5 ;
	public static final int Col_Results=3;
	public static final int Col_DataSet =6 ;
	public static final int Col_TestStepResult =7 ;
	public static final int Col_Runmode=2;
	
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	public static final String Sheet_TestCases="Test Cases";
	public static final String Sheet_TestData="Test Data";
	// List of Test Data
	public static final String UserName = "ammanrr";
	public static final String Password = "ammanrr";}